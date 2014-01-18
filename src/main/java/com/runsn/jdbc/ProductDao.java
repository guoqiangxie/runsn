package com.runsn.jdbc;

import com.runsn.dto.Product;
import com.runsn.dto.ProductClass;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

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
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select pt.id AS typeId,pb.*,pt.* " +
                " from productclass pc, productbrand pb, producttype pt " +
                " where find_in_set(pc.id, pb.classId) and pb.id=pt.brandId " +
                " and pc.id= " + classId;
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {
            @Override
            public List<Product> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createProduct(resultSet, true));
                }
                return result;
            }
        });
    }

    public static List<Product> queryTypeByBrand(int brandId) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select pt.id AS typeId,pb.*,pt.* " +
                " from productbrand pb, producttype pt " +
                " where pb.id=pt.brandId " +
                " and pb.id= " + brandId;
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {
            @Override
            public List<Product> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createProduct(resultSet, true));
                }
                return result;
            }
        });
    }

    public static List<ProductClass> queryAllClass() {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select * from productclass";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<ProductClass>>() {
            @Override
            public List<ProductClass> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    ProductClass productClass = new ProductClass();
                    productClass.setId(resultSet.getInt("id"));
                    productClass.setClassName(resultSet.getString("className"));
                    productClass.setClassDesc(resultSet.getString("classDesc"));
                    result.add(productClass);
                }
                return result;
            }
        });
    }

    public static List<Product> queryAllBrand() {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select * from productbrand";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {
            @Override
            public List<Product> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    Product product = new Product();
                    product.setBrandId(resultSet.getInt("id"));
                    product.setBrandName(resultSet.getString("brandName"));
                    product.setClassIds(resultSet.getString("classId"));
                    result.add(product);
                }
                return result;
            }
        });
    }

    public static List<Product> queryAllType() {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select *,pt.id AS typeId from productbrand pb, producttype pt where pb.id=pt.brandId";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {
            @Override
            public List<Product> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createProduct(resultSet, true));
                }
                return result;
            }
        });
    }

    public static List<Product> queryByBrand(int brandId) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select *,p.id AS productId " +
                " from productbrand pb, producttype pt,product p " +
                " where pb.id=pt.brandId and pt.id = p.typeId " +
                " and pb.id= " + brandId;
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {
            @Override
            public List<Product> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createProduct(resultSet, false));
                }
                return result;
            }
        });
    }

    public static List<Product> queryAll() {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select *,p.id AS productId " +
                " from productbrand pb, producttype pt,product p " +
                " where pb.id=pt.brandId and pt.id = p.typeId ";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {
            @Override
            public List<Product> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createProduct(resultSet, false));
                }
                return result;
            }
        });
    }

    public static Product query(int id) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select *,p.id AS productId " +
                " from productbrand pb, producttype pt,product p " +
                " where pb.id=pt.brandId and pt.id = p.typeId and p.id = " + id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Product>() {
            @Override
            public Product extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                Product documentType = new Product();
                while (resultSet.next()) documentType = createProduct(resultSet, false);
                return documentType;
            }
        });
    }

    public static List<ProductClass> queryProductClassByBrandId(int brandId) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select pc.* " +
                " from productclass pc, productbrand pb " +
                " where find_in_set(pc.id, pb.classId) and pb.id="+brandId;
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<ProductClass>>() {
            @Override
            public List<ProductClass> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createProductClass(resultSet));
                }
                return result;
            }
        });
    }

    public static ProductClass queryClass(int classId) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select * " +
                " from productclass " +
                " where id = " + classId;
        return jdbcTemplate.query(sql, new ResultSetExtractor<ProductClass>() {
            @Override
            public ProductClass extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                ProductClass productClass = new ProductClass();
                while (resultSet.next()) productClass = createProductClass(resultSet);
                return productClass;
            }
        });
    }

    private static ProductClass createProductClass(ResultSet rs) throws SQLException {
        ProductClass productClass = new ProductClass();
        productClass.setId(rs.getInt("id"));
        productClass.setClassName(rs.getString("className"));
        productClass.setClassDesc(rs.getString("classDesc"));
        return productClass;
    }

    private static Product createProduct(ResultSet rs, boolean isSimple) throws SQLException {
        Product product = new Product();
        product.setBrandId(rs.getInt("brandId"));
        product.setBrandName(rs.getString("brandName"));
        product.setTypeId(rs.getInt("typeId"));
        product.setTypeName(rs.getString("typeName"));
        product.setBrandDesc(rs.getString("brandDesc"));
        if (!isSimple) {
            product.setId(rs.getInt("productId"));
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

    public static void delete(int id) {
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
