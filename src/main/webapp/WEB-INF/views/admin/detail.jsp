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
<title>新闻中心 | 网站后台管理系统</title>
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
    <h3>编辑服务内容</h3>
    <span></span></div>
     <form action="/admin/submitDocument" method="POST" id="serviceForm">
        <div class="tmain b5 btop">
    <div class="txt">标题：
      <input class="w500 b5" id="title" name="title" type="text" value="${service.title}"/>
    </div>
     <div class="txt">
    <textarea id="content" name="content" cols="" rows="" class="bjq" >${service.content}</textarea>
    </div>
    <div class="sure">
        <input id="id" name="id" value="${service.id}" type="hidden" />
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
<link rel="stylesheet" href="/js/kindedit/themes/default/default.css"/>
<script charset="utf-8" src="/js/kindedit/kindeditor-min.js"></script>
<script charset="utf-8" src="/js/kindedit/lang/zh_CN.js"></script>
<script type="text/javascript">
    $(function () {
        KindEditor.ready(function (K) {
            K.create('textarea[name="content"]', {
                autoHeightMode: true,
                uploadJson: '/upload_json',
                afterCreate: function () {
                    this.loadPlugin('autoheight');
                },
                afterBlur: function() {
                    this.sync();
                }
            });
        });

        $(".2").addClass("on");

        $("#submitForm").click(function() {
            if ($("#title").val()==null || $("#title").val()=='' ||
                    $("#content").val()==null || $("#content").val()=='') {
                alert("标题和内容不能为空");
                return;
            }
            $("#serviceForm").submit();
        });
    });
</script>
</body>
</html>
