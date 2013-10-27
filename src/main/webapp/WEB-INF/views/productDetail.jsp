<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>产品-硬件-思科 | 软盛</title>
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
        <%--<span class="prolink">路由和交换--%>
        <%--<span class="protip">--%>
        <%--<a href="#">Cisco Nexus 7000 系列交换机</a>--%>
        <%--<a href="#">Cisco Nexus 5000 系列交换机</a>--%>
        <%--<a href="#">Cisco Nexus 4000 系列交换机</a>--%>
        <%--<a href="#">Cisco Nexus 3000 系列交换机 (US)</a>--%>
        <%--<a href="#">Cisco Nexus 2000 系列阵列扩展器</a>--%>
        <%--<a href="#">Catalyst 6500 系列交换机</a>--%>
        <%--<a href="#">Catalyst 4900M 系列交换机</a>--%>
        <%--<a href="#">Catalyst 4500 系列交换机</a>--%>
        <%--<a href="#">Catalyst 3750-X 和 3560-X 系列交换机</a>--%>
        <%--<a href="#">Catalyst 3750-E 系列交换机</a>--%>
        <%--<a href="#">Catalyst 3560-E 系列交换机</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        <%--<span class="prolink">网络安全--%>
        <%--<span class="protip">--%>
        <%--<a href="#">文字333</a>--%>
        <%--<a href="#">文字333</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        <%----%>
        <%--<span class="prolink">语音与IP通信--%>
        <%--<span class="protip">--%>
        <%--<a href="#">文字444</a>--%>
        <%--<a href="#">文字444</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        <%----%>
        <%--<span class="prolink">无线网络--%>
        <%--<span class="protip">--%>
        <%--<a href="#">文字555</a>--%>
        <%--<a href="#">文字555</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        <%----%>
        <%--<span class="prolink">数据中心--%>
        <%--<span class="protip">--%>
        <%--<a href="#">文字666</a>--%>
        <%--<a href="#">文字666</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        <%----%>
        <%--<span class="prolink">板卡与模块--%>
        <%--<span class="protip">--%>
        <%--<a href="#">文字77</a>--%>
        <%--<a href="#">文字777</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        <%----%>
        <%--<span class="prolink">光网络--%>
        <%--<span class="protip">--%>
        <%--<a href="#">文字888</a>--%>
        <%--<a href="#">文字888</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        <%----%>
        <%--<span class="prolink">思科精睿--%>
        <%--<span class="protip">--%>
        <%--<a href="#">文字999</a>--%>
        <%--<a href="#">文字999</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        <%----%>
        <%--<span class="prolink">UCS服务器--%>
        <%--<span class="protip">--%>
        <%--<a href="#">文字</a>--%>
        <%--<a href="#">文字</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        <%----%>
        <%--<span class="prolink">视频会议--%>
        <%--<span class="protip">--%>
        <%--<a href="#">文字</a>--%>
        <%--<a href="#">文字</a>--%>
        <%--<span class="bj"></span>--%>
        <%--</span>--%>
        <%--</span>--%>
        
        </div>
       
        
      </div>
    </div>

      <%@include file="common/footer1.jsp"%>
  </div>
</div>
<div class="footer">
  <div class="w940"> Copyright &copy; 2007-2013 软盛. All rights reserved. 沪ICP备07020881号 </div>
</div>
<div class="floatbox" ><span><a href="#" class="n1" title="职业发展">职业发展</a><a href="#" class="n2" title="联系我们">联系我们</a><a href="#" class="n3" title="软盛微博">软盛微博</a></span></div>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/js/runsn.js"></script>
<script type="text/javascript">
    $(function () {
        $(".num3").addClass("active");
    });
</script>
</body>
</html>