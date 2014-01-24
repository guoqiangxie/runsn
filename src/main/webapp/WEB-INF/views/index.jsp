<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页 | 软盛</title>
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
        <li>6</li>
          <li>7</li>
      </ul>
        <div class="fouce">
        <a href="/serviceTemplate/60" class="active"><img src="/img/slide/01.jpg" width="928" height="370" /></a>
            <a href="/ad.html"><img src="/img/ad.jpg" width="928" height="370" /></a>
            <a href="/solutionTemplate/71"><img src="/img/slide/02.jpg" width="928" height="370" /></a>
            <a href="/product.html"><img src="/img/slide/03.jpg" width="928" height="370" /></a>
            <a href="/activity.html"><img src="/img/slide/04.jpg" width="928" height="370" /></a>
            <a href="/train.html"><img src="/img/slide/05.jpg" width="928" height="370" /></a>
            <a href="/company.html"><img src="/img/slide/06.jpg" width="928" height="370" /></a>  </div>
    </div>
  </div>
  <div class="p25">
<div class="recent homeimg">
      <h2>RECENT WORKS</h2>
      <ul>
        <li><a href="${middleImage11.linkUrl}" target="_blank" title="">
            <img src="${middleImage12.imageUrl}" width="270" height="182" alt="" border="0" class="hover n1" />
            <img src="${middleImage11.imageUrl}" width="270" height="182" alt="" border="0" class="img"/></a>
        </li>
        <li><a href="${middleImage21.linkUrl}" target="_blank" title="">
            <img src="${middleImage22.imageUrl}" width="270" height="182" alt="" border="0" class="hover n2" />
            <img src="${middleImage21.imageUrl}" width="270" height="182" alt="" border="0" class="img"/></a>
        </li>
        <li class="mr0"><a href="${middleImage31.linkUrl}" target="_blank" title="">
            <img src="${middleImage32.imageUrl}" width="270" height="182" alt="" border="0" class="hover n3" />
            <img src="${middleImage31.imageUrl}" width="270" height="182" alt="" border="0" class="img"/></a>
        </li>
        <li><a href="${middleImage41.linkUrl}" target="_blank" title="">
            <img src="${middleImage42.imageUrl}" width="270" height="182" alt="" border="0" class="hover n4" />
            <img src="${middleImage41.imageUrl}" width="270" height="182" alt="" border="0" class="img"/></a>
        </li>
        <li><a href="${middleImage51.linkUrl}" target="_blank" title="">
            <img src="${middleImage52.imageUrl}" width="270" height="182" alt="" border="0" class="hover n5" />
            <img src="${middleImage51.imageUrl}" width="270" height="182" alt="" border="0" class="img"/></a>
        </li>
        <li class="mr0"><a href="${middleImage61.linkUrl}" target="_blank" title="">
            <img src="${middleImage62.imageUrl}" width="270" height="182" alt="" border="0" class="hover n6"/>
            <img src="${middleImage61.imageUrl}" width="270" height="182" alt="" border="0" class="img"/></a>
        </li>
      </ul>
    </div>
    <div class="clear_float"></div>
    <div class="homead">
    <div class="ad"><br /><b class="f18">瞩目软盛 未来之选</b>
从虚拟化到大数据再到云，软盛特有IT服务联盟，让您的企业IT环境闪耀业界。<br />
高瞻远瞩，我们真正正视IT技术变革；细致入微，我们使您的需求触手可及。<br />
跻身软盛视角，实现您最高级别的效率、可操作性和灵活管理，惊艳您的IT效果。</div>
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
</body>
</html>