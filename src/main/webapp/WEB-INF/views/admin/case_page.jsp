<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Page-Enter" content="blendTrans(Duration=1)" />
<meta http-equiv="Page-Exit" content="blendTrans(Duration=1)" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<title>项目案例 | 网站后台管理系统</title>
<link href="/css/main.css" rel="stylesheet" type="text/css" />
<link href="/css/case.css" rel="stylesheet" type="text/css" />
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
    <h3>编辑项目</h3>
    <span></span></div>
  <div class="tmain b5 btop">
    <div class="tipsinfo b5"><span>项目缩略图为项目列表左侧的小图，请按规定尺寸上传。项目图片限宽651px，高度不限。为保持网页浏览通畅，单张图片大小建议不超过1MB!</span><b></b></div>
    <div class="txt">　项目名称：
      <input class="w500 b5" name="" type="text" />
    </div>
    <div class="txt"><span class="name">项目缩略图：</span> <span class="text">
      <input class="w255 b5" name="" type="text"/>
      <input name="浏览" type="button" class="btn" value="浏览" id="浏览" />
      <input name="上传" type="button" class="btn" value="上传" id="上传" />
      </span> <span class="tips">按尺寸上传190*140</span></div>
    <div class="txt"> 　选择类别：
      <select name="">
        <option>综合型社区</option>
        <option>低密度住宅</option>
        <option>商业酒店办公</option>
        <option>市政项目</option>
        <option>工业地产</option>
        <option>艺术中心</option>
      </select>
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
        $(".3").addClass("on");
    });
</script>
</body>
</html>
