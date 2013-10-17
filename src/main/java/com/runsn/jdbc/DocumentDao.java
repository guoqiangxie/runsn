package com.runsn.jdbc;

import com.runsn.dto.Document;

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

    public static void save(String name, String content) {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "insert into documents (name, content, typeid, active) values('" + name + "', '" + content + "',1,1)";
            st = conn.createStatement();

            st.execute(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("插入页面数据失败。");
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("连接未正常关闭。");
            }
        }
    }

    public static Document query(int id) {
        conn = ConnectionUtil.getConnection();
        Document document = null;
        try {
            String sql = "select * from documents d where d.id = " + id;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                document = createDocument(rs);
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
        return document;
    }

    public static Document queryByTypeid(int typeid) {
        conn = ConnectionUtil.getConnection();
        Document document = null;
        try {
            String sql = "select * from documents d where d.typeid = " + typeid;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                document = createDocument(rs);
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
        return document;
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
        return document;
    }

    public static List<Document> queryByTitle1code(int title1code) {
        conn = ConnectionUtil.getConnection();
        List<Document> result = new ArrayList<Document>();
        try {
            String sql = "select d.* from documents d inner join document_type t on t.id=d.typeid where d.active=1 and t.active=1 and t.title1code = " + title1code;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createDocument(rs));
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

    public static List<Document> queryByTitle2code(int title1code, int title2code) {
        conn = ConnectionUtil.getConnection();
        List<Document> result = new ArrayList<Document>();
        try {
            String sql = "select d.* from documents d inner join document_type t on t.id=d.typeid where d.active=1 and t.active=1 and t.title1code = " + title1code + " and t.title2code = " + title2code;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createDocument(rs));
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

    public static List<Document> queryByTitle3code(int title1code, int title2code, int title3code) {
        conn = ConnectionUtil.getConnection();
        List<Document> result = new ArrayList<Document>();
        try {
            String sql = "select d.* from documents d inner join document_type t on t.id=d.typeid where d.active=1 and t.active=1 and t.title1code = " + title1code + " and t.title2code = " + title2code + " and t.title3code = " + title3code;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createDocument(rs));
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
}