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
<title>专家顾问 | 网站后台管理系统</title>
<link href="/css/main.css" rel="stylesheet" type="text/css" />
<link href="/css/zhuanjia.css" rel="stylesheet" type="text/css" />
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
    <h3>专家顾问</h3>
    <span></span></div>
  <div class="tmain b5 btop">
   <div class="txt">选择专家：
      <select name="">
        <option>刘天华</option>
        <option>刘诚</option>
      </select>
    </div>
    <div class="txt">专家名称：
      <input class="w500 b5" name="" type="text" />
    </div>
    <div class="txt"><span class="name">专家照片：</span> <span class="text">
      <input class="w255 b5" name="" type="text"/>
      <input name="浏览" type="button" class="btn" value="浏览" id="浏览" />
      <input name="上传" type="button" class="btn" value="上传" id="上传" />
      </span> <span class="tips">按尺寸上传160*200</span></div>
    <div class="txt"><span class="fl">专家简介：</span>
      <textarea name="" cols="" rows=""  class="h70 b5"></textarea>
    </div>
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
        $(".6").addClass("on");
    });
</script>
</body>
</html>
