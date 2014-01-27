<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>主动活动详情 | 软盛</title>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
  <div class="p25">
    <div class="caption caption4">
    </div>
    <div class="sermain sPage1 proPage actmain3">
      <div class="path"><a href="activity/6">主题活动</a> &gt; <a href="activity/${activityDetailImage.imageType}"><c:if test="${activityDetailImage.imageType == 6}">精彩促销</c:if><c:if test="${activityDetailImage.imageType == 7}">厂商&活动</c:if><c:if test="${activityDetailImage.imageType == 8}">邀请函</c:if></a></div>
      <div class="center"><img src="${activityDetail.content}" width="848" height="901" /></div>
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
        $(".num4").addClass("active");
    });
</script>
</body>
</html>