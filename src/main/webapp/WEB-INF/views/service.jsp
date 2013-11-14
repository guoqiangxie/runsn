<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>服务首页 | 软盛</title>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
<div class="slide">
  <div class="slidebox">
  <ul>
    <li class="active">1</li>
    <li>2</li>
    <li>3</li>
    <li>4</li>
    <li>5</li>
    <li>7</li>
  </ul>
  <div class="fouce"> 
  <a href="/service.html" class="active"><img src="/img/slide/01.jpg" width="928" height="370" /></a>
  <a href="/solution.html"><img src="/img/slide/02.jpg" width="928" height="370" /></a>
  <a href="/product.html"><img src="/img/slide/03.jpg" width="928" height="370" /></a>
  <a href="/activity.html"><img src="/img/slide/04.jpg" width="928" height="370" /></a>
  <a href="/train.html"><img src="/img/slide/05.jpg" width="928" height="370" /></a>
  <a href="/company.html"><img src="/img/slide/06.jpg" width="928" height="370" /></a> </div>
</div>
</div>
<div class="p25">
<div class="recent homeimg">
    <h2>RECENT WORKS</h2>
    <ul>
        <li><a href="/solutionTemplate/60" target="_blank" title=""><img src="/img/pre_13.jpg"

                                                                  width="270" height="182" alt="" border="0" class="hover n1" /><img

                src="/img/pre_1.jpg" width="270" height="182" alt="" border="0"

                class="img"/></a></li>
        <li><a href="/solutionTemplate/71" target="_blank" title=""><img src="/img/pre_14.jpg"

                                                                   width="270" height="182" alt="" border="0" class="hover n2" /><img

                src="/img/pre_2.jpg" width="270" height="182" alt="" border="0"

                class="img"/></a></li>
        <li class="mr0"><a href="/train.html" target="_blank" title=""><img

                src="/img/pre_15.jpg" width="270" height="182" alt="" border="0" class="hover

n3" /><img src="/img/pre_3.jpg" width="270" height="182" alt="" border="0"

           class="img"/></a></li>
        <li><a href="/company_5.html" target="_blank" title=""><img src="/img/pre_16.jpg"

                                                                  width="270" height="182" alt="" border="0" class="hover n4" /><img

                src="/img/pre_4.jpg" width="270" height="182" alt="" border="0"

                class="img"/></a></li>
        <li><a href="/product.html" target="_blank" title=""><img src="/img/pre_17.jpg"

                                                                  width="270" height="182" alt="" border="0" class="hover n5" /><img

                src="/img/pre_5.jpg" width="270" height="182" alt="" border="0"

                class="img"/></a></li>
        <li class="mr0"><a href="/activity.html" target="_blank" title=""><img

                src="/img/pre_18.jpg" width="270" height="182" alt="" border="0" class="hover

n6"/><img src="/img/pre_6.jpg" width="270" height="182" alt="" border="0"

          class="img"/></a></li>
    </ul>
</div>
    <%@include file="common/footer2.jsp"%>
</div>
</div>

<div class="footer">
<div class="w940">
Copyright &copy; 2007-2013 软盛. All rights reserved. 沪ICP备07020881号
</div>
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