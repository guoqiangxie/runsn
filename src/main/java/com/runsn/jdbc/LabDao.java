package com.runsn.jdbc;

import com.runsn.dto.Engineer;
import com.runsn.dto.Lab;

import java.sql.Connection;
import java.sql.Date;
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
            String sql = "select * from lab where trainTime>'"+new Date(new java.util.Date().getTime())+"'";
            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                result.add(createLab(rs));
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("查询数据失败。");
            e.printStackTrace();
        }
        return result;
    }

    private static Lab createLab(ResultSet rs) throws SQLException {
        Lab lab = new Lab();
        lab.setId(rs.getInt("id"));
        lab.setAddress(rs.getString("address"));
        lab.setContent(rs.getString("content"));
        lab.setCreateDate(rs.getDate("createDate"));
        lab.setDesc(rs.getString("labDesc"));
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
            e.printStackTrace();
        }
        return lab;
    }

    public static Integer save(Lab lab) throws Exception {
        conn = ConnectionUtil.getConnection();
        Integer result = null;
        try {
            String sql = "insert into lab(name, personNum,teacher, trainTime,address, env,labDesc,content,createDate) values('"
                    + lab.getName() + "',"
                    + lab.getPersonNum() + ",'"
                    + lab.getTeacher() + "','"
                    + lab.getTrainTime() + "','"
                    + lab.getAddress() + "','"
                    + lab.getEnv() + "','"
                    + lab.getDesc() + "','"
                    + lab.getContent() + "','"
                    + lab.getCreateDate()
                    + "')";
            st = conn.createStatement();
            st.execute(sql);
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                result = rs.getInt(1);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("保存课程数据失败。");
            e.printStackTrace();
            throw new Exception();
        }
        return result;
    }

    public static void update(Lab lab) throws Exception {
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "update lab set name='" + lab.getName()
                    + "',content='" + lab.getContent()
                    + "',personNum=" + lab.getPersonNum()
                    + ",teacher='" + lab.getTeacher()
                    + "',trainTime='" + lab.getTrainTime()
                    + "',address='" + lab.getAddress()
                    + "',env='" + lab.getEnv()
                    + "',labDesc='" + lab.getDesc()
                    + "',updateDate='" + lab.getUpdateDate()
                    + "' where id=" + lab.getId();
            st = conn.createStatement();

            st.execute(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("更新课程数据失败。");
            e.printStackTrace();
            throw new Exception("更新课程数据失败。");
        }
    }

    public static void delete(int id){
        conn = ConnectionUtil.getConnection();
        try {
            String sql = "delete from lab where id = " + id;
            st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("删除数据失败。");
            e.printStackTrace();
        }
    }
}
