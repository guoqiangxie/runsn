<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${document.title} | 软盛</title>
    <meta name="keywords" content="${document.keywords}"/>
    <meta name="description" content="${document.description}"/>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
    <div class="p25">
        <div class="caption">
            <h2>Service</h2>
            <p>Runsn华东区10大企业级IT服务公司，在IT服务的整个生命周期中，我们全程待命，针对<br />
                用户不同的需求，为其提供IT购前，购中，购后的全面服务。</p>
        </div>
        <div class="sermain sPage1">
            <div class="sRight collapse">
                <dl>
                    <dt><b>培训课堂</b> 6月</dt>
                    <dd style="display:block;"><a href="train.html" target="_blank"><img src="../img/sermain_pre1.png" width="230" height="68" /></a></dd>
                </dl>
                <dl>
                    <dt><b>培训课堂</b> 7月</dt>
                    <dd><a href="train.html" target="_blank"><img src="../img/sermain_pre1.png" width="230" height="68" /></a></dd>
                </dl>
                <dl>
                    <dt><b>培训课堂</b> 8月</dt>
                    <dd><a href="train.html" target="_blank"><img src="../img/sermain_pre1.png" width="230" height="68" /></a></dd>
                </dl>
                <dl>
                    <dt><b>主题活动</b> Themed Events</dt>
                    <dd><a href="activity.html" target="_blank"><img src="../img/sermain_pre1.png" width="230" height="68" /></a></dd>
                </dl>
                <dl>
                    <dt><b>公司</b> Company</dt>
                    <dd><a href="company.html" target="_blank"><img src="../img/sermain_pre1.png" width="230" height="68" /></a></dd>
                </dl>
                <div class="sAd"><a href="#" target="_blank"><img src="../img/sermain_pre1.jpg" width="219" height="163" /></a></div>
            </div>
            ${document.content}
        </div>

        <div class="q_menu">
            <dl>
                <dt>虚拟化概述</dt>
                <dd><a href="#">虚拟化简介</a></dd>
                <dd><a href="#">为何选择VMware</a></dd>
                <dd><a href="#">数据中心管理</a></dd>
                <dd><a href="#">云社区</a></dd>
            </dl>
            <dl>
                <dt>如何获取VMware产品</dt>
                <dd><a href="#">免费下载试用版</a></dd>
                <dd><a href="#">查找代理商</a></dd>
                <dd><a href="#">采购</a></dd>
                <dd><a href="#">联系销售部门</a></dd>
            </dl>
            <dl >
                <dt>获取支持</dt>
                <dd><a href="#">提取支持请求</a></dd>
                <dd><a href="#">注册许可证</a></dd>
                <dd><a href="#">搜索知识库</a></dd>
                <dd><a href="#">访问vSphere支持中心</a></dd>
            </dl>
            <dl class="bnone">
                <dt>相关链接</dt>
                <dd><a href="#">联系我们</a></dd>
                <dd><a href="#">VMware全球网站</a></dd>
                <dd><a href="#">关于我们</a></dd>
                <dd><a href="#">VMware活动</a></dd>
                <dd><a href="#">客户成功案例</a></dd>
            </dl>
        </div>
    </div>
</div>
<div class="footer">
  <div class="w940"> Copyright &copy; 2007-2013 软盛. All rights reserved. 沪ICP备07020881号 </div>
</div>
<div class="floatbox" ><span><a href="#" class="n1" title="职业发展">职业发展</a><a href="#" class="n2" title="联系我们">联系我们</a><a href="#" class="n3" title="软盛微博">软盛微博</a></span></div>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/js/runsn.js"></script>
<script type="text/javascript">
    $(function () {
        $(".num1").addClass("active");
    });
</script>
</body>
</html>