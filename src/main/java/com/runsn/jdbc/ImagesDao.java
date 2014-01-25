package com.runsn.jdbc;

import com.runsn.dto.Images;
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
 * Title: ImagesDao
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class ImagesDao {
    static Connection conn;
    static Statement st;

    public static List<Images> queryImagesByType(int imageType) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select i.* " +
                " from images i " +
                " where i.imageType="+imageType + " order by linkYear, linkMonth,imageDetailType";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Images>>() {
            @Override
            public List<Images> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createImage(resultSet));
                }
                return result;
            }
        });
    }

    public static Images queryImagesByTypeAndDetailType(int imageType, int imageDetailType) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select i.* " +
                " from images i " +
                " where i.imageType="+imageType + " and i.imageDetailType=" + imageDetailType;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Images>() {
            @Override
            public Images extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                Images result = new Images();
                while (resultSet.next()) {
                    result = createImage(resultSet);
                }
                return result;
            }
        });
    }

    public static Images get(int id) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select i.* " +
                " from images i " +
                " where i.id=" + id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Images>() {
            @Override
            public Images extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                Images result = new Images();
                while (resultSet.next()) {
                    result = createImage(resultSet);
                }
                return result;
            }
        });
    }


    private static Images createImage(ResultSet resultSet) throws SQLException {
        Images image = new Images();
        image.setId(resultSet.getInt("id"));
        image.setEngineerId(resultSet.getInt("engineerId"));
        image.setCreateDate(resultSet.getDate("createDate"));
        image.setUpdateDate(resultSet.getDate("updateDate"));
        image.setImageDesc(resultSet.getString("imageDesc"));
        image.setImageDetailType(resultSet.getInt("imageDetailType"));
        image.setImageName(resultSet.getString("imageName"));
        image.setImageType(resultSet.getInt("imageType"));
        image.setImageUrl(resultSet.getString("imageUrl"));
        image.setLinkMonth(resultSet.getInt("linkMonth"));
        image.setLinkYear(resultSet.getInt("linkYear"));
        image.setLinkUrl(resultSet.getString("linkUrl"));
        return image;
    }

    public static Integer save(Images image) throws Exception {
        conn = ConnectionUtil.getConnection();
        Integer result = null;
        try {
            String sql = "insert into images(imageName, imageUrl, imageDesc, imageType, imageDetailType, linkYear, linkMonth, engineerId, createDate, linkUrl) values('"
                    + image.getImageName() + "','"
                    + image.getImageUrl() + "','"
                    + image.getImageDesc() + "',"
                    + image.getImageType() + ","
                    + image.getImageDetailType() + ","
                    + image.getLinkYear() + ","
                    + image.getLinkMonth() + ","
                    + image.getEngineerId() + ",'"
                    + image.getCreateDate() + "','"
                    + image.getLinkUrl() + "')";
            st = conn.createStatement();
            st.execute(sql);
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                result = rs.getInt(1);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("保存右侧课程导航栏数据失败。");
            e.printStackTrace();
            throw new Exception("保存右侧课程导航栏数据失败。");
        }
        return result;
    }

    public static void deleteByType(int imageType) {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "delete from images where imageType = " + imageType;
            st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("删除数据失败。");
            e.printStackTrace();
        }
    }

    public static void deleteByTypeAndEngineer(int imageType, Integer engineerId) {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "delete from images where imageType = " + imageType + " and engineerId=" + engineerId;
            st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("删除数据失败。");
            e.printStackTrace();
        }
    }

    public static List<Images> queryImagesByTypeAndEngineer(int imageType, int engineerId) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select i.* " +
                " from images i " +
                " where i.imageType="+imageType + " and i.engineerId=" + engineerId + " order by i.imageDetailType";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Images>>() {
            @Override
            public List<Images> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List<Images> result = new ArrayList<Images>();
                while (resultSet.next()) {
                    result.add(createImage(resultSet));
                }
                return result;
            }
        });
    }
}
