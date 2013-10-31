package com.runsn.jdbc;

import com.runsn.dto.Product;
import com.runsn.dto.ProductClass;

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
                    " where find_in_set(pc.id, pb.classId) and pb.id=pt.brandId " +
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
        }
        return result;
    }

    public static List<ProductClass> queryAllClass() {
        conn = ConnectionUtil.getConnection();
        List<ProductClass> result = new ArrayList<ProductClass>();
        try {
            String sql = "select * " +
                    " from productclass";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ProductClass productClass = new ProductClass();
                productClass.setId(rs.getInt("id"));
                productClass.setClassName(rs.getString("className"));
                productClass.setClassDesc(rs.getString("classDesc"));
                result.add(productClass);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
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
                product.setClassIds(rs.getString("classId"));
                result.add(product);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
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
        }
        return result;
    }

    public static List<Product> queryByBrand(int brandId) {
        conn = ConnectionUtil.getConnection();
        List<Product> result = new ArrayList<Product>();
        try {
            String sql = "select *,p.id AS productId " +
                    " from productbrand pb, producttype pt,product p " +
                    " where pb.id=pt.brandId and pt.id = p.typeId " +
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
        }
        return result;
    }

    public static List<Product> queryAll() {
        conn = ConnectionUtil.getConnection();
        List<Product> result = new ArrayList<Product>();
        try {
            String sql = "select *,p.id AS productId " +
                    " from productbrand pb, producttype pt,product p " +
                    " where pb.id=pt.brandId and pt.id = p.typeId ";
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
        }
        return result;
    }

    public static Product query(int id) {
        conn = ConnectionUtil.getConnection();
        Product result = new Product();
        try {
            String sql = "select *,p.id AS productId " +
                    " from productbrand pb, producttype pt,product p " +
                    " where pb.id=pt.brandId and pt.id = p.typeId and p.id = " + id;
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
//        product.setClassId(rs.getInt("classId"));
        if (! isSimple) {
            product.setId(rs.getInt("productId"));
//            product.setClassName(rs.getString("className"));
//            product.setClassDesc(rs.getString("classDesc"));
            product.setProductDesc(rs.getString("productDesc"));
            product.setProductName(rs.getString("productName"));
            product.setProductVersion(rs.getString("productVersion"));
            product.setTitle(rs.getString("title"));
            product.setKeywords(rs.getString("keywords"));
            product.setDescription(rs.getString("description"));
        }
        return product;
    }

    public static Integer save(Product product) throws Exception {
        conn = ConnectionUtil.getConnection();
        Integer result = null;
        try {
            String sql = "insert into product(productName, typeId, productDesc, createDate, title, keywords, description) values('"
                    + product.getProductName() + "',"
                    + product.getTypeId() + ",'"
                    + product.getProductDesc() + "','"
                    + product.getCreateDate() + "','"
                    + product.getTitle() + "','"
                    + product.getKeywords() + "','"
                    + product.getDescription() + "')";
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
        }
        return result;
    }

    public static void update(Product product) throws Exception {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "update product set productName='" + product.getProductName()
                    + "',productDesc='" + product.getProductDesc()
                    + "',title='" + product.getTitle()
                    + "',keywords='" + product.getKeywords()
                    + "',description='" + product.getDescription()
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
        }
    }

    public static void updateBrand(String classIds, Integer brandId) throws Exception {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "update productbrand set classId='" + classIds
                    + "' where id=" + brandId;
            st = conn.createStatement();

            st.execute(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("更新品牌对应基础类数据失败。");
            e.printStackTrace();
            throw new Exception("更新对应基础类数据失败。");
        }
    }

}
