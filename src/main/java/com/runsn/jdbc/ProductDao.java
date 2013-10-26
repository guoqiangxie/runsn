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
                result.add(createProduct(rs, true));
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
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

    public static List<Product> queryAllClass() {
        conn = ConnectionUtil.getConnection();
        List<Product> result = new ArrayList<Product>();
        try {
            String sql = "select * " +
                    " from productclass";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Product product = new Product();
                product.setClassId(rs.getInt("id"));
                product.setClassName(rs.getString("className"));
                result.add(product);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
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

    public static List<Product> queryAllBrand() {
        conn = ConnectionUtil.getConnection();
        List<Product> result = new ArrayList<Product>();
        try {
            String sql = "select * " +
                    " from productbrand";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Product product = new Product();
                product.setBrandId(rs.getInt("id"));
                product.setBrandName(rs.getString("brandName"));
                product.setClassId(rs.getInt("classId"));
                result.add(product);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
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

    public static List<Product> queryAllType() {
        conn = ConnectionUtil.getConnection();
        List<Product> result = new ArrayList<Product>();
        try {
            String sql = "select *,pt.id AS typeId " +
                    " from productbrand pb, producttype pt where pb.id=pt.brandId";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createProduct(rs, true));
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
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

    public static List<Product> queryByBrand(int brandId) {
        conn = ConnectionUtil.getConnection();
        List<Product> result = new ArrayList<Product>();
        try {
            String sql = "select *,p.id AS productId " +
                    " from productclass pc, productbrand pb, producttype pt,product p " +
                    " where pc.id=pb.classId and pb.id=pt.brandId and pt.id = p.typeId " +
                    " and pb.id= " + brandId;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createProduct(rs, false));
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
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

    public static List<Product> queryAll() {
        conn = ConnectionUtil.getConnection();
        List<Product> result = new ArrayList<Product>();
        try {
            String sql = "select *,p.id AS productId " +
                    " from productclass pc, productbrand pb, producttype pt,product p " +
                    " where pc.id=pb.classId and pb.id=pt.brandId and pt.id = p.typeId ";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createProduct(rs, false));
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
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

    public static Product query(int id) {
        conn = ConnectionUtil.getConnection();
        Product result = new Product();
        try {
            String sql = "select *,p.id AS productId " +
                    " from productclass pc, productbrand pb, producttype pt,product p " +
                    " where pc.id=pb.classId and pb.id=pt.brandId and pt.id = p.typeId and p.id = " + id;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result = createProduct(rs, false);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
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

    private static Product createProduct(ResultSet rs, boolean isSimple) throws SQLException {
        Product product = new Product();
        product.setBrandId(rs.getInt("brandId"));
        product.setBrandName(rs.getString("brandName"));
        product.setTypeId(rs.getInt("typeId"));
        product.setTypeName(rs.getString("typeName"));
        product.setBrandDesc(rs.getString("brandDesc"));
        product.setClassId(rs.getInt("classId"));
        if (! isSimple) {
            product.setId(rs.getInt("productId"));
            product.setClassName(rs.getString("className"));
            product.setClassDesc(rs.getString("classDesc"));
            product.setProductDesc(rs.getString("productDesc"));
            product.setProductName(rs.getString("productName"));
            product.setProductVersion(rs.getString("productVersion"));
        }
        return product;
    }

    public static Integer save(Product product) throws Exception {
        conn = ConnectionUtil.getConnection();
        Integer result = null;
        try {
            String sql = "insert into product(productName, typeId, productDesc, createDate) values('"
                    + product.getProductName() + "',"
                    + product.getTypeId() + ",'"
                    + product.getProductDesc() + "','"
                    + product.getCreateDate() + "')";
            st = conn.createStatement();
            st.execute(sql);
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                result = rs.getInt(1);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("保存产品数据失败。");
            e.printStackTrace();
            throw new Exception("保存产品数据失败。");
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

    public static void update(Product product) throws Exception {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "update product set productName='" + product.getProductName()
                    + "',productDesc='" + product.getProductDesc()
                    + "',updateDate='" + product.getUpdateDate()
                    + "' where id=" + product.getId();
            st = conn.createStatement();

            st.execute(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("更新产品数据失败。");
            e.printStackTrace();
            throw new Exception("更新产品数据失败。");
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("连接未正常关闭。");
            }
        }
    }

    public static void delete(int id){
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "delete from product where id = " + id;
            st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("删除数据失败。");
            e.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("连接未正常关闭。");
            }
        }
    }
}
