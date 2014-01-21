<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="sRight collapse">
    <dl>
        <dt><b>培训课堂</b> ${rightCourse1.linkMonth}月</dt>
        <dd style="display:block;"><a href="/train.html?linkYear=${rightCourse1.linkYear}&linkMonth=${rightCourse1.linkMonth}" target="_blank"><img src="${rightCourse1.imageUrl}" width="230" height="68" /></a></dd>
    </dl>
    <dl>
        <dt><b>培训课堂</b> ${rightCourse2.linkMonth}月</dt>
        <dd><a href="/train.html?linkYear=${rightCourse2.linkYear}&linkMonth=${rightCourse2.linkMonth}" target="_blank"><img src="${rightCourse2.imageUrl}" width="230" height="68" /></a></dd>
    </dl>
    <dl>
        <dt><b>培训课堂</b> ${rightCourse3.linkMonth}月</dt>
        <dd><a href="/train.html?linkYear=${rightCourse3.linkYear}&linkMonth=${rightCourse3.linkMonth}" target="_blank"><img src="${rightCourse3.imageUrl}" width="230" height="68" /></a></dd>
    </dl>
    <dl>
        <dt><a href="/activity.html"><b>主题活动</b> Themed Events</a></dt>
    </dl>
    <dl>
        <dt><a href="/company.html"><b>公司</b> Company</a></dt>
    </dl>
    <div class="sAd"><a href="#"><img src="/img/sermain_pre1.jpg" width="219" height="163" /></a></div>
</div>