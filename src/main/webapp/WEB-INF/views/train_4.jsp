<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>培训课堂-报名成功 | 软盛</title>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
  <div class="bd_succeed">
  <h2>恭喜您 , 报名成功！</h2>
稍后软盛工作人员会与您电话联系确认或邮件通知。<br />
如未有人与你取得联系，可拨打软盛工作人员电话：4008824680 取得帮助<br />
<a href="train.html">返回培训课堂</a><a href="index.html">返回首页</a>
<br /><br /><br />
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