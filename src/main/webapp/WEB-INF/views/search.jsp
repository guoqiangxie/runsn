<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>搜索结果 | 软盛</title>
<link href="../css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
  <div class="p25">
  
  
  
    <div class="listpage">
    <div class="path"><a href="#">主页</a> &gt; Search</div>
    <div class="sear"><input id="searchWords" name="" type="text" class="inputText" title="search you word" /><input name="" type="button" class="btn" id="searchButton"/></div>
    <div class="infolist">
    <dl>
    <dt>服务</dt>
        <c:forEach var="service" items="${searchedServices}">
            <dd><a href="/serviceTemplate/${service.id}">${service.title}</a></dd>
        </c:forEach>
    </dl>
        <dl>
            <dt>解决方案</dt>
            <c:forEach var="solution" items="${searchedSolutions}">
                <dd><a href="/solutionTemplate/${solution.id}">${solution.title}</a></dd>
            </c:forEach>
        </dl>
    <dl>
    <dt>产品</dt>
        <c:forEach var="product" items="${searchedProducts}">
            <dd><a href="/productDetail/${product.brandId}/${product.typeId}/${product.id}">${product.title}</a></dd>
        </c:forEach>
    </dl>
    <dl>
    <dt>新闻</dt>
        <c:forEach var="news" items="${searchedNews}">
            <dd><a href="/newsTemplate/${news.id}">${news.title}</a></dd>
        </c:forEach>
    </dl>
    </div>
    </div>
    <style>
	.sear{ background:url(/img/new_search.png) no-repeat; width:762px; height:58px; display:block; margin:50px 0;}
	.sear .inputText{ width:710px; height:50px; line-height:50px; float:left; border:0; background:none; margin:5px 0 0 5px}
	.sear .btn{ width:45px; height:50px; display:inline-block; cursor:pointer; background:none; border:0;}
	.listpage{ padding:0 50px;}
	.infolist dl{ border-bottom:1px solid #cecece; padding:25px;}
	.infolist dt{ font-size:14px; font-weight:bold; display:block; margin-bottom:10px;}
	.infolist dd{ height:26px; line-height:26px;}
	</style>
    
    
    <div class="clear_float"></div>
    <br /><br />
      <%@include file="common/footer1.jsp"%>
  </div>
</div>
<div class="footer">
  <div class="w940"> Copyright &copy; 2007-2013 软盛. All rights reserved. 沪ICP备07020881号 </div>
</div>
<%@include file="common/weibo.jsp"%>
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="../js/runsn.js"></script>
<script type="text/javascript">
    $(function () {
        $("#searchWords").val('${searchWords}');

        $("#searchButton").click(function () {
            if ($("#searchWords").val() != '') {
                window.location.href = "/search?words=" + $("#searchWords").val();
            }
        });
    });
</script>
</body>
</html>