<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${product.title}</title>
    <meta name="keywords" content="${product.keywords}"/>
    <meta name="description" content="${product.description}"/>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
  <div class="p25">
    <div class="caption caption2">
      <h2>个性化解决方案制定者</h2>
      <p>无论您的业务需求、所处行业、公司规模如何，我们都会为您度身定做解决方案<br />
基于硬件提供，通过服务加强，庞大成功案例群支持，方能带给您无微不至的IT关怀</p>
    </div>
    <div class="solmain proPage1">
      <div class="sRight" >
       <div class="rightbox">
       <ul class="r_menu">
       <li><a href="#">白皮书</a></li>
       <li><a href="#">演示</a></li>
       <li><a href="#">成功案例</a></li>
       <li><a href="#">主题活动</a></li>
       <li><a href="#">培训课堂</a></li>
       </ul>
       <div class="solAd"><a href="#"><img src="/img/pro_icon5.jpg" width="155" height="126" /></a></div>
       </div>
              <a href="/product.html">产品</a> &gt;
          <c:forEach var="class" items="${productClasses}" varStatus="status">
              <c:if test="${status.index==0}">
                <a href="/productClass/${class.id}">${class.className}</a>
              </c:if>
              <c:if test="${status.index!=0}">
                 | <a href="/productClass/${class.id}">${class.className}</a>
              </c:if>
          </c:forEach>
          &gt; ${product.brandName}
          ${product.productDesc}
        
      </div>
      <div class="sLeft collapse">
        <h3>${product.brandName}</h3>
        <div class="promenu">
            <c:forEach var="products" items="${productsList}">
                <span class="prolink">${products[0].typeName}<span class="protip">
                    <c:forEach var="product" items="${products}">
                        <a href="/productDetail/${product.brandId}/${product.typeId}/${product.id}">${product.productName}</a>
                    </c:forEach>
                    <span class="bj"></span>
                </span></span>
            </c:forEach>
        
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