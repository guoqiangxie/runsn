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
<title>课程 | 网站后台管理系统</title>
<link href="/css/main.css" rel="stylesheet" type="text/css" />
<link href="/css/news.css" rel="stylesheet" type="text/css" />
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
    <h3>编辑课程内容</h3>
    <span></span></div>
     <form action="/admin/submitLab" method="POST" id="serviceForm">
        <div class="tmain b5 btop">
    <div class="txt">课程&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
      <input class="w500 b5" id="title" name="name" type="text" value="${lab.name}"/>
    </div>
            <div class="txt">人数&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
                <input class="w500 b5" id="personNum" name="personNum" type="text" value="${lab.personNum}"/>
            </div>
            <div class="txt">讲师&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
                <input class="w500 b5" id="teacher" name="teacher" type="text" value="${lab.teacher}"/>
            </div>
            <div class="txt">时间&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
                <input class="w500 b5" id="trainTime" name="trainTime" type="text" value="${lab.trainTime}" onclick="WdatePicker();"/>
            </div>
            <div class="txt">地址&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
                <input class="w500 b5" id="address" name="address" type="text" value="${lab.address}"/>
            </div>
            <div class="txt">环境&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
                <input class="w500 b5" id="env" name="env" type="text" value="${lab.env}"/>
            </div>
            <div class="txt">说明&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
                <input class="w500 b5" id="desc" name="desc" type="text" value="${lab.desc}"/>
            </div>
            <div class="txt">内容&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
                <input class="w500 b5" id="content" name="content" type="text" value="${lab.content}"/>
            </div>
    <div class="sure">
        <input id="id" name="id" value="${lab.id}" type="hidden" />
      <input id="submitForm" type="button" value="立即发布" />
    </div>
  </div>
    </form>
</div>

    </div>
    <div class="c_bottom"><span class="fl red"><span class="en gray"></span></span><span class="fr"><span class="en">Copyright © 2007-2013 软盛. All rights reserved.</span>　沪ICP备07020881号</span></div>
  </div>
</div>
<script src="/js/jquery-1.7.1.min.js" type="text/javascript" charset="gb2312"></script>
<script src="/js/yb.js" type="text/javascript" charset="gb2312"></script>
<script src="/js/my97datepicker/WdatePicker.js" type="text/javascript" charset="gb2312"></script>
<script type="text/javascript">
    $(function () {
        $(".6").addClass("on");

        $("#submitForm").click(function() {
            if ($("#title").val()==null || $("#title").val()=='' ||
                    $("#content").val()==null || $("#content").val()=='') {
                alert("课程名和内容不能为空");
                return;
            }
            $("#serviceForm").submit();
        });
    });
</script>
</body>
</html>
