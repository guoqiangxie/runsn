<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>显示 | 软盛</title>
    <link href="/css/global.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="w948">
    <form action="/submitDocument" method="POST">
        标题:${content}
        <%--内容:<textarea name="content" style="width:800px;height:200px;"></textarea>--%>
        <%--<input type="submit" value="登陆">--%>
    </form>
</div>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/js/runsn.js"></script>
<link rel="stylesheet" href="/js/kindedit/themes/default/default.css"/>
<script charset="utf-8" src="/js/kindedit/kindeditor-min.js"></script>
<script charset="utf-8" src="/js/kindedit/lang/zh_CN.js"></script>
<%--<script type="text/javascript">--%>
    <%--$(function () {--%>
        <%--KindEditor.ready(function (K) {--%>
            <%--K.create('textarea[name="content"]', {--%>
                <%--autoHeightMode: true,--%>
                <%--uploadJson: '/upload_json',--%>
                <%--afterCreate: function () {--%>
                    <%--this.loadPlugin('autoheight');--%>
                <%--}--%>
            <%--});--%>
        <%--});--%>
    <%--});--%>
<%--</script>--%>
</body>
</html>