<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录管理系统</title>
<style type="text/css">
<!--
*{ margin:0; padding:0;}body{ background:#eff4f7;}
.main{ background:url(/img/login.png) no-repeat; width:839px; height:404px; position:absolute; left:50%; top:50%; margin-left:-420px; margin-top:-202px;}
.main input{ border:0; background:none; width:220px; height:32px; position:absolute; line-height:32px;}
.main input.name{ left:215px; top:167px;}
.main input.password{ left:215px; top:224px;}
.main input.btn{ width:90px; height:28px; cursor:pointer; left:262px; top:295px;}
-->
</style></head>
<body>
<div class="main">
<input class="name" id="name" name="用户" value="" type="text" />
<input class="password" id="password" name="密码" value="" type="text" />
<input class="btn"  name="登录" type="button" onclick="submit();"/><div style="color: red;display: none;" id="error"></div>
</div>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript">
    function submit() {
        if ($("#name").val() == null || $("#name").val() == ''
                || $("#password").val() == null || $("#password").val() == '') {
            $("#error").html("用户名和密码必填。");
            $("#error").show();
            return;
        }
        $.ajax({
            url: '/submit',
            type: 'POST',
            data: "name="+$("#name").val()+"&password="+$("#password").val(),
            success:function(data){
                if (data == "F") {
                    $("#error").html("用户名或密码错误。");
                    $("#error").show();
                } else {
                    window.location.href = "/admin/index";
                }
            }
        });
    }
</script>
</body>
</html>
