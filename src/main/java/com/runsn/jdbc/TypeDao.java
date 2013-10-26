package com.runsn.jdbc;

import com.runsn.dto.DocumentType;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: TypeDao
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class TypeDao {

    static Connection conn;
    static Statement st;

    public static DocumentType query(int id) {
        conn = ConnectionUtil.getConnection();
        DocumentType type = null;
        try {
            String sql = "select * from document_type t where t.id = " + id;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                type = createType(rs);
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
        return type;
    }

    public static Integer save(DocumentType documentType) {
        conn = ConnectionUtil.getConnection();
        Integer result = null;
        try {
            String sql = "insert into document_type(title1, title1code,title2, title2code,title3, title3code,active) values('"
                    + documentType.getTitle1() + "','"
                    + documentType.getTitle1code() + "','"
                    + documentType.getTitle2() + "','"
                    + documentType.getTitle2code() + "','"
                    + documentType.getTitle3() + "','"
                    + documentType.getTitle3code() + "',"
                    + documentType.getActive()
                    + ")";
            st = conn.createStatement();
            st.execute(sql);
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                result = rs.getInt(1);
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

    public static List<DocumentType> queryByTitle1code(int title1code) {
        conn = ConnectionUtil.getConnection();
        List<DocumentType> result = new ArrayList<DocumentType>();
        try {
            String sql = "select * from document_type t where t.active=1 and t.title1code = " + title1code;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createType(rs));
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

    public static List<DocumentType> queryByTitle2code(int title2code) {
        conn = ConnectionUtil.getConnection();
        List<DocumentType> result = new ArrayList<DocumentType>();
        try {
            String sql = "select * from document_type t where t.active=1 and t.title2code = " + title2code;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createType(rs));
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

    public static List<DocumentType> queryByTitle3code(int title3code) {
        conn = ConnectionUtil.getConnection();
        List<DocumentType> result = new ArrayList<DocumentType>();
        try {
            String sql = "select * from document_type t where t.active=1 and t.title3code = " + title3code;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createType(rs));
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

    public static DocumentType queryMaxTitle3code(int title1code, int title2code) {
        conn = ConnectionUtil.getConnection();
        DocumentType documentType = new DocumentType();
        try {
            String sql = "select * from document_type where title1code=" + title1code + " and title2code=" + title2code + " and title3code=(select MAX(title3code) from document_type where title1code=" + title1code + " and title2code=" + title2code + ")";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                documentType = createType(rs);
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
        return documentType;
    }

    private static DocumentType createType(ResultSet rs) throws SQLException {
        DocumentType type = new DocumentType();
        type.setId(rs.getInt("id"));
        type.setActive(rs.getInt("active"));
        type.setTitle1(rs.getString("title1"));
        type.setTitle1code(rs.getInt("title1code"));
        type.setTitle2(rs.getString("title2"));
        type.setTitle2code(rs.getInt("title2code"));
        type.setTitle3(rs.getString("title3"));
        type.setTitle3code(rs.getInt("title3code"));
        return type;
    }
}
