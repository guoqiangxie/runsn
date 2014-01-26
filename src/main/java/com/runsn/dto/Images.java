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
    public static int IMAGE_TYPE_3 = 3; //产品详细页右侧导航链接
    public static int IMAGE_TYPE_4 = 4; //培训课堂滚动图片
    public static int IMAGE_TYPE_5 = 5; //工程师资质图片
    public static int IMAGE_TYPE_6 = 6; //主题活动-精彩促销图片
    public static int IMAGE_TYPE_7 = 7; //主题活动-厂商&活动图片
    public static int IMAGE_TYPE_8 = 8; //主题活动-邀请函图片
    public static int IMAGE_TYPE_9 = 9; //公司 左侧 图片
    public static int IMAGE_TYPE_10 = 10; //公司 右侧 图片
    public static int IMAGE_TYPE_11 = 11; //首页滑动焦点图片

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

    public static int IMAGE_DETAIL_TYPE_1 = 1;
    public static int IMAGE_DETAIL_TYPE_2 = 2;
    public static int IMAGE_DETAIL_TYPE_3 = 3;
    public static int IMAGE_DETAIL_TYPE_4 = 4;
//    public static int IMAGE_DETAIL_TYPE_5 = 5;
//    public static int IMAGE_DETAIL_TYPE_6 = 6;
//    public static int IMAGE_DETAIL_TYPE_7 = 7;
//    public static int IMAGE_DETAIL_TYPE_8 = 8;
//    public static int IMAGE_DETAIL_TYPE_9 = 9;
//    public static int IMAGE_DETAIL_TYPE_10 =10;
//    public static int IMAGE_DETAIL_TYPE_11= 11;
//    public static int IMAGE_DETAIL_TYPE_12= 12;
//    public static int IMAGE_DETAIL_TYPE_13= 13;
//    public static int IMAGE_DETAIL_TYPE_14= 14;
//    public static int IMAGE_DETAIL_TYPE_15= 15;
//    public static int IMAGE_DETAIL_TYPE_16= 16;
//    public static int IMAGE_DETAIL_TYPE_17= 17;
//    public static int IMAGE_DETAIL_TYPE_18= 18;
//    public static int IMAGE_DETAIL_TYPE_19= 19;
//    public static int IMAGE_DETAIL_TYPE_20= 20;

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

    public Images(String imageName, String linkUrl) {
        this.imageName = imageName;
        this.linkUrl = linkUrl;
        this.createDate = new Date(new java.util.Date().getTime());
        this.imageType = 3;
    }

    public Images(String imageUrl, Integer engineerId, int imageDetailType) {
        this.imageUrl = imageUrl;
        this.engineerId = engineerId;
        this.createDate = new Date(new java.util.Date().getTime());
        this.imageType = 5;
        this.imageDetailType = imageDetailType;
    }

    public  Images(int imageType, String imageUrl, String linkUrl, int showOrder) {
        this.imageUrl = imageUrl;
        this.linkUrl = linkUrl;
        this.imageDetailType = showOrder;
        this.createDate = new Date(new java.util.Date().getTime());
        this.imageType = imageType;
    }

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

    public Images(String linkUrl, String imageUrl, int imageType, int imageDetailType, String imageDesc) {
        this.linkUrl = linkUrl;
        this.imageUrl = imageUrl;
        this.imageType = imageType;
        this.imageDetailType = imageDetailType;
        this.imageDesc = imageDesc;
        this.createDate = new Date(new java.util.Date().getTime());
    }

    public Images(String imageUrl, int imageType, int imageDetailType) {
        this.imageUrl = imageUrl;
        this.imageType = imageType;
        this.imageDetailType = imageDetailType;
        this.createDate = new Date(new java.util.Date().getTime());
    }

    public Images(String imageUrl, int imageType) {
        this.imageUrl = imageUrl;
        this.imageType = imageType;
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
