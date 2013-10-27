<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Page-Enter" content="blendTrans(Duration=1)" />
<meta http-equiv="Page-Exit" content="blendTrans(Duration=1)" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<title>产品 | 网站后台管理系统</title>
<link href="/css/main.css" rel="stylesheet" type="text/css" />
<link href="/css/news.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="wrap">
    <%@include file="left.jsp"%>
  <div class="content">
    <div class="c_top">
      <h2>网站后台管理系统</h2>
      <span><a href="main.html" class="on">中文</a></span> </div>
    <div class="c_main">

 <div class="main2">
  <div class="tit">
    <h3>编辑服务内容</h3>
    <span></span></div>
     <form action="/admin/submitProduct" method="POST" id="serviceForm">
        <div class="tmain b5 btop">
    <div class="txt">标题&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
      <input class="w500 b5" id="title" name="productName" type="text" value="${product.productName}"/>
    </div>
            <c:if test="${product.id==0}">
    <div class="txt">基础类：
        <select id="classId" name="classId" onchange="changeClass();">
            <c:forEach var="productClass" items="${productClasses}">
                <option value ="${productClass.classId}" <c:if test="${productClass.classId==1}">selected="selected"</c:if> >${productClass.className}</option>
            </c:forEach>
        </select>
    </div>
    <div class="txt">品牌：
        <select id="brandId" name="brandId" onchange="changeBrand();">
            <c:set value="0" var="selectBrand"></c:set>
            <c:forEach var="productBrand" items="${productBrands}" varStatus="status">
                <c:if test="${productBrand.classId == 1 && selectBrand == 0}">
                    <c:set value="${productBrand.brandId}" var="selectBrand"></c:set>
                </c:if>
                <option class="class${productBrand.classId}" value ="${productBrand.brandId}" <c:if test="${productBrand.classId!=1}">style="display: none;"</c:if> <c:if test="${productBrand.brandId == selectBrand}">selected="selected" </c:if> >${productBrand.brandName}</option>
            </c:forEach>
        </select>
    </div>

    <div class="txt">类型：
        <select id="typeId" name="typeId">
            <c:set value="0" var="selectType"></c:set>
            <c:forEach var="productType" items="${productTypes}">
                <c:if test="${productType.brandId == selectBrand && selectType == 0}">
                    <c:set value="${productType.typeId}" var="selectType"></c:set>
                </c:if>
                <option class="brand${productType.brandId}" value ="${productType.typeId}" <c:if test="${productType.brandId!=selectBrand}">style="display: none;"</c:if> <c:if test="${productType.typeId==selectType}">selected="selected" </c:if> >${productType.typeName}</option>
            </c:forEach>
        </select>
    </div>
            </c:if>
     <div class="txt">
    <textarea id="content" name="productDesc" cols="" rows="" class="bjq" >${product.productDesc}</textarea>
    </div>
    <div class="sure">
        <input id="id" name="id" value="${product.id}" type="hidden" />
      <input id="submitForm" type="button" value="立即发布" />
    </div>
  </div>
    </form>
</div>

    </div>
    <div class="c_bottom"><span class="fl red"><span class="en gray"></span></span><span class="fr"><span class="en">Copyright © 2007-2013 软盛. All rights reserved.</span>　沪ICP备07020881号</span></div>
  </div>
</div>
<script src="/js/jquery-1.7.1.min.js" type="text/javascript" charset="gb2312"></script>
<script src="/js/yb.js" type="text/javascript" charset="gb2312"></script>
<link rel="stylesheet" href="/js/kindedit/themes/default/default.css"/>
<script charset="utf-8" src="/js/kindedit/kindeditor-min.js"></script>
<script charset="utf-8" src="/js/kindedit/lang/zh_CN.js"></script>
<script type="text/javascript">
    $(function () {
        KindEditor.ready(function (K) {
            K.create('textarea[name="productDesc"]', {
                autoHeightMode: true,
                filterMode: false,
                uploadJson: '/upload_json',
                afterCreate: function () {
                    this.loadPlugin('autoheight');
                },
                afterBlur: function() {
                    this.sync();
                }
            });
        });

        $(".4").addClass("on");

        $("#submitForm").click(function() {
            if ($("#title").val()==null || $("#title").val()=='' ||
                    $("#content").val()==null || $("#content").val()=='') {
                alert("标题和内容不能为空");
                return;
            }
            $("#serviceForm").submit();
        });
    });

    function changeClass() {
        var selectClass = $("#classId").val();
        var selectBrand = "";
        $("#brandId option").hide();
        $("#brandId option").selected = "";
        $("#typeId option").hide();
        $("#typeId option").selected = "";
        $(".class" + selectClass).show();
        $("#brandId .class"+selectClass).each(function(i) {
            if(i==0) {
                this.selected = "selected";
                selectBrand = this.value;
            }
        });
        $(".brand" + selectBrand).show();
        $("#typeId .brand"+selectBrand).each(function(i) {
            if(i==0) this.selected = "selected";
        });
    }

    function changeBrand() {
        $("#typeId option").hide();
        $("#typeId option").selected = "";
        var selectBrand = $("#brandId").val();
        $(".brand" + selectBrand).show();
        $("#typeId .brand"+selectBrand).each(function(i) {
            if(i==0) this.selected = "selected";
        });
    }
</script>
</body>
</html>
