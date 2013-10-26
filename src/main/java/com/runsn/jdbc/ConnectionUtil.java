package com.runsn.jdbc;

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
public class ConnectionUtil {
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
