package com.runsn.dto;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Title: Product
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Product implements Serializable {
    private Integer id = 0;
    private Integer typeId;
    private String typeName;
    private Integer brandId;
    private String brandName;
    private String brandDesc;
//    private Integer classId;
//    private String className;
//    private String classDesc;
    private String productDesc = "<div class=\"neirong\">\n" +
            "              <div style=\"width:480px; display:block;line-height:23px;\">\n" +
            "                  <div class=\"path\"><a href=\"product.html\">主页</a> &gt; <a href=\"product_1.html\">虚拟化基础</a> &gt; 思科</div>\n" +
            "                  <div class=\"prom\" style=\"line-height:21px; display:block; margin-top:25px;\">\n" +
            "                      <img src=\"/img/pro_icon6.jpg\" width=\"139\" height=\"177\" class=\"floatimg\" style=\"float:left; margin:0 20px 10px 0;\" />\n" +
            "                      <span><b style=\"font-size:14px; color:#1f9443;\">型号：</b>Cisco Nexus 7000 系列交换机</span><br />\n" +
            "                      <span><b style=\"font-size:14px; color:#1f9443;\">产品名称：</b>Cisco Nexus 7000 系列交换机</span><br />\n" +
            "                      <span><b style=\"font-size:14px; color:#1f9443;\">产品属性：</b>测试文字</span><br />\n" +
            "                      <span><b style=\"font-size:14px; color:#1f9443;\">产品报价：</b>测试文字</span><br />\n" +
            "         <span><b style=\"font-size:14px; color:#1f9443;\">产品简介：</b>Cisco Nexus™ 7000系列交换机最大限度地集成可扩展性和运营灵活性。Cisco Nexus 7000系列交换机是一个模块化数据中心级产品系列，适用于高度可扩展的万兆以太网网络，其交换矩阵架构的速度能扩展至15Tbps以上。 它的设计旨在满足大多数关键任务数据中心的要求，提供永续的系统运营和无所不在的虚拟化服务。Cisco Nexus 7000系列建立在一个成熟的操作系统上，借助增强特性提供实时系统升级，以及出色的可管理性和可维护性。 它的创新设计专门用于支持端到端数据中心连接，将IP、存储和IPC（进程间通讯）网络整合到单一以太网交换架构之上。<br />\n" +
            "作为第一款数据中心级交换平台，Cisco Nexus 7000系列提供集成永续性，以及专为数据中心可用性、可靠性、可扩展性和易管理性而优化的特性。<br />\n" +
            "中板平面设计支持随您的需求变化进行灵活的技术升级，以及提供持续的投资保护。<br /><br />\n" +
            "<b style=\"font-size:14px; color:#1f9443;\">特性和优势</b>\n" +
            "在Cisco® NX-OS软件的支持下，Cisco Nexus 7000系列提供一系列丰富的特性，保证系统的永续运营。有两种机箱外型可用。<br />\n" +
            "前后通风，带10个前面板接入的垂直模块插槽和一个集成电缆管理系统，能够支持新老设施中的安装、运营和冷却。<br />\n" +
            "18个前操作模块插槽，具有端到端通风能力，紧凑水平的外型，以及特别设计的集成线缆系统，方便操作并降低复杂性。<br />\n" +
            "面向数据中心的高可靠性和最高可用性设计，所有接口和控制引擎模块都采取前面板接入，冗余电源、风扇和交换矩阵模块则完全采用后端接入，以确保维护过程中布线不受影响。<br />\n" +
            "系统采用两个专用控制引擎模块；可扩展、完全分布式的交换矩阵架构最多能容纳5个后端安装的交换矩阵模块，配合机箱背板设计，整个系统能提供每插槽最高230 Gbps带宽，使10插槽外型机箱可提供7 Tbps转发能力，18插槽外型机箱可提供15 Tbps转发能力。<br />\n" +
            "中板平面设计支持随您的需求变化进行灵活的技术升级，以及提供持续的投资保护。<br />\n" +
            "</span>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "                  </div>\n" +
            "\n" +
            "\n" +
            "              </div>\n" +
            "              <div class=\"tabBox lh19\"  style=\"display:block; width:850px; margin-top:30px; position:relative; left:-175px;\">\n" +
            "                  <ul class=\"tabs\" style=\"background: url(/g/sermain_icon3.gif) repeat-x 0 21px; display:block; height:30px; padding-left:20px; width:850px;\">\n" +
            "                      <li class=\"on\" style=\"background:url(/img/sermain_icon4.png) no-repeat; width:127px; float:left; margin-right:4px; text-align:center; padding-bottom:10px; line-height:23px; height:20px; display:block; overflow:hidden; color:#333; cursor:pointer; background-position:0 -30px; padding:0; height:30px; line-height:30px; color:#fff;\">系列10插槽机箱</li>\n" +
            "                      <li style=\"background:url(/img/sermain_icon4.png) no-repeat; width:127px; float:left; margin-right:4px; text-align:center; padding-bottom:10px; line-height:23px; height:20px; display:block; overflow:hidden; color:#333; cursor:pointer;\">系列18插槽机箱</li>\n" +
            "                      <li style=\"background:url(/img/sermain_icon4.png) no-repeat; width:127px; float:left; margin-right:4px; text-align:center; padding-bottom:10px; line-height:23px; height:20px; display:block; overflow:hidden; color:#333; cursor:pointer;\">高能效设计</li>\n" +
            "                      <li style=\"background:url(/img/sermain_icon4.png) no-repeat; width:127px; float:left; margin-right:4px; text-align:center; padding-bottom:10px; line-height:23px; height:20px; display:block; overflow:hidden; color:#333; cursor:pointer;\">产品规格</li>\n" +
            "                      <li style=\"background:url(/img/sermain_icon4.png) no-repeat; width:127px; float:left; margin-right:4px; text-align:center; padding-bottom:10px; line-height:23px; height:20px; display:block; overflow:hidden; color:#333; cursor:pointer;\">软件要求</li>\n" +
            "                  </ul>\n" +
            "                  <div class=\"tabmain\" style=\"display:block;padding:20px; line-height:23px; overflow:hidden;\">\n" +
            "                      <p>拥有最多8个I/O模块插槽的Cisco Nexus 7000系列10插槽机箱最多支持256个万兆以太网或384个千兆以太网端口，能够满足大型部署的需求。\n" +
            "                          前后通风有助于确保使用Cisco Nexus 7000系列10插槽机箱能够满足热通道和冷通道部署要求，而不会增加复杂性。<br /><br />\n" +
            "                          它分别采用两个系统风扇架和两个交换矩阵风扇架进行冷却。每个风扇架都配备有冗余风扇，独立变速风扇能随着周围温度自动调整，不仅降低进行出色管理的设施的能耗，而且能实现最佳交换机运行状态。该系统设计提高冷却效率，并提供冗余功能，使得进行热插拔时不会影响系统；如果一个风扇或整个风扇架发生故障，系统能继续运行，不会对冷却能力造成重大影响。<br /><br />\n" +
            "                          集成电缆管理系统用于完全配置的系统布线，能将所有电缆整齐地放在一边或两边，以实现最大的灵活性，不妨碍任何重要组件，即使是在系统布线完好的情况下也能轻松进行维护。</p>\n" +
            "                      <p><img src=\"/img/pro_icon7.jpg\" width=\"161\" height=\"138\" style=\" float:right; margin:0 0 10px 20px;\" />\n" +
            "                          系统拥有可选的空气过滤器，有助于确保流过系统的空气清洁。添加空气过滤器能满足NEBS要求。<br /><br />\n" +
            "                          机箱顶端的一系列LED清晰地提供主要系统组件的状态显示，能提示操作员是否需要执行进一步的调查。这些LED负责报告电源、风扇、交换矩阵、控制引擎和I/O模块的状态。<br /><br />\n" +
            "                          电缆管理盖和可选的模块前门能使安装在系统中的布线和模块不受意外事件的影响。透明的前门使客户能够查看布线、模块指示灯和状态指示灯情况。</p>\n" +
            "                  </div>\n" +
            "                  <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">222222222222222</div>\n" +
            "                  <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">33333333333</div>\n" +
            "                  <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">4444444444</div>\n" +
            "                  <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">5555555555</div>\n" +
            "              </div>\n" +
            "          </div>";
    private String productName;
    private String productVersion;
    private Date createDate;
    private Date updateDate;
    private String title;
    private String keywords;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
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

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

//    public String getClassDesc() {
//        return classDesc;
//    }
//
//    public void setClassDesc(String classDesc) {
//        this.classDesc = classDesc;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
