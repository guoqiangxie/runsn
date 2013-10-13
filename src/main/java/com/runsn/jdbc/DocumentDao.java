package com.runsn.jdbc;

import com.runsn.dto.User;

import java.lang.String;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
            String sql = "insert into documents (name, content, typeid, active) values('"+name+"', '"+content+"',1,1)";
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

    public static String query(int id) {
        String content = "";
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "select * from documents d where d.id = " + id;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                content = rs.getString("content");
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
        return content;
    }
}