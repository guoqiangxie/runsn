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
<title>产品内容右侧链接 | 网站后台管理系统</title>
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
          <span class="name">栏目一文案：</span> <span class="text">
        <input id="imageName1" type="text" value="${image1.imageName}" style="width:120px;">
    </span>
          <span class="name">栏目一链接：</span> <span class="text">
        <input id="linkUrl1" type="text" value="${image1.linkUrl}" style="width:300px;">
      </span>
      </div>

      <div>
          <span class="name">栏目二文案：</span> <span class="text">
        <input id="imageName2" type="text" value="${image2.imageName}" style="width:120px;">
    </span>
          <span class="name">栏目二链接：</span> <span class="text">
        <input id="linkUrl2" type="text" value="${image2.linkUrl}" style="width:300px;">
      </span>
      </div>

      <div>
          <span class="name">栏目三文案：</span> <span class="text">
        <input id="imageName3" type="text" value="${image3.imageName}" style="width:120px;">
    </span>
          <span class="name">栏目三链接：</span> <span class="text">
        <input id="linkUrl3" type="text" value="${image3.linkUrl}" style="width:300px;">
      </span>
      </div>

  </div>
  <div class="sure">
    <input type="button" value="立即发布" id="submitProductLeftLink"/>
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
        $(".9").addClass("on");

        $("#submitProductLeftLink").click(function() {
            if ($("#linkUrl1").val() == '' || $("#imageName1").val() == '' ||
                    $("#linkUrl2").val() == '' || $("#imageName2").val() == '' ||
                    $("#linkUrl3").val() == '' || $("#imageName3").val() == '') {
                alert("所有文案和链接必填。");
                return;
            }
            $.post("/admin/image/submitProductLeftLink", { linkUrl1: $("#linkUrl1").val(), imageName1: $("#imageName1").val(),
                linkUrl2: $("#linkUrl2").val(), imageName2: $("#imageName2").val(),
                linkUrl3: $("#linkUrl3").val(), imageName3: $("#imageName3").val()}, function (data) {
                alert(data);
            });
        });
    });
</script>
</body>
</html>
