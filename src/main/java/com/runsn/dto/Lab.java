package com.runsn.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * Title: Lab
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Lab implements Serializable {
    static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private Integer id = 0;
    private String name;
    private int personNum;
    private String teacher;
    private String address;
    private String env;
    private String desc;
    private String content;
    private Timestamp trainTime;
    private Date createDate;
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonNum() {
        return personNum;
    }

    public void setPersonNum(int personNum) {
        this.personNum = personNum;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(Timestamp trainTime) {
        this.trainTime = trainTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getTrainTimeStr() {
        String dateStr = df.format(trainTime);
        Calendar cd = Calendar.getInstance();
        cd.setTime(trainTime);
        int mydate = cd.get(Calendar.DAY_OF_WEEK);
        switch (mydate) {
            case 1:
                dateStr += "(星期日)";
                break;
            case 2:
                dateStr += "(星期一)";
                break;
            case 3:
                dateStr += "(星期二)";
                break;
            case 4:
                dateStr += "(星期三)";
                break;
            case 5:
                dateStr += "(星期四)";
                break;
            case 6:
                dateStr += "(星期五)";
                break;
            default:
                dateStr += "(星期六)";
                break;
        }
        return dateStr;
    }
}
