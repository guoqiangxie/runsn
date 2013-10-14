package com.runsn.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created with IntelliJ IDEA.
 * Title: ConnectionUtil
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
//@Component
public class ConnectionUtil {
//    @Value("${jdbc.driverClassName}")
//    private static String driverClassName;
//    @Value("${jdbc.jdbc.url}")
//    private static String url;
//    @Value("${jdbc.jdbc.username}")
//    private static String username;
//    @Value("${jdbc.password}")
//    private static String password;

    /* 获取数据库连接的函数*/
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/runsn", "root", "root");

        } catch (Exception e) {
            System.out.println("数据库连接失败。" + e.getMessage());
        }
        return con;
    }
}
