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

    public static Engineer query(int id) {
        conn = ConnectionUtil.getConnection();
        Engineer result = new Engineer();
        try {
            String sql = "select * from engineer where id=" + id;
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result = createEngineer(rs);
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

    public static void delete(int id){
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "delete from engineer where id = " + id;
            st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("删除数据失败。");
            e.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("连接未正常关闭。");
            }
        }
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
        engineer.setCreateDate(rs.getDate("createDate"));
        engineer.setUpdateDate(rs.getDate("updateDate"));
        return engineer;
    }

    public static Integer save(Engineer engineer) throws Exception {
        conn = ConnectionUtil.getConnection();
        Integer result = null;
        try {
            String sql = "insert into engineer(name, age, title, aptitude, experiences, image, createDate, updateDate) values('"
                    + engineer.getName() + "',"
                    + engineer.getAge() + ",'"
                    + engineer.getTitle() + "','"
                    + engineer.getAptitude() + "','"
                    + engineer.getExperiences() + "','"
                    + engineer.getImage() + "','"
                    + engineer.getCreateDate() + "','"
                    + engineer.getUpdateDate() + "')";
            st = conn.createStatement();
            st.execute(sql);
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                result = rs.getInt(1);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("保存工程师数据失败。");
            e.printStackTrace();
            throw new Exception("保存工程师数据失败。");
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

    public static void update(Engineer engineer) throws Exception {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "update engineer set name='" + engineer.getName()
                    + "',aptitude='" + engineer.getAptitude()
                    + "',image='" + engineer.getImage()
                    + "',experiences='" + engineer.getExperiences()
                    + "',age=" + engineer.getAge()
                    + ",title='" + engineer.getTitle()
                    + "',updateDate='" + engineer.getUpdateDate()
                    + "' where id=" + engineer.getId();
            st = conn.createStatement();

            st.execute(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("更新页面数据失败。");
            e.printStackTrace();
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
}
