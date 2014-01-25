<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>主题活动列表页 | 软盛</title>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
  <div class="p25">
    <div class="caption caption4">
    </div>
    <div class="sermain sPage1 proPage actmain2">
      <div class="sRight collapse">
        <dl>
          <dt><b><a href="/solutionTemplate/71">解决方案</a></b>Solution</dt>
        </dl>
        <dl>
          <dt><b><a href="/product.html">产品</a></b>Product</dt>
        </dl>
        <dl>
          <dt><b><a href="/train.html">培训课堂</a></b>Train</dt>
        </dl>
        <dl>
          <dt><b><a href="/company.html">公司</a></b>Company</dt>
        </dl>
        <div class="tip4" <c:if test="${imageType == 6}">style="display: none;"</c:if>>
        <p><b>精彩促销</b></p>
        <h3>活动连连</h3>
        <p>精彩活动，引导业界创意无限</p>
        <a href="/activity/6"></a>
        </div>
          <div class="tip4" <c:if test="${imageType == 7}">style="display: none;"</c:if>>
              <p><b>厂商&amp;活动</b></p>
              <h3>洞若观火</h3>
              <p>大牌云集，坐看业界风起云涌</p>
              <a href="/activity/7"></a>
          </div>
        <div class="tip4 tip5" <c:if test="${imageType == 8}">style="display: none;"</c:if>>
        <p><b>邀请函</b></p>
        <h3>超乎所见</h3>
        <p>前沿动态，亲临现场共谱新知</p>
        <a href="/activity/8"></a>
        </div>
      </div>
      <div class="sLeft">
      <div class="path"><a href="/activity.html">主题活动</a> &gt; <c:if test="${imageType == 6}">精彩促销</c:if><c:if test="${imageType == 7}">厂商&活动</c:if><c:if test="${imageType == 8}">邀请函</c:if></div>
      <div class="a_txt4"><h1>这里有你想要获取的企业动态</h1>
      公司活动精彩纷呈，优惠促销汹涌来袭，厂商活动汇聚一堂<br />
为客户谋利，与厂商同发展，"共赢"是软盛所愿</div>
      <div class="imglist">
      <ul>
      <li>
      <p><a href="${middleImage11.linkUrl}"><img src="${middleImage11.imageUrl}" width="264" height="173" /><span>${middleImage11.imageDesc}</span></a></p>
      <p><a href="${middleImage21.linkUrl}"><img src="${middleImage21.imageUrl}" width="264" height="173" /><span>${middleImage21.imageDesc}</span></a></p>
      </li>
      <li>
          <p><a href="${middleImage31.linkUrl}"><img src="${middleImage31.imageUrl}" width="264" height="173" /><span>${middleImage31.imageDesc}</span></a></p>
          <p><a href="${middleImage41.linkUrl}"><img src="${middleImage41.imageUrl}" width="264" height="173" /><span>${middleImage41.imageDesc}</span></a></p>
      </li>
      <li class="backnone">
          <p><a href="${middleImage51.linkUrl}"><img src="${middleImage51.imageUrl}" width="264" height="173" /><span>${middleImage51.imageDesc}</span></a></p>
          <p><a href="${middleImage61.linkUrl}"><img src="${middleImage61.imageUrl}" width="264" height="173" /><span>${middleImage61.imageDesc}</span></a></p>
      </li>
      </ul>
      </div>
      <div class="clear_float"></div>
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
        $(".num4").addClass("active");
    });
</script>
</body>
</html>