<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Runsn工程师资质 | 软盛</title>
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
        <%@include file="common/serviceRight.jsp"%>
      <div class="sLeft">
        <h2>Runsn工程师资质</h2>
        <div class="tabBox">
          <ul class="tabs">
              <c:forEach var="engineer" items="${engineers}" varStatus="status">
                  <c:if test="${status.index == 0}">
                      <li class="on">${engineer.name}</li>
                  </c:if>
                  <c:if test="${status.index > 0 && status.index < 8}">
                      <li>${engineer.name}</li>
                  </c:if>
              </c:forEach>
          </ul>
            <c:forEach var="engineer" items="${engineers}" varStatus="status">
                <c:if test="${status.index == 0}">
                    <div class="tabmain" style="display:block;">
                        <div class="info"> <img src="${engineer.image}" width="100" height="122" class="img" />
                            <div style="float:right;width:438px;text-align: left;"><b>${engineer.name}&nbsp;&nbsp;&nbsp;&nbsp;${engineer.title}</b> 年龄：${engineer.age}岁<br />
                            主要项目经历：${engineer.experiences}
                                <h3>工程师资质</h3>
                                <div class="imgslide  ">
                                    <div class="sly imgbox1">
                                        <ul>
                                            <c:forEach var="aptitudeImage" items="${engineer.aptitudeImages}" varStatus="status">
                                                <li><img src="${aptitudeImage.imageUrl}" width="110" height="89"/></li>
                                            </c:forEach>
                                        </ul>
                                    </div>
                                    <span class="prev btn_p1"></span>
                                    <span class="next btn_n1"></span>
                                </div></div>
                         </div>
                    </div>
                </c:if>
                <c:if test="${status.index > 0 && status.index < 8}">
                    <div class="tabmain">
                    <div class="info"> <img src="${engineer.image}" width="100" height="122" class="img" />
                        <div style="float:right;width:438px;text-align: left;"><b>${engineer.name}&nbsp;&nbsp;&nbsp;&nbsp;${engineer.title}</b> 年龄：${engineer.age}岁<br />
                        主要项目经历：${engineer.experiences}
                            <h3>工程师资质</h3>
                            <div class="imgslide  ">
                                <div class="sly imgbox1">
                                    <ul>
                                        <c:forEach var="aptitudeImage" items="${engineer.aptitudeImages}" varStatus="status">
                                            <li><img src="${aptitudeImage.imageUrl}" width="110" height="89"/></li>
                                        </c:forEach>
                                    </ul>
                                </div>
                                <span class="prev btn_p1"></span>
                                <span class="next btn_n1"></span>
                            </div></div>

                        </div></div>
                </c:if>
            </c:forEach>
        </div>
        <div class="tabBox">
          <ul class="tabs">
              <c:forEach var="engineer" items="${engineers}" varStatus="status">
                  <c:if test="${status.index == 8}">
                      <li class="on">${engineer.name}</li>
                  </c:if>
                  <c:if test="${status.index > 8 && status.index < 16}">
                      <li>${engineer.name}</li>
                  </c:if>
              </c:forEach>
          </ul>
            <c:forEach var="engineer" items="${engineers}" varStatus="status">
            <c:if test="${status.index == 8}">
                <div class="tabmain" style="display:block;">
                    <div class="info"> <img src="${engineer.image}" width="100" height="122" class="img" />
                        <div style="float:right;width:438px;text-align: left;"><b>${engineer.name}&nbsp;&nbsp;&nbsp;&nbsp;${engineer.title}</b> 年龄：${engineer.age}岁<br />
                            主要项目经历：${engineer.experiences}
                            <h3>工程师资质</h3>
                            <div class="imgslide  ">
                                <div class="sly imgbox1">
                                    <ul>
                                        <c:forEach var="aptitudeImage" items="${engineer.aptitudeImages}" varStatus="status">
                                            <li><img src="${aptitudeImage.imageUrl}" width="110" height="89"/></li>
                                        </c:forEach>
                                    </ul>
                                </div>
                                <span class="prev btn_p1"></span>
                                <span class="next btn_n1"></span>
                            </div></div>
                    </div>
                </div>
            </c:if>
            <c:if test="${status.index > 8 && status.index < 16}">
                <div class="tabmain">
                    <div class="info"> <img src="${engineer.image}" width="100" height="122" class="img" />
                        <div style="float:right;width:438px;text-align: left;"><b>${engineer.name}&nbsp;&nbsp;&nbsp;&nbsp;${engineer.title}</b> 年龄：${engineer.age}岁<br />
                            主要项目经历：${engineer.experiences}
                            <h3>工程师资质</h3>
                            <div class="imgslide  ">
                                <div class="sly imgbox1">
                                    <ul>
                                        <c:forEach var="aptitudeImage" items="${engineer.aptitudeImages}" varStatus="status">
                                            <li><img src="${aptitudeImage.imageUrl}" width="110" height="89"/></li>
                                        </c:forEach>
                                    </ul>
                                </div>
                                <span class="prev btn_p1"></span>
                                <span class="next btn_n1"></span>
                            </div></div>
                    </div>
                </div>
                </c:if>
                </c:forEach>
        </div>
      </div>
    </div>
      <%@include file="common/footer1.jsp"%>
  </div>
</div>
<div class="footer">
  <div class="w940"> Copyright &copy; 2007-2013 软盛. All rights reserved. 沪ICP备07020881号 </div>
</div>
<%@include file="common/weibo.jsp"%>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/js/runsn.js"></script>
<script type="text/javascript">
    $(function () {
        $(".num5").addClass("active");
    });
</script>
</body>
</html>