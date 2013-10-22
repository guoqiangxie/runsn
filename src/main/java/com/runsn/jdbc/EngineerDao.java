package com.runsn.jdbc;

import com.runsn.dto.Engineer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: EngineerDao
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class EngineerDao {
    static Connection conn;
    static Statement st;

    public static List<Engineer> queryAll() {
        conn = ConnectionUtil.getConnection();
        List result = new ArrayList<Engineer>();
        try {
            String sql = "select * from engineer";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createEngineer(rs));
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

    private static Engineer createEngineer(ResultSet rs) throws SQLException {
        Engineer engineer = new Engineer();
        engineer.setAge(rs.getInt("age"));
        engineer.setAptitude(rs.getString("aptitude"));
        engineer.setExperiences(rs.getString("experiences"));
        engineer.setId(rs.getInt("id"));
        engineer.setImage(rs.getString("image"));
        engineer.setName(rs.getString("name"));
        engineer.setTitle(rs.getString("title"));
        return engineer;
    }
}
