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
<link href="/css/uploadify.css" rel="stylesheet" type="text/css" />
    <style type="text/css">    .uploadify-button {
        background-color: transparent;
        border: none;
        padding: 0;
    }
    .uploadify:hover .uploadify-button {
        background-color: transparent;
    }
    </style>
</head>
<body>
<div class="wrap">
    <%@include file="left.jsp"%>
  <div class="content">
    <div class="c_top">
      <h2>网站后台管理系统</h2>
      <span><a href="main.html" class="on">中文</a></span> </div>
    <div class="c_main">
      
      <form action="/admin/submitEngineer" method="POST" id="engineerForm">
  <div class="main1">
  <div class="box b10">
    <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader" type="button" class="btn"/>
      <div id="uploadMsg" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="image" name="image" type="hidden"/>
      </span></div>
      <br>
    <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
    <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
    <div> <span class="name">姓名：</span> <span class="text"><input name="name" type="text" /></span></div>
    <div> <span class="name">年龄：</span> <span class="text"><input name="age" type="text" /></span></div>
    <div> <span class="name">职称：</span> <span class="text"><input name="title" type="text" /></span></div>
    <div class="boxinfo"> <span class="name">经历：</span> <span class="text"><input name="experiences" type="text" /></span></div>
    <div class="boxinfo"> <span class="name">资质：</span> <span class="text"><input name="aptitude" type="text" /></span></div>
  </div>
  <div class="sure">
    <input type="submit" value="立即发布" />
  </div>
</div>
      </form>

    </div>
    <div class="c_bottom"><span class="fl red"><span class="en gray"></span></span><span class="fr"><span class="en">Copyright © 2007-2013 软盛. All rights reserved.</span>　沪ICP备07020881号</span></div>
  </div>
</div>
<script src="/js/jquery-1.7.1.min.js" type="text/javascript" charset="gb2312"></script>
<script src="/js/yb.js" type="text/javascript" charset="gb2312"></script>
<script src="/js/jquery.uploadify.js" type="text/javascript" charset="gb2312"></script>
<script type="text/javascript">
    $(function () {
        $(".1").addClass("on");

        $("#uploader").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 28,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg").show();
                $("#image").val(data.url);
            }
        });
    });
</script>
</body>
</html>
