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
<title>首页焦点图片 | 网站后台管理系统</title>
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
          <span class="name">顺序：</span> <span class="text">
        <select id="showOrder1"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option></select>
    </span>
          <span class="name">链接：</span> <span class="text">
          <input id="linkUrl1" type="text" value="${image1.linkUrl}" style="width:300px;">
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader1" type="button" class="btn"/>
      <div id="uploadMsg1" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl1" name="image" type="hidden" value="${image1.imageUrl}"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">顺序：</span> <span class="text">
        <select id="showOrder2"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option></select>
    </span>
          <span class="name">链接：</span> <span class="text">
          <input id="linkUrl2" type="text" value="${image2.linkUrl}" style="width:300px;">
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader2" type="button" class="btn"/>
      <div id="uploadMsg2" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl2" name="image" type="hidden" value="${image2.imageUrl}"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">顺序：</span> <span class="text">
        <select id="showOrder3"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option></select>
    </span>
          <span class="name">链接：</span> <span class="text">
          <input id="linkUrl3" type="text" value="${image3.linkUrl}" style="width:300px;">
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader3" type="button" class="btn"/>
      <div id="uploadMsg3" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl3" name="image" type="hidden" value="${image3.imageUrl}"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">顺序：</span> <span class="text">
        <select id="showOrder4"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option></select>
    </span>
          <span class="name">链接：</span> <span class="text">
          <input id="linkUrl4" type="text" value="${image4.linkUrl}" style="width:300px;">
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader4" type="button" class="btn"/>
      <div id="uploadMsg4" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl4" name="image" type="hidden" value="${image4.imageUrl}"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>


      <div>
          <span class="name">顺序：</span> <span class="text">
        <select id="showOrder5"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option></select>
    </span>
          <span class="name">链接：</span> <span class="text">
          <input id="linkUrl5" type="text" value="${image5.linkUrl}" style="width:300px;">
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader5" type="button" class="btn"/>
      <div id="uploadMsg5" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl5" name="image" type="hidden" value="${image5.imageUrl}"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>


      <div>
          <span class="name">顺序：</span> <span class="text">
        <select id="showOrder6"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option></select>
    </span>
          <span class="name">链接：</span> <span class="text">
          <input id="linkUrl6" type="text" value="${image6.linkUrl}" style="width:300px;">
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader6" type="button" class="btn"/>
      <div id="uploadMsg6" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl6" name="image" type="hidden" value="${image6.imageUrl}"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>


      <div>
          <span class="name">顺序：</span> <span class="text">
        <select id="showOrder7"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option></select>
    </span>
          <span class="name">链接：</span> <span class="text">
          <input id="linkUrl7" type="text" value="${image7.linkUrl}" style="width:300px;">
    </span>
      </div>
      <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader7" type="button" class="btn"/>
      <div id="uploadMsg7" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl7" name="image" type="hidden" value="${image7.imageUrl}"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>

  </div>
  <div class="sure">
    <input type="button" value="立即发布" id="submitIndexTop"/>
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
        $(".17").addClass("on");

        $("#showOrder1").val(${image1.imageDetailType});
        $("#showOrder2").val(${image2.imageDetailType});
        $("#showOrder3").val(${image3.imageDetailType});
        $("#showOrder4").val(${image4.imageDetailType});
        $("#showOrder5").val(${image5.imageDetailType});
        $("#showOrder6").val(${image6.imageDetailType});
        $("#showOrder7").val(${image7.imageDetailType});

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

        $("#uploader4").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传4',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg4").show();
                $("#imageUrl4").val(data.url);
            }
        });

        $("#uploader5").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传5',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg5").show();
                $("#imageUrl5").val(data.url);
            }
        });

        $("#uploader6").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传6',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg6").show();
                $("#imageUrl6").val(data.url);
            }
        });

        $("#uploader7").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传7',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg7").show();
                $("#imageUrl7").val(data.url);
            }
        });

        $("#submitIndexTop").click(function() {
            if ($("#showOrder1").val() == $("#showOrder2").val() ||
                    $("#showOrder1").val() == $("#showOrder3").val() ||
                    $("#showOrder1").val() == $("#showOrder4").val() ||
                    $("#showOrder1").val() == $("#showOrder5").val() ||
                    $("#showOrder1").val() == $("#showOrder6").val() ||
                    $("#showOrder1").val() == $("#showOrder7").val() ||
                    $("#showOrder2").val() == $("#showOrder3").val() ||
                    $("#showOrder2").val() == $("#showOrder4").val() ||
                    $("#showOrder2").val() == $("#showOrder5").val() ||
                    $("#showOrder2").val() == $("#showOrder6").val() ||
                    $("#showOrder2").val() == $("#showOrder7").val() ||
                    $("#showOrder3").val() == $("#showOrder4").val() ||
                    $("#showOrder3").val() == $("#showOrder5").val() ||
                    $("#showOrder3").val() == $("#showOrder6").val() ||
                    $("#showOrder3").val() == $("#showOrder7").val() ||
                    $("#showOrder4").val() == $("#showOrder5").val() ||
                    $("#showOrder4").val() == $("#showOrder6").val() ||
                    $("#showOrder4").val() == $("#showOrder7").val() ||
                    $("#showOrder5").val() == $("#showOrder6").val() ||
                    $("#showOrder5").val() == $("#showOrder7").val() ||
                    $("#showOrder6").val() == $("#showOrder7").val()) {
                alert("图片的顺序不能相同。");
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
            if ($("#imageUrl4").val() == null || $("#imageUrl4").val() == '') {
                alert("第四张图片没有上传。");
                return;
            }
            if ($("#imageUrl5").val() == null || $("#imageUrl5").val() == '') {
                alert("第五张图片没有上传。");
                return;
            }
            if ($("#imageUrl6").val() == null || $("#imageUrl6").val() == '') {
                alert("第六张图片没有上传。");
                return;
            }
            if ($("#imageUrl7").val() == null || $("#imageUrl7").val() == '') {
                alert("第七张图片没有上传。");
                return;
            }
            if ($("#linkUrl1").val() == '' || $("#linkUrl2").val() == '' || $("#linkUrl3").val() == '' || $("#linkUrl4").val() == '' || $("#linkUrl5").val() == '' || $("#linkUrl6").val() == '' || $("#linkUrl7").val() == '') {
                alert("链接地址不能为空。");
                return;
            }
            $.post("/admin/image/submitIndexTop", { imageUrl1: $("#imageUrl1").val(), linkUrl1: $("#linkUrl1").val(), showOrder1: $("#showOrder1").val(),
                                                            imageUrl2: $("#imageUrl2").val(), linkUrl2: $("#linkUrl2").val(), showOrder2: $("#showOrder2").val(),
                                                            imageUrl3: $("#imageUrl3").val(), linkUrl3: $("#linkUrl3").val(), showOrder3: $("#showOrder3").val(),
                                                            imageUrl4: $("#imageUrl4").val(), linkUrl4: $("#linkUrl4").val(), showOrder4: $("#showOrder4").val(),
                                                            imageUrl5: $("#imageUrl5").val(), linkUrl5: $("#linkUrl5").val(), showOrder5: $("#showOrder5").val(),
                                                            imageUrl6: $("#imageUrl6").val(), linkUrl6: $("#linkUrl6").val(), showOrder6: $("#showOrder6").val(),
                                                            imageUrl7: $("#imageUrl7").val(), linkUrl7: $("#linkUrl7").val(), showOrder7: $("#showOrder7").val()
            }, function (data) {
                alert(data);
            });
        });
    });
</script>
</body>
</html>
