package com.runsn.dto;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Title: Images
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Images implements Serializable {
    public static int IMAGE_TYPE_1 = 1; //右侧课程导航 3张图片
    public static int IMAGE_TYPE_2 = 2; //首页六宫格位置 12张图片


    public static int IMAGE_DETAIL_TYPE_11 = 11; //左上1
    public static int IMAGE_DETAIL_TYPE_12 = 12; //左上2
    public static int IMAGE_DETAIL_TYPE_21 = 21; //中上1
    public static int IMAGE_DETAIL_TYPE_22 = 22; //中上2
    public static int IMAGE_DETAIL_TYPE_31 = 31; //右上1
    public static int IMAGE_DETAIL_TYPE_32 = 32; //右上2
    public static int IMAGE_DETAIL_TYPE_41 = 41; //左下1
    public static int IMAGE_DETAIL_TYPE_42 = 42; //左下2
    public static int IMAGE_DETAIL_TYPE_51 = 51; //中下1
    public static int IMAGE_DETAIL_TYPE_52 = 52; //中下2
    public static int IMAGE_DETAIL_TYPE_61 = 61; //右下1
    public static int IMAGE_DETAIL_TYPE_62 = 62; //右下2

    private Integer id = 0;
    private Date createDate;
    private Date updateDate;
    private String imageName;
    private String imageUrl;
    private String imageDesc;
    private String linkUrl;
    private int imageType;
    private int imageDetailType;
    private int linkYear;
    private int linkMonth;
    private Integer engineerId;

    public Images(){}

    public Images(int linkYear, int linkMonth, String imageUrl) {
        this.linkYear = linkYear;
        this.linkMonth = linkMonth;
        this.imageUrl = imageUrl;
        this.imageType = 1;
        this.createDate = new Date(new java.util.Date().getTime());
    }

    public Images(String linkUrl, String imageUrl, int imageType, int imageDetailType) {
        this.linkUrl = linkUrl;
        this.imageUrl = imageUrl;
        this.imageType = imageType;
        this.imageDetailType = imageDetailType;
        this.createDate = new Date(new java.util.Date().getTime());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc;
    }

    public int getImageType() {
        return imageType;
    }

    public void setImageType(int imageType) {
        this.imageType = imageType;
    }

    public int getImageDetailType() {
        return imageDetailType;
    }

    public void setImageDetailType(int imageDetailType) {
        this.imageDetailType = imageDetailType;
    }

    public int getLinkYear() {
        return linkYear;
    }

    public void setLinkYear(int linkYear) {
        this.linkYear = linkYear;
    }

    public int getLinkMonth() {
        return linkMonth;
    }

    public void setLinkMonth(int linkMonth) {
        this.linkMonth = linkMonth;
    }

    public Integer getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(Integer engineerId) {
        this.engineerId = engineerId;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}
