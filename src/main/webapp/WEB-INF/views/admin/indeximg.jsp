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
<title>首页幻灯片 | 网站后台管理系统</title>
<link href="/css/main.css" rel="stylesheet" type="text/css" />
<link href="/css/indeximg.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="wrap">
    <%@include file="left.jsp"%>
  <div class="content">
    <div class="c_top">
      <h2>网站后台管理系统</h2>
      <span><a href="main.html" class="on">中文</a></span> </div>
    <div class="c_main">
      
  <div class="main1">
  <div class="tipsinfo b5"><span>请至少上传2张以上的图片，并确保图片尺\链接正确。为保持网页浏览通畅，单张图片大小建议不超过1MB!</span><b></b></div>
  <div class="box b10">
    <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input class="b5" name="" type="text" style="width:295px;"/>
      <input name="浏览" type="button" class="btn" value="浏览" id="浏览" />
      <input name="上传" type="button" class="btn" value="上传" id="上传" />
      </span> <span class="tips">按尺寸上传960*120</span> </div>
    <div class="boxinfo"> <span class="name">图片标题：</span> <span class="text">
      <input class="b5" name="" type="text" />
      </span> <span class="tips">不超过50个字</span></div>
    <div class="boxinfo"> <span class="name">图片链接：</span> <span class="text">
      <input class="b5" name="" type="text" />
      </span> <span class="tips">填写正确的图片链接</span></div>
  </div>
  <div class="box b10">
    <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input class="b5" name="" type="text" style="width:295px;"/>
      <input name="浏览" type="button" class="btn" value="浏览"/>
      <input name="上传" type="button" class="btn" value="上传" />
      </span> <span class="tips">按尺寸上传960*120</span> </div>
    <div class="boxinfo"> <span class="name">图片标题：</span> <span class="text">
      <input class="b5" name="" type="text" />
      </span> <span class="tips">不超过50个字</span></div>
    <div class="boxinfo"> <span class="name">图片链接：</span> <span class="text">
      <input class="b5" name="" type="text" />
      </span> <span class="tips">填写正确的图片链接</span></div>
  </div>
  <div class="box b10"> <span class="close">删除</span>
    <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input class="b5" name="" type="text" style="width:295px;"/>
      <input name="浏览" type="button" class="btn" value="浏览" />
      <input name="上传" type="button" class="btn" value="上传" />
      </span> <span class="tips">按尺寸上传960*120</span> </div>
    <div class="boxinfo"> <span class="name">图片标题：</span> <span class="text">
      <input class="b5" name="" type="text" />
      </span> <span class="tips">不超过50个字</span></div>
    <div class="boxinfo"> <span class="name">图片链接：</span> <span class="text">
      <input class="b5" name="" type="text" />
      </span> <span class="tips">填写正确的图片链接</span></div>
  </div>
  <div class="add"><span>增加图片</span></div>
  <div class="sure">
    <input name="" type="button" value="立即发布" />
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
        $(".1").addClass("on");
    });
</script>
</body>
</html>
