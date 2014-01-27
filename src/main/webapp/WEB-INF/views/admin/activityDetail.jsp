<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Page-Enter" content="blendTrans(Duration=1)" />
<meta http-equiv="Page-Exit" content="blendTrans(Duration=1)" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<title>主题活动图片 | 网站后台管理系统</title>
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

        <form action="/admin/submitActivity" method="POST" id="activityForm">
  <div class="main1">
  <div class="box b10">
      <div>
          <span class="name">标题：</span> <span class="text"><input name="imageDesc" id="imageDesc1" type="text" style="width: 300px;" value="${activityImage.imageDesc}"/>
    </span>
      </div>
      <div> <span class="name"></span><span class="text"><input type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader11" type="button" class="btn"/>
      <div id="uploadMsg11" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl11" name="imageUrl" type="hidden" value="${activityImage.imageUrl}"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input type="text" style="visibility: hidden;"/></span></div>
      <div class="txt">
          <textarea id="content" name="content" cols="" rows="" class="bjq" >${activityDocument.content}</textarea>
      </div>

  </div>
  <div class="sure">
      <input id="imageType" name="imageType" value="${imageType}" type="hidden"/>
      <input id="imageId" name="imageId" value="${activityImage.id}" type="hidden" />
      <input id="documentId" name="documentId" value="${activityDocument.id}" type="hidden" />
    <input type="button" value="立即发布" id="submitActivity"/>
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
<link rel="stylesheet" href="/js/kindedit/themes/default/default.css"/>
<script charset="utf-8" src="/js/kindedit/kindeditor-min.js"></script>
<script charset="utf-8" src="/js/kindedit/lang/zh_CN.js"></script>
<script type="text/javascript">
    $(function () {
        KindEditor.ready(function (K) {
            K.create('textarea[name="content"]', {
                autoHeightMode: true,
                filterMode: false,
                uploadJson: '/upload_json',
                afterCreate: function () {
                    this.loadPlugin('autoheight');
                },
                afterBlur: function() {
                    this.sync();
                }
            });
        });

        if (${imageType == 6}) {
            $(".12").addClass("on");
        }
        if (${imageType == 7}) {
            $(".13").addClass("on");
        }
        if (${imageType == 8}) {
            $(".14").addClass("on");
        }

        $("#uploader11").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg11").show();
                $("#imageUrl11").val(data.url);
            }
        });

        $("#submitActivity").click(function() {
            if ($("#imageDesc1").val() == '') {
                alert("标题没有添加。");
                return;
            }
            if ($("#imageUrl11").val() == null || $("#imageUrl11").val() == '') {
                alert("图片没有添加。");
                return;
            }

            if ($("#content").val()==null || $("#content").val()=='') {
                alert("内容不能为空");
                return;
            }

            $("#activityForm").submit();
        });
    });
</script>
</body>
</html>
