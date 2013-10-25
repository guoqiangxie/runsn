package com.runsn.jdbc;

import com.runsn.dto.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: ProductDao
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class ProductDao {
    static Connection conn;
    static Statement st;

    public static List<Product> queryTypeByClass(int classId) {
        conn = ConnectionUtil.getConnection();
        List<Product> result = new ArrayList<Product>();
        try {
            String sql = "select pt.id AS typeId,pb.*,pt.* " +
                    " from productclass pc, productbrand pb, producttype pt " +
                    " where pc.id=pb.classId and pb.id=pt.brandId " +
                    " and pc.id= " + classId;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createSimpleProduct(rs));
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("连接未正常关闭。");
            }
        }
        return result;
    }

    private static Product createSimpleProduct(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setBrandId(rs.getInt("brandId"));
        product.setBrandName(rs.getString("brandName"));
        product.setTypeId(rs.getInt("typeId"));
        product.setTypeName(rs.getString("typeName"));
        product.setBrandDesc(rs.getString("brandDesc"));
        return product;
    }
}
