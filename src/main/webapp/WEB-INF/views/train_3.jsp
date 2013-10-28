<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>培训课堂-报名 | 软盛</title>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
  <div class="baoming">
  <div class="bd">
  <h2>7.5Aruba动手实验室</h2>
  <p><span>参会人姓名</span><input name="" type="text" /></p>
  <p><span>联系电话</span><input name="" type="text" /></p>
  <p><span>邮件地址</span><input name="" type="text" /></p>
  <p><span>所在企业</span><input name="" type="text" /></p>
  <p><span>职位</span><input name="" type="text" /></p>
  <p><span>课程名称</span>7.5Aruba动手实验室</p>
  <p><span>公司地址</span>
    <textarea name="" class="w230"></textarea>
  </p>
  <p><span>&nbsp;</span><input name="" type="button" class="btn" /></p>
  </div>
  <div class="tips"><b>培训报名人数：</b>12人/班<br />
<b>软盛培训讲师：</b>张毅<br />
<b>培训时间：</b> 2013年7月5日（周五）13:30<br />
<b>培训地址：</b><br />
上海市浦东新区浦东南路999号新梅联合广场11楼D室浦东大会议室<br />
<b>软盛具备的测试环境：</b> <br />
aruba 650控制器、aruba AP-105<br />
<b>培训说明： </b><br />
使用aruba瘦AP解决方案为企业提供安全的无线网络接入<br />
<b>体验活动内容：</b><br />
搭建AC+AP的无线网络架构（客户要自己带笔记本亲自动手做实验）</div>
  
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