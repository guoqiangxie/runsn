<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${document.title}</title>
    <meta name="keywords" content="${document.keywords}"/>
    <meta name="description" content="${document.description}"/>
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
        <div class="solmain">
            <div class="sRight">
                <div class="rightbox">
                    <ul class="r_menu">
                        <li><a href="/service.html">服务</a></li>
                        <li><a href="/product.html">产品</a></li>
                        <li><a href="/activity.html">主题活动</a></li>
                        <li><a href="/company.html">公司</a></li>
                    </ul>
                    <div class="solAd"><a href="#"><img src="/img/solution_icon2.png" width="155" height="126" /></a></div>
                </div>
                ${document.content}
            </div>
            <%@include file="common/solutionLeft.jsp"%>
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
        $(".num${documentType.title1code}").addClass("active");
    });
</script>
</body>
</html>