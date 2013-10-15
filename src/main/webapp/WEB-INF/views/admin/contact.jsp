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
<title>联系我们 | 网站后台管理系统</title>
<link href="/css/main.css" rel="stylesheet" type="text/css" />
<link href="/css/contact.css" rel="stylesheet" type="text/css" />
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
  <div class="tmain b5">
    <div class="txt">公司名称：
      <input name="" type="text" class="w300 b5" value="上海软盛" />
    </div>
    <div class="txt">通信地址：
      <input name="" type="text" class="w300 b5" value="龙华路2577创意大院14号" />
    </div>
    <div class="txt">联系电话：
      <input name="" type="text" class="w300 b5" value="64691226、64684968(-0)" />
    </div>
    <div class="txt">公司传真：
      <input name="" type="text" class="w300 b5" value="64691226、64684968转分机809" />
    </div>
    <div class="txt">　联系人：
      <input name="" type="text" class="w300 b5" value="蒋小姐" />
    </div>
    <div class="txt">　E-mail：
      <input name="" type="text" class="w300 b5" value="admin@ybgroup.com.cn" />
    </div>
    <div class="txt">招聘邮箱：
      <input name="" type="text" class="w300 b5" value="zhaopin@ybgroup.com.cn" />
    </div>
    <div class="txt">公司网站：
      <input name="" type="text" class="w300 b5" value="www.ybgroup.com.cn" />
    </div>
    <div class="sure">
      <input name="" type="button" value="确认修改" />
    </div>
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
        $(".8").addClass("on");
    });
</script>
</body>
</html>
