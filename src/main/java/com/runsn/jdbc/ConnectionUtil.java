package com.runsn.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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
    private static String driverClassName;
    private static String url;
    private static String username;
    private static String password;
    private static DriverManagerDataSource driverManagerDataSource;
    private static JdbcTemplate jdbcTemplate;

    /* 获取数据库连接的函数*/
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(driverClassName);
            con = DriverManager.getConnection(
                    url, username, password);

        } catch (Exception e) {
            System.out.println("数据库连接失败。" + e.getMessage());
        }
        return con;
    }

    public static JdbcTemplate getJdbcTemplate() {
        if (jdbcTemplate != null) return jdbcTemplate;
        if (driverManagerDataSource == null) driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(driverClassName);
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setUsername(username);
        driverManagerDataSource.setPassword(password);

        if (jdbcTemplate == null) jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(driverManagerDataSource);
        return jdbcTemplate;
    }

    public static String getDriverClassName() {
        return driverClassName;
    }

    public static void setDriverClassName(String driverClassName) {
        ConnectionUtil.driverClassName = driverClassName;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        ConnectionUtil.url = url;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        ConnectionUtil.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        ConnectionUtil.password = password;
    }
}
