<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Page-Enter" content="blendTrans(Duration=1)" />
<meta http-equiv="Page-Exit" content="blendTrans(Duration=1)" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<title>右侧课程导航 | 网站后台管理系统</title>
<link href="/css/main.css" rel="stylesheet" type="text/css" />
<link href="/css/indeximg.css" rel="stylesheet" type="text/css" />
<link href="/css/uploadify.css" rel="stylesheet" type="text/css" />
    <style type="text/css">
        .uploadify-button {
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
      
  <div class="main1">
  <div class="box b10">
      <div>
          <span class="name">年：</span> <span class="text">
        <select id="linkYear1"><option value="2014">2014</option><option value="2015">2015</option><option value="2016">2016</option><option value="2017">2017</option></select>
    </span>
          <span class="name">月：</span> <span class="text">
        <select id="linkMonth1"><option value="1">1月</option><option value="2">2月</option><option value="3">3月</option><option value="4">4月</option><option value="5">5月</option><option value="6">6月</option>
            <option value="7">7月</option><option value="8">8月</option><option value="9">9月</option><option value="10">10月</option><option value="11">11月</option><option value="12">12月</option></select>
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader1" type="button" class="btn"/>
      <div id="uploadMsg1" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl1" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">年：</span> <span class="text">
        <select id="linkYear2"><option value="2014">2014</option><option value="2015">2015</option><option value="2016">2016</option><option value="2017">2017</option></select>
    </span>
          <span class="name">月：</span> <span class="text">
        <select id="linkMonth2"><option value="1">1月</option><option value="2">2月</option><option value="3">3月</option><option value="4">4月</option><option value="5">5月</option><option value="6">6月</option>
            <option value="7">7月</option><option value="8">8月</option><option value="9">9月</option><option value="10">10月</option><option value="11">11月</option><option value="12">12月</option></select>
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader2" type="button" class="btn"/>
      <div id="uploadMsg2" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl2" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">年：</span> <span class="text">
        <select id="linkYear3"><option value="2014">2014</option><option value="2015">2015</option><option value="2016">2016</option><option value="2017">2017</option></select>
    </span>
          <span class="name">月：</span> <span class="text">
        <select id="linkMonth3"><option value="1">1月</option><option value="2">2月</option><option value="3">3月</option><option value="4">4月</option><option value="5">5月</option><option value="6">6月</option>
            <option value="7">7月</option><option value="8">8月</option><option value="9">9月</option><option value="10">10月</option><option value="11">11月</option><option value="12">12月</option></select>
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader3" type="button" class="btn"/>
      <div id="uploadMsg3" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl3" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
  </div>
  <div class="sure">
    <input type="button" value="立即发布" id="submitRightCourse"/>
  </div>
</div>

    </div>
    <div class="c_bottom"><span class="fl red"><span class="en gray"></span></span><span class="fr"><span class="en">Copyright © 2007-2013 软盛. All rights reserved.</span>　沪ICP备07020881号</span></div>
  </div>
</div>
<script src="/js/jquery-1.7.1.min.js" type="text/javascript" charset="gb2312"></script>
<script src="/js/yb.js" type="text/javascript" charset="gb2312"></script>
<script src="/js/jquery.uploadify.js" type="text/javascript" charset="gb2312"></script>
<script type="text/javascript">
    $(function () {
        $(".7").addClass("on");

        $("#linkYear1").val(${rightCourse1.linkYear});
        $("#linkYear2").val(${rightCourse2.linkYear});
        $("#linkYear3").val(${rightCourse3.linkYear});
        $("#linkMonth1").val(${rightCourse1.linkMonth});
        $("#linkMonth2").val(${rightCourse2.linkMonth});
        $("#linkMonth3").val(${rightCourse3.linkMonth});
        $("#imageUrl1").val('${rightCourse1.imageUrl}');
        $("#imageUrl2").val('${rightCourse2.imageUrl}');
        $("#imageUrl3").val('${rightCourse3.imageUrl}');

        $("#uploader1").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传1',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg1").show();
                $("#imageUrl1").val(data.url);
            }
        });

        $("#uploader2").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传2',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg2").show();
                $("#imageUrl2").val(data.url);
            }
        });

        $("#uploader3").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传3',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg3").show();
                $("#imageUrl3").val(data.url);
            }
        });

        $("#submitRightCourse").click(function() {
            if ($("#linkMonth1").val() == $("#linkMonth2").val() ||
                    $("#linkMonth3").val() == $("#linkMonth2").val() ||
                    $("#linkMonth1").val() == $("#linkMonth3").val()) {
                alert("不能选择相同的月份。");
                return;
            }
            if ($("#imageUrl1").val() == null || $("#imageUrl1").val() == '') {
                alert("第一张图片没有上传。");
                return;
            }
            if ($("#imageUrl2").val() == null || $("#imageUrl2").val() == '') {
                alert("第二张图片没有上传。");
                return;
            }
            if ($("#imageUrl3").val() == null || $("#imageUrl3").val() == '') {
                alert("第三张图片没有上传。");
                return;
            }
            $.post("/admin/image/submitRightCourse", { imageUrl1: $("#imageUrl1").val(), linkYear1: $("#linkYear1").val(), linkMonth1: $("#linkMonth1").val(),
                                                            imageUrl2: $("#imageUrl2").val(), linkYear2: $("#linkYear2").val(), linkMonth2: $("#linkMonth2").val(),
                                                            imageUrl3: $("#imageUrl3").val(), linkYear3: $("#linkYear3").val(), linkMonth3: $("#linkMonth3").val()}, function (data) {
                alert(data);
            });
        });
    });
</script>
</body>
</html>
