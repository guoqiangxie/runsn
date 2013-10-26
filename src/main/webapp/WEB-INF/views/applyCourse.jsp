<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>培训课堂-报名 | 软盛</title>
    <link href="/css/global.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<%@include file="common/header.jsp" %>
<div class="w948">
    <div class="baoming">
        <div class="bd">
            <h2>${lab.name}</h2>
            <form action="/apply" method="post">
            <p><span>参会人姓名</span><input name="applyName" type="text"/></p>

            <p><span>联系电话</span><input name="phone" type="text"/></p>

            <p><span>邮件地址</span><input name="email" type="text"/></p>

            <p><span>所在企业</span><input name="company" type="text"/></p>

            <p><span>职位</span><input name="title" type="text"/></p>

            <p><span>课程名称</span>${lab.name}</p>

            <p><span>公司地址</span>
                <textarea name="address" class="w230"></textarea>
            </p>

            <p><span>&nbsp;</span><input name="" type="submit" class="btn"/></p>
                <input type="hidden" value="${lab.id}" name="id">
            </form>
        </div>
        <div class="tips"><b>培训报名人数：</b>${lab.personNum}人/班<br/>
            <b>软盛培训讲师：</b>${lab.teacher}<br/>
            <b>培训时间：</b> ${lab.trainTimeStr}<br/>
            <b>培训地址：</b><br/>
            ${lab.address}<br/>
            <b>软盛具备的测试环境：</b> <br/>
            ${lab.env}<br/>
            <b>培训说明： </b><br/>
            ${lab.desc}<br/>
            <b>体验活动内容：</b><br/>
            ${lab.content}</div>

    </div>
</div>
<div class="footer">
    <div class="w940"> Copyright &copy; 2007-2013 软盛. All rights reserved. 沪ICP备07020881号</div>
</div>
<div class="floatbox"><span><a href="#" class="n1" title="职业发展">职业发展</a><a href="#" class="n2" title="联系我们">联系我们</a><a
        href="#" class="n3" title="软盛微博">软盛微博</a></span></div>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/js/runsn.js"></script>
<script type="text/javascript" src="/js/imgslide.js"></script>
<script>
    $(function () {
        $(".imgbox1").jCarouselLite({
            btnNext: ".btn_n1",
            btnPrev: ".btn_p1"
        });

        $(".imgbox2").jCarouselLite({
            btnNext: ".btn_n2",
            btnPrev: ".btn_p2"
        });

        $(".num5").addClass("active");
    });
</script>
</body>
</html>