<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/fn.tld" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>产品-硬件 | 软盛</title>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
  <div class="p25">
    <div class="caption caption3">
      <h2>我们的产品渗透至企业级应用领域的各个层面</h2>
      <p>全系列产品源自经典品牌，兼顾客户独有需求，领跑个性化IT产品市场 ...</p>
    </div>
    <div class="sermain sPage1 proPage">
      <div class="sRight collapse">
        <dl>
          <dt><a href="#">数据存储</a></dt>
        </dl>
        <dl>
          <dt><a href="#">企业网络基础硬件</a></dt>
        </dl>
        <dl>
          <dt><a href="#">企业级无线覆盖交互</a></dt>
        </dl>
        <dl>
          <dt><a href="#">企业级数据安全</a></dt>
        </dl>
        <dl>
          <dt><a href="#">服务器及应用负载均衡</a></dt>
        </dl>
        <dl>
          <dt><a href="#">主题活动</a></dt>
        </dl>
        <dl>
          <dt><a href="#">培训课堂</a></dt>
        </dl>
        <div class="sAd"><img src="/img/promain_pre1.jpg" width="219" height="163" /></div>
      </div>
      <div class="sLeft">
      <div class="center">传统IT厂商纷纷投身于虚拟化的热潮中。他们的远见在于：虚拟服务器、虚拟应用和虚拟桌面，都可以以更低的成本通过数据中心有效地进行管理。
<br />虚拟化技术具有诸多短期优势。这不仅仅意味着用户可以节省不少硬件的开支，而且可以在更低成本、不需要太多空间的基础上实现增长。</div>
      <div class="txtlist tl2">
        <h3><a href="/product.html">产品</a> &gt; ${productClass.className}</h3>
        <div class="main">
        <div class="m_l">
            <c:forEach var="types" items="${typesList}" varStatus="status1">
                <c:if test="${status1.index%2==0}">
                    <div class="mbox">
                    <c:forEach var="type" items="${types}" varStatus="status2">
                        <c:if test="${status2.index==0}">
                            <b>${type.brandName}<span>${type.brandDesc}</span></b>
                        </c:if>
                        <a href="/productType/${type.brandId}/${type.typeId}">${type.typeName}</a>
                    </c:forEach>
                    </div>
                <c:if test="${fn:length(types) > 8}">
                        <span class="more">More</span>
                    </c:if>
                </c:if>
            </c:forEach>
        </div>
        <div class="m_r">
            <c:forEach var="types" items="${typesList}" varStatus="status1">
                <c:if test="${status1.index%2==1}">
                    <div class="mbox">
                    <c:forEach var="type" items="${types}" varStatus="status2">
                        <c:if test="${status2.index==0}">
                            <b>${type.brandName}<span>${type.brandDesc}</span></b>
                        </c:if>
                        <a href="/productType/${type.brandId}/${type.typeId}">${type.typeName}</a>
                    </c:forEach>
                    </div>
                    <c:if test="${fn:length(types) > 8}">
                        <span class="more">More</span>
                    </c:if>
                </c:if>
            </c:forEach>
        </div>
        </div>
        
        </div>
      </div>
    </div>

      <%@include file="common/footer2.jsp"%>
  </div>
</div>
<div class="footer">
  <div class="w940"> Copyright &copy; 2007-2013 软盛. All rights reserved. 沪ICP备07020881号 </div>
</div>
<%@include file="common/weibo.jsp"%>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/js/runsn.js"></script>
<script type="text/javascript">
    $(function () {
        $(".num3").addClass("active");
    });
</script>
</body>
</html>