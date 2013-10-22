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
<title>解决方案 | 网站后台管理系统</title>
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
    <h3>编辑解决方案内容</h3>
    <span></span></div>
     <form action="/admin/submitSolution" method="POST" id="serviceForm">
        <div class="tmain b5 btop">
    <div class="txt">标题&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
      <input class="w500 b5" id="title" name="title" type="text" value="${documentDetail.document.title}"/>
    </div>
            <div class="txt">Keywords&nbsp;&nbsp;&nbsp;：
                <input class="w500 b5" id="keywords" name="keywords" type="text" value="${documentDetail.document.keywords}"/>
            </div>
            <div class="txt">Description：
                <input class="w500 b5" id="description" name="description" type="text" value="${documentDetail.document.description}"/>
            </div>
            <c:if test="${documentDetail.documentId==0}">
    <div class="txt">二级分类：
        <select id="title2code" name="title2code" onchange="change();">
            <option value ="1" selected="selected">按业务需求分</option>
            <option value ="2">按行业分</option>
            <option value ="3">按公司规模分</option>
        </select>
    </div>
    <div class="txt">三级分类：
        <select id="title3code" name="title3code">
            <c:forEach var="type" items="${types}">
                <option value ="${type.id}" class="title3option title2code_${type.title2code}" <c:if test="${type.title2code!=1}">style="display: none;"</c:if> >${type.title3}</option>
            </c:forEach>
        </select>
    </div>
            </c:if>
     <div class="txt">
    <textarea id="content" name="content" cols="" rows="" class="bjq" >${documentDetail.document.content}</textarea>
    </div>
    <div class="sure">
        <input id="id" name="id" value="${documentDetail.documentId}" type="hidden" />
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

        $(".3").addClass("on");

        $("#submitForm").click(function() {
            if ($("#title").val()==null || $("#title").val()=='' ||
                    $("#content").val()==null || $("#content").val()=='') {
                alert("标题和内容不能为空");
                return;
            }
            $("#serviceForm").submit();
        });
    });

    function change() {
        $(".title3option").hide();
        $(".title2code_" + $("#title2code").val()).show();
        $($(".title2code_" + $("#title2code").val())[0]).attr("selected", true);
    }
</script>
</body>
</html>
