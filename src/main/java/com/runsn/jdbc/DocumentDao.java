package com.runsn.jdbc;

import com.runsn.dto.Document;
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
 * Title: UserDao
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class DocumentDao {
    static Connection conn;
    static Statement st;

    public static void save(Document document) throws Exception {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "insert into documents (name, content, title, keywords, description, typeid, active, mainLevel, createDate) values('" + document.getName() + "', '" + document.getContent() + "','" + document.getTitle() + "','" + document.getKeywords() + "','" + document.getDescription() + "'," + document.getTypeid() + "," + document.getActive() + "," + document.getMainLevel() + ",'" + document.getCreateDate() + "')";
            st = conn.createStatement();

            st.execute(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("插入页面数据失败。");
            e.printStackTrace();
            throw new Exception("插入页面数据失败.");
        }
    }

    public static void update(Document document) throws Exception {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "update documents set name='" + document.getName()
                    + "',content='" + document.getContent()
                    + "',title='" + document.getTitle()
                    + "',keywords='" + document.getKeywords()
                    + "',description='" + document.getDescription()
                    + "',typeid=" + document.getTypeid()
                    + ",active=" + document.getActive()
                    + ",updateDate='" + document.getUpdateDate()
                    + "' where id=" + document.getId();
            st = conn.createStatement();

            st.execute(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("更新服务数据失败。");
            e.printStackTrace();
            throw new Exception("更新服务数据失败。");
        }
    }

    public static Document query(int id) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select * from documents where active=1 and id = " + id + " order by updateDate desc";
        return jdbcTemplate.query(sql, new ResultSetExtractor<Document>() {
            @Override
            public Document extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                Document document = new Document();
                while (resultSet.next()) document = createDocument(resultSet);
                return document;
            }
        });
    }

    public static void delete(int id) throws Exception {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "delete from documents where id = " + id;
            st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("删除数据失败。");
            e.printStackTrace();
            throw new Exception("删除数据失败。");
        }
    }

    private static Document createDocument(ResultSet rs) throws SQLException {
        Document document = new Document();
        document.setId(rs.getInt("id"));
        document.setActive(rs.getInt("active"));
        document.setContent(rs.getString("content"));
        document.setDescription(rs.getString("description"));
        document.setKeywords(rs.getString("keywords"));
        document.setName(rs.getString("name"));
        document.setTitle(rs.getString("title"));
        document.setTypeid(rs.getInt("typeid"));
        document.setMainLevel(rs.getInt("mainLevel"));
        document.setCreateDate(rs.getDate("createDate"));
        document.setUpdateDate(rs.getDate("updateDate"));
        return document;
    }

    public static List<Document> queryByTitle1code(int title1code) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select d.* from documents d inner join document_type t on t.id=d.typeid where d.active=1 and t.active=1 and t.title1code = " + title1code + " order by d.updateDate desc, createDate desc";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Document>>() {
            @Override
            public List<Document> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createDocument(resultSet));
                }
                return result;
            }
        });
    }

    public static List<Document> queryByTitle2code(int title1code, int title2code) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select d.* from documents d inner join document_type t on t.id=d.typeid where d.active=1 and t.active=1 and t.title1code = " + title1code + " and t.title2code = " + title2code;
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Document>>() {
            @Override
            public List<Document> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createDocument(resultSet));
                }
                return result;
            }
        });
    }
}