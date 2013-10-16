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
${document.content}
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