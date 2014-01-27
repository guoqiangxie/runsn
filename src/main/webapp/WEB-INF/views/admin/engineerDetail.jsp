<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Page-Enter" content="blendTrans(Duration=1)" />
<meta http-equiv="Page-Exit" content="blendTrans(Duration=1)" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<title>工程师资质 | 网站后台管理系统</title>
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
  <div class="box b10" id="form">
    <div class="boxinfo"> <span class="name">图片上传：</span> <span class="text">
      <input id="uploader" type="button" class="btn"/>
      <div id="uploadMsg" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="image" name="image" type="hidden" value="${engineer.image}"/>
      </span></div>
      <br>
    <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
    <div> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div>
    <div> <span class="name">姓名：</span> <span class="text"><input value="${engineer.name}" name="name" type="text" /></span></div>
    <div> <span class="name">年龄：</span> <span class="text"><input value="${engineer.age}" name="age" type="text" /></span></div>
    <div> <span class="name">职称：</span> <span class="text"><input value="${engineer.title}" name="title" type="text" /></span></div>
    <div> <span class="name">经历：</span> <span class="text"><input value="${engineer.experiences}" name="experiences" type="text" /></span></div>
    <div> <span class="name">明星：</span> <span class="text"><input type="checkbox" name="star" <c:if test="${engineer.star == 'on'}">checked</c:if> /></span></div>
    <div> <span class="name">资质数：</span> <span class="text">
        <select id="aptitudeCount" onchange="changeAptitudeCount();">
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
        </select>
    </span></div>
      <input type="hidden" name="id" value="${engineer.id}" />

      <div id="uploaderTemp" style="display: none;"><div class="boxinfo template"><span class="name">资质_index_：</span> <span class="text">
      <input id="uploader_index_" type="button" class="btn"/>
      <div id="uploadMsg_index_" style="background-color: red; display: none;">上传图片成功。</div>
        <input id="imageUrl_index_" name="image" type="hidden"/>
      </span>
      </div></div>
      <div id="splice" style="display: none;"><div class="spliceDiv"> <span class="name"></span><span class="text"><input name="" type="text" style="visibility: hidden;"/></span></div></div>
  </div>
  <div class="sure">
    <input type="button" value="立即发布" id="submitEngineer"/>
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

    $("#aptitudeCount").val(${fn:length(aptitudeImages) == 0 ? 3 : fn:length(aptitudeImages)});

    var initAptitudeImages = new Array();
    <c:forEach var="aptitudeImage" items="${aptitudeImages}" varStatus="status">
        initAptitudeImages[${status.index}] = '${aptitudeImage.imageUrl}';
    </c:forEach>

    changeAptitudeCount();

    for (var i = 1; i <= $("#aptitudeCount").val(); i ++) {
        $("#imageUrl"+i).val(initAptitudeImages[i-1]);
    }

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

    $("#submitEngineer").click(function () {
        if ($("#imageUrl1").val() == '' || $("#imageUrl2").val() == '' || $("#imageUrl3").val() == '') {
            alert("最少添加三张资质。");
            return;
        }
        $.post("/admin/submitEngineer", { id: $("input[name='id']").val(), name: $("input[name='name']").val(), age: $("input[name='age']").val(),
            title: $("input[name='title']").val(), experiences: $("input[name='experiences']").val(), star: $("input[name='star']").val(),
            image: $("input[name='image']").val(), aptitudes: getAptitudes()}, function (data) {
            alert(data);
        });
    });
});

function getAptitudes() {
    var result = '';
    for (var i = 1; i <= $("#aptitudeCount").val(); i ++) {
        result += $("#imageUrl"+i).val()+";";
    }
    return result;
}

function changeAptitudeCount() {
    $("#form .template").each(function(i) {
        if (i != 0) this.remove();
    });
    $("#form .spliceDiv").each(function(i) {
        if (i != 0) this.remove();
    });
    for (var i = 1; i <= $("#aptitudeCount").val(); i ++) {
        var html = $("#uploaderTemp").html();
        html = html.replace(/_index_/g,i);
        var obj = $(html);
        obj.appendTo($("#form"));

        var html2 = $("#splice").html();
        var obj2 = $(html2);
        obj2.appendTo($("#form"));
        var html3 = $("#splice").html();
        var obj3 = $(html3);
        obj3.appendTo($("#form"));
        var html3 = $("#splice").html();
        var obj3 = $(html3);
        obj3.appendTo($("#form"));

        initUploader(i);
    }
}

function initUploader(i) {
    $("#uploader"+i).uploadify({
        height        : 24,
        swf           : '/js/uploadify.swf',
        uploader      : '/upload_json',
        width         : 32,
        buttonText : '上传',
        onUploadSuccess:function(file, data, response) {
            var data  = eval("(" + data + ")");
            $("#uploadMsg"+i).show();
            $("#imageUrl"+i).val(data.url);
        }
    });
}
</script>
</body>
</html>
