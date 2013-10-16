package com.runsn.jdbc;

import com.runsn.dto.User;

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
public class UserDao {
    static Connection conn;
    static Statement st;

    public static User query(String name) {
        User user = new User();
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "select * from user u where u.name = '" + name+"'";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("用户查询数据失败。");
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("用户连接未正常关闭。");
            }
        }
        return user;
    }
}