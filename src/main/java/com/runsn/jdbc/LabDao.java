package com.runsn.jdbc;

import com.runsn.dto.Engineer;
import com.runsn.dto.Lab;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: LabDao
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class LabDao {
    static Connection conn;
    static Statement st;

    public static List<Lab> queryAll() {
        conn = ConnectionUtil.getConnection();
        List result = new ArrayList<Lab>();
        try {
            String sql = "select * from lab";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createLab(rs));
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

    private static Lab createLab(ResultSet rs) throws SQLException {
        Lab lab = new Lab();
        lab.setId(rs.getInt("id"));
        lab.setAddress(rs.getString("address"));
        lab.setContent(rs.getString("content"));
        lab.setCreateDate(rs.getDate("createDate"));
        lab.setDesc(rs.getString("desc"));
        lab.setEnv(rs.getString("env"));
        lab.setName(rs.getString("name"));
        lab.setPersonNum(rs.getInt("personNum"));
        lab.setTeacher(rs.getString("teacher"));
        lab.setTrainTime(rs.getTimestamp("trainTime"));
        lab.setUpdateDate(rs.getDate("updateDate"));
        return lab;
    }

    public static Lab query(int labId) {
        conn = ConnectionUtil.getConnection();
        Lab lab = new Lab();
        try {
            String sql = "select * from lab where id=" + labId;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lab = createLab(rs);
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
        return lab;
    }
}
