<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Page-Enter" content="blendTrans(Duration=1)" />
<meta http-equiv="Page-Exit" content="blendTrans(Duration=1)" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<link rel="Shortcut Icon" href="1.ico">
<title>关于软盛 | 网站后台管理系统</title>
<link href="/css/main.css" rel="stylesheet" type="text/css" />
<link href="/css/about.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="wrap">
    <%@include file="left.jsp"%>
  <div class="content">
    <div class="c_top">
      <h2>网站后台管理系统</h2>
      <span><a href="main.html" class="on">中文</a></span> </div>
    <div class="c_main">
      
<div class="main2">
  <div class="tit">
    <h3>关于软盛</h3>
    <span></span></div>
  <div class="tmain b5">
    <div class="txt"> 　选择类别：
      <select name="">
        <option>公司简介</option>
        <option>设计团队</option>
        <option>软盛拓展</option>
        <option>工作环境</option>
      </select>
      <!--<select name="">
        <option>泰国</option>
        <option>日本</option>
        <option>新马</option>
        <option>中国庐山</option>
        <option>中国杭州</option>
        <option>中国黄山</option>
      </select>-->
    </div>
     <div class="txt">
    <textarea name="" cols="" rows="" class="bjq" >编辑器</textarea>
    </div>
    <div class="txt" style="height:200px; border:1px solid #ccc;">图片上传区域（案例图片）</div>
    <div class="sure">
      <input name="" type="button" value="立即发布" />
    </div>
  </div>
</div>

    </div>
    <div class="c_bottom"><span class="fl red"><span class="en gray"></span></span><span class="fr"><span class="en">Copyright © 2007-2013 软盛. All rights reserved.</span>　沪ICP备07020881号</span></div>
  </div>
</div>
<script src="/js/jquery-1.7.1.min.js" type="text/javascript" charset="gb2312"></script>
<script src="/js/yb.js" type="text/javascript" charset="gb2312"></script>
<script type="text/javascript">
    $(function () {
        $(".5").addClass("on");
    });
</script>
</body>
</html>