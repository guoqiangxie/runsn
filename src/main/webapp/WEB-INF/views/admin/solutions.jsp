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
          <h3>解决方案列表</h3>
          <span></span></div>
          <div class="newsure">
              <input id="addService" name="input" type="button" value="添加解决方案" />
          </div>
        <div class="tmain b5 btop">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <th width="30%" >标题</th>
              <th width="15%" >二级分类</th>
              <th width="20%" >三级分类</th>
              <th width="10%" >创建时间</th>
              <th width="10%" >修改时间</th>
              <th width="12%" >操作</th>
            </tr>
              <c:forEach var="service" items="${solutions}">
                  <tr>
                      <td><span class="info"><a href="/admin/solutionDetail/${service.documentId}">${service.document.title}</a></span></td>
                      <td>${service.documentType.title2}</td>
                      <td>${service.documentType.title3}</td>
                      <td>${service.document.createDate}</td>
                      <td>${service.document.updateDate}</td>
                      <td align="center"><a href="/admin/solutionDetail/${service.documentId}">修改</a> <a href="/admin/delete/${service.documentId}" onclick="return confirm('是否将(${service.document.title})信息删除?')">删除</a></td>
                  </tr>
              </c:forEach>
          </table>
        </div>

      </div>
      
    </div>
    <div class="c_bottom"><span class="fl red"><span class="en gray"></span></span><span class="fr"><span class="en">Copyright © 2007-2013 软盛. All rights reserved.</span>　沪ICP备07020881号</span></div>
  </div>
</div>
<script src="/js/jquery-1.7.1.min.js" type="text/javascript" charset="gb2312"></script>
<script src="/js/yb.js" type="text/javascript" charset="gb2312"></script>
<script type="text/javascript">
    $(function () {
        $(".3").addClass("on");
        $("#addService").click(function() {
            window.location.href = "/admin/solutionDetail/0";
        });
    });
</script>
</body>
</html>
