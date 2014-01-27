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
<title>首页中间六宫格图片 | 网站后台管理系统</title>
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
          <span class="name">左上链接地址：</span> <span class="text"><input id="linkUrl1" type="text" style="width: 300px;"/>
    </span>
      </div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片1上传：</span> <span class="text">
      <input id="uploader11" type="button" class="btn"/>
      <div id="uploadMsg11" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl11" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片2上传：</span> <span class="text">
      <input id="uploader12" type="button" class="btn"/>
      <div id="uploadMsg12" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl12" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">中上链接地址：</span> <span class="text"><input id="linkUrl2" type="text" style="width: 300px;"/>
    </span>
      </div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片1上传：</span> <span class="text">
      <input id="uploader21" type="button" class="btn"/>
      <div id="uploadMsg21" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl21" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片2上传：</span> <span class="text">
      <input id="uploader22" type="button" class="btn"/>
      <div id="uploadMsg22" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl22" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">右上链接地址：</span> <span class="text"><input id="linkUrl3" type="text" style="width: 300px;"/>
    </span>
      </div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片1上传：</span> <span class="text">
      <input id="uploader31" type="button" class="btn"/>
      <div id="uploadMsg31" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl31" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片2上传：</span> <span class="text">
      <input id="uploader32" type="button" class="btn"/>
      <div id="uploadMsg32" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl32" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">左下链接地址：</span> <span class="text"><input id="linkUrl4" type="text" style="width: 300px;"/>
    </span>
      </div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片1上传：</span> <span class="text">
      <input id="uploader41" type="button" class="btn"/>
      <div id="uploadMsg41" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl41" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片2上传：</span> <span class="text">
      <input id="uploader42" type="button" class="btn"/>
      <div id="uploadMsg42" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl42" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">中下链接地址：</span> <span class="text"><input id="linkUrl5" type="text" style="width: 300px;"/>
    </span>
      </div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片1上传：</span> <span class="text">
      <input id="uploader51" type="button" class="btn"/>
      <div id="uploadMsg51" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl51" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片2上传：</span> <span class="text">
      <input id="uploader52" type="button" class="btn"/>
      <div id="uploadMsg52" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl52" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

      <div>
          <span class="name">右下链接地址：</span> <span class="text"><input id="linkUrl6" type="text" style="width: 300px;"/>
    </span>
      </div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片1上传：</span> <span class="text">
      <input id="uploader61" type="button" class="btn"/>
      <div id="uploadMsg61" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl61" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div class="boxinfo"> <span class="name">图片2上传：</span> <span class="text">
      <input id="uploader62" type="button" class="btn"/>
      <div id="uploadMsg62" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl62" name="image" type="hidden"/>
      </span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
      <div> <span class="name"></span><span class="text">--------------------------------------------------------------------</span></div>

  </div>
  <div class="sure">
    <input type="button" value="立即发布" id="submitIndexPageMiddle"/>
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
        $(".8").addClass("on");

        $("#linkUrl1").val('${middleImage11.linkUrl}');
        $("#imageUrl11").val('${middleImage11.imageUrl}');
        $("#imageUrl12").val('${middleImage12.imageUrl}');

        $("#linkUrl2").val('${middleImage21.linkUrl}');
        $("#imageUrl21").val('${middleImage21.imageUrl}');
        $("#imageUrl22").val('${middleImage22.imageUrl}');

        $("#linkUrl3").val('${middleImage31.linkUrl}');
        $("#imageUrl31").val('${middleImage31.imageUrl}');
        $("#imageUrl32").val('${middleImage32.imageUrl}');

        $("#linkUrl4").val('${middleImage41.linkUrl}');
        $("#imageUrl41").val('${middleImage41.imageUrl}');
        $("#imageUrl42").val('${middleImage42.imageUrl}');

        $("#linkUrl5").val('${middleImage51.linkUrl}');
        $("#imageUrl51").val('${middleImage51.imageUrl}');
        $("#imageUrl52").val('${middleImage52.imageUrl}');

        $("#linkUrl6").val('${middleImage61.linkUrl}');
        $("#imageUrl61").val('${middleImage61.imageUrl}');
        $("#imageUrl62").val('${middleImage62.imageUrl}');

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

        $("#uploader12").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg12").show();
                $("#imageUrl12").val(data.url);
            }
        });

        $("#uploader21").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg21").show();
                $("#imageUrl21").val(data.url);
            }
        });

        $("#uploader22").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg22").show();
                $("#imageUrl22").val(data.url);
            }
        });

        $("#uploader31").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg31").show();
                $("#imageUrl31").val(data.url);
            }
        });

        $("#uploader32").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg32").show();
                $("#imageUrl32").val(data.url);
            }
        });

        $("#uploader41").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg41").show();
                $("#imageUrl41").val(data.url);
            }
        });

        $("#uploader42").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg42").show();
                $("#imageUrl42").val(data.url);
            }
        });

        $("#uploader51").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg51").show();
                $("#imageUrl51").val(data.url);
            }
        });

        $("#uploader52").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg52").show();
                $("#imageUrl52").val(data.url);
            }
        });

        $("#uploader61").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg61").show();
                $("#imageUrl61").val(data.url);
            }
        });

        $("#uploader62").uploadify({
            height        : 24,
            swf           : '/js/uploadify.swf',
            uploader      : '/upload_json',
            width         : 32,
            buttonText : '上传',
            onUploadSuccess:function(file, data, response) {
                var data  = eval("(" + data + ")");
                $("#uploadMsg62").show();
                $("#imageUrl62").val(data.url);
            }
        });

        $("#submitIndexPageMiddle").click(function() {
            if ($("#linkUrl1").val() == null || $("#linkUrl1").val() == '') {
                alert("左上图片链接没有添加。");
                return;
            }
            if ($("#imageUrl11").val() == null || $("#imageUrl11").val() == '') {
                alert("左上图片1没有添加。");
                return;
            }
            if ($("#imageUrl12").val() == null || $("#imageUrl12").val() == '') {
                alert("左上图片2没有添加。");
                return;
            }


            if ($("#linkUrl2").val() == null || $("#linkUrl2").val() == '') {
                alert("中上图片链接没有添加。");
                return;
            }
            if ($("#imageUrl21").val() == null || $("#imageUrl21").val() == '') {
                alert("中上图片1没有添加。");
                return;
            }
            if ($("#imageUrl22").val() == null || $("#imageUrl22").val() == '') {
                alert("中上图片2没有添加。");
                return;
            }

            if ($("#linkUrl3").val() == null || $("#linkUrl3").val() == '') {
                alert("右上图片链接没有添加。");
                return;
            }
            if ($("#imageUrl31").val() == null || $("#imageUrl31").val() == '') {
                alert("右上图片1没有添加。");
                return;
            }
            if ($("#imageUrl32").val() == null || $("#imageUrl32").val() == '') {
                alert("右上图片2没有添加。");
                return;
            }

            if ($("#linkUrl4").val() == null || $("#linkUrl4").val() == '') {
                alert("左下图片链接没有添加。");
                return;
            }
            if ($("#imageUrl41").val() == null || $("#imageUrl41").val() == '') {
                alert("左下图片1没有添加。");
                return;
            }
            if ($("#imageUrl42").val() == null || $("#imageUrl42").val() == '') {
                alert("左下图片2没有添加。");
                return;
            }

            if ($("#linkUrl5").val() == null || $("#linkUrl5").val() == '') {
                alert("中下图片链接没有添加。");
                return;
            }
            if ($("#imageUrl51").val() == null || $("#imageUrl51").val() == '') {
                alert("中下图片1没有添加。");
                return;
            }
            if ($("#imageUrl52").val() == null || $("#imageUrl52").val() == '') {
                alert("中下图片2没有添加。");
                return;
            }

            if ($("#linkUrl6").val() == null || $("#linkUrl6").val() == '') {
                alert("右下图片链接没有添加。");
                return;
            }
            if ($("#imageUrl61").val() == null || $("#imageUrl61").val() == '') {
                alert("右下图片1没有添加。");
                return;
            }
            if ($("#imageUrl62").val() == null || $("#imageUrl62").val() == '') {
                alert("右下图片2没有添加。");
                return;
            }

            $.post("/admin/image/submitIndexPageMiddle", { linkUrl1: $("#linkUrl1").val(), imageUrl11: $("#imageUrl11").val(), imageUrl12: $("#imageUrl12").val(),
                linkUrl2: $("#linkUrl2").val(), imageUrl21: $("#imageUrl21").val(), imageUrl22: $("#imageUrl22").val(),
                linkUrl3: $("#linkUrl3").val(), imageUrl31: $("#imageUrl31").val(), imageUrl32: $("#imageUrl32").val(),
                linkUrl4: $("#linkUrl4").val(), imageUrl41: $("#imageUrl41").val(), imageUrl42: $("#imageUrl42").val(),
                linkUrl5: $("#linkUrl5").val(), imageUrl51: $("#imageUrl51").val(), imageUrl52: $("#imageUrl52").val(),
                linkUrl6: $("#linkUrl6").val(), imageUrl61: $("#imageUrl61").val(), imageUrl62: $("#imageUrl62").val()}, function (data) {
                alert(data);
            });
        });
    });
</script>
</body>
</html>
