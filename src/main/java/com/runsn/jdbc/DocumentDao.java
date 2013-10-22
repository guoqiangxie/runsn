package com.runsn.jdbc;

import com.runsn.dto.Document;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
            String sql = "insert into documents (name, content, title, keywords, description, typeid, active, mainLevel) values('" + document.getName() + "', '" + document.getContent() + "','" + document.getTitle() + "','" + document.getKeywords() + "','" + document.getDescription() + "'," + document.getTypeid() + "," + document.getActive() + "," + document.getMainLevel() + ")";
            st = conn.createStatement();

            st.execute(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("插入页面数据失败。");
            throw new Exception("插入页面数据失败.");
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("连接未正常关闭。");
            }
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
                    + ",mainLevel=" + document.getMainLevel()
                    + " where id=" + document.getId();
            st = conn.createStatement();

            st.execute(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("更新页面数据失败。");
            throw new Exception("更新页面数据失败。");
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
            String sql = "select * from documents where active=1 and id = " + id;
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
            throw new Exception("删除数据失败。");
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("连接未正常关闭。");
            }
        }
    }

    public static List<Document> queryByTypeid(int typeid) {
        conn = ConnectionUtil.getConnection();
        List result = new ArrayList();
        try {
            String sql = "select * from documents where active=1 and typeid = " + typeid;
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
        //xgqtodo 时间转换
        document.setCreateDate(new Date());
        document.setUpdateDate(new Date());
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