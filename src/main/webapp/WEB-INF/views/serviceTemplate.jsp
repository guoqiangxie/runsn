<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${document.title} | 软盛</title>
    <meta name="keywords" content="${document.keywords}"/>
    <meta name="description" content="${document.description}"/>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
    <div class="p25">
        <div class="caption">
            <h2>Service</h2>
            <p>Runsn华东区10大企业级IT服务公司，在IT服务的整个生命周期中，我们全程待命，针对<br />
                用户不同的需求，为其提供IT购前，购中，购后的全面服务。</p>
        </div>
        <div class="sermain sPage1">
            <%@include file="common/serviceRight.jsp"%>
            ${document.content}
        </div>

        <%@include file="common/footer1.jsp"%>
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
        $(".num1").addClass("active");
    });
</script>
</body>
</html>