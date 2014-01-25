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
  <div class="c_ad"><img src="/img/tra_13.jpg" width="929" height="255" /></div>
  <div class="p25">
    <div class="sermain sPage1 tramain tramain2">
      <div class="sRight collapse">
          <dl><dt><a href="/solutionTemplate/71">解决方案</a></dt></dl>
          <dl><dt><a href="/serviceTemplate/60">服务</a></dt></dl>
          <dl><dt><a href="/product.html">产品</a></dt></dl>
          <dl><dt><a href="/activity.html">主题活动</a></dt></dl>
          <dl><dt><a href="/company.html">公司</a></dt></dl>

        <div class="newlist">
        <h2>新闻列表</h2>
        <ul>
            <c:forEach var="new" items="${news}" varStatus="status">
                <li><a href="/newsTemplate/${new.id}">${new.title}</a></li>
            </c:forEach>
        </ul>
        </div>
        <div class="sAd"><img src="/img/tra_1.jpg" width="219" height="163" /></div>
      </div>
      <div class="sLeft">
      <div class="path"><a href="/train.html">培训课堂</a> &gt; 新闻 &gt; ${document.title}</div>
      ${document.content}
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
<script type="text/javascript" src="/js/imgslide.js"></script>
<script>
$(function() {

$(".imgbox1").jCarouselLite({
btnNext: ".btn_n1",
btnPrev: ".btn_p1"
});

$(".imgbox2").jCarouselLite({
btnNext: ".btn_n2",
btnPrev: ".btn_p2"
});


});


</script>

<script type="text/javascript">
    $(function () {
        $(".num5").addClass("active");
    });
</script>
</body>
</html>