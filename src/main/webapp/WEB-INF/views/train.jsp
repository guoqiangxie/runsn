<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>培训课堂 | 软盛</title>
    <link href="/css/global.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<%@include file="common/header.jsp" %>
<div class="w948">
    <div class="slide">
        <div class="slidebox">
            <ul>
                <li class="active">1</li>
                <li>2</li>
                <li>3</li>
                <li>4</li>
            </ul>
            <div class="fouce">
                <a href="${image1.linkUrl}" class="active"><img src="${image1.imageUrl}" width="928" height="370" /></a>
                <a href="${image2.linkUrl}"><img src="${image2.imageUrl}" width="928" height="370" /></a>
                <a href="${image3.linkUrl}"><img src="${image3.imageUrl}" width="928" height="370" /></a>
                <a href="${image4.linkUrl}"><img src="${image4.imageUrl}" width="928" height="370" /></a>
                <%--<a href="/activity.html"><img src="/img/slide/04.jpg" width="928" height="370" /></a>--%>
                <%--<a href="/company.html"><img src="/img/slide/06.jpg" width="928" height="370" /></a> --%>
            </div>
        </div>
    </div>
    <div class="p25">
        <div class="sermain sPage1 tramain">
            <div class="sRight collapse">
                <dl>
                    <dt><a href="/solutionTemplate/71">解决方案</a></dt>
                </dl>

                <dl>
                    <dt><a href="/serviceTemplate/60">服务</a></dt>
                </dl>
                <dl>
                    <dt><a href="/product.html">产品</a></dt>
                </dl>
                <dl>
                    <dt><a href="/activity.html">主题活动</a></dt>
                </dl>
                <dl>
                    <dt><a href="/company.html">公司</a></dt>
                </dl>

                <div class="newlist">
                    <h2>新闻列表</h2>
                    <ul>
                        <c:forEach var="new" items="${news}" varStatus="status">
                            <li><a href="/newsTemplate/${new.id}">${new.title}</a></li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="sAd"><img src="/img/tra_1.jpg" width="219" height="163"/></div>
            </div>
            <div class="sLeft">
                <div class="tbox1 ">
                    <h4>合作伙伴</h4>

                    <div class="imgslide  ">
                        <div class="sly imgbox1">
                            <ul>
                                <li><a href="/train_1.html"><img src="/img/tra_2.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_3.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_4.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_5.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_2.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_3.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_4.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_2.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_3.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_4.jpg" width="110" height="89"/></a></li>
                                <li><a href="/train_1.html"><img src="/img/tra_5.jpg" width="110" height="89"/></a></li>
                            </ul>
                        </div>
                        <span class="prev btn_p1"></span>
                        <span class="next btn_n1"></span>
                    </div>
                </div>
                <div class="tbox1">
                    <h4><a name="a"></a>课程表</h4>

                    <div id='calendar'></div>
                </div>
                <div class="tbox1">
                    <h4><a name="b"></a>培训资质</h4>

                    <div class="imgslide  ">
                        <div class="sly imgbox2">
                            <ul>
                                <li><img src="/img/tra_6.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_7.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_8.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_9.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_6.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_7.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_8.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_9.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_6.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_7.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_8.jpg" width="110" height="89"/></li>
                                <li><img src="/img/tra_9.jpg" width="110" height="89"/></li>
                            </ul>
                        </div>
                        <span class="prev btn_p2"></span>
                        <span class="next btn_n2"></span>
                    </div>
                </div>
            </div>
        </div>
        <div class="star">
            <h3><a name="c"></a>Runsn明星讲师</h3>

            <div class="s_main">
                <iframe frameborder="no" scrolling=”no” allowtransparency="no" width="100%" height="450"
                        src="star.html"></iframe>
            </div>
        </div>
        <%@include file="common/footer2.jsp"%>
    </div>
</div>
<div class="footer">
    <div class="w940"> Copyright &copy; 2007-2013 软盛. All rights reserved. 沪ICP备07020881号</div>
</div>
<%@include file="common/weibo.jsp"%>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/js/runsn.js"></script>
<script type="text/javascript" src="/js/imgslide.js"></script>

<link href='/js/fullcalendar/fullcalendar.css' rel='stylesheet'/>
<link href='/js/fullcalendar/fullcalendar.print.css' rel='stylesheet' media='print'/>
<script src='/js/fullcalendar/jquery-ui.custom.min.js'></script>
<script src='/js/fullcalendar/fullcalendar.min.js'></script>
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
        $('#calendar').fullCalendar({
            editable: true,
            header: {
                right: 'prev,next',
                left: 'title'
            },
            monthNames: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
            dayNamesShort: ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'],
            events: [
                <c:forEach var="lab" items="${labs}">
                    {title: '${lab.name}', start: '${lab.trainTime}', allDay: false, url: '/applyCourse/${lab.id}'},
                </c:forEach>
            ]
        });
        <c:if test="${linkYear!=null}">
            $('#calendar').fullCalendar( 'gotoDate', ${linkYear}, ${linkMonth-1});
        </c:if>

    });
</script>
</body>
</html>