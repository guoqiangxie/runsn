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
      <div class="sRight collapse">
        <dl>
          <dt><b>培训课堂</b> 6月</dt>
          <dd style="display:block;"><img src="/img/sermain_pre1.png" width="230" height="68" /></dd>
        </dl>
        <dl>
          <dt><b>培训课堂</b> 7月</dt>
          <dd><img src="/img/sermain_pre1.png" width="230" height="68" /></dd>
        </dl>
        <dl>
          <dt><b>培训课堂</b> 8月</dt>
          <dd><img src="/img/sermain_pre1.png" width="230" height="68" /></dd>
        </dl>
        <dl>
          <dt><b>主题活动</b> Themed Events</dt>
          <dd><img src="/img/sermain_pre1.png" width="230" height="68" /></dd>
        </dl>
        <dl>
          <dt><b>公司</b> Company</dt>
          <dd><img src="/img/sermain_pre1.png" width="230" height="68" /></dd>
        </dl>
        <div class="sAd"><img src="/img/sermain_pre1.jpg" width="219" height="163" /></div>
      </div>
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
            <%--<li class="on">郑松</li>--%>
            <%--<li>曹伟1</li>--%>
            <%--<li>曹伟2</li>--%>
            <%--<li>曹伟3</li>--%>
            <%--<li>曹伟4</li>--%>
            <%--<li>曹伟5</li>--%>
            <%--<li>曹伟6</li>--%>
            <%--<li>曹伟7</li>--%>
          </ul>
            <c:forEach var="engineer" items="${engineers}" varStatus="status">
                <c:if test="${status.index == 0}">
                    <div class="tabmain" style="display:block;">
                        <div class="info"> <img src="${engineer.image}" width="100" height="122" class="img" /> <b>${engineer.name}&nbsp;&nbsp;&nbsp;&nbsp;${engineer.title}</b> 年龄：${engineer.age}岁<br />
                            主要项目经历：${engineer.experiences}</div>
                        <h3>工程师资质</h3>
                        ${engineer.aptitude}
                    </div>
                </c:if>
                <c:if test="${status.index > 0 && status.index < 8}">
                    <div class="tabmain">
                    <div class="info"> <img src="${engineer.image}" width="100" height="122" class="img" /> <b>${engineer.name}&nbsp;&nbsp;&nbsp;&nbsp;${engineer.title}</b> 年龄：${engineer.age}岁<br />
                        主要项目经历：${engineer.experiences}</div>
                    <h3>工程师资质</h3>
                        ${engineer.aptitude}
                </c:if>
            </c:forEach>
          <%--<div class="tabmain" style="display:block;">--%>
            <%--<div class="info"> <img src="/img/sermain_pre7.jpg" width="100" height="122" class="img" /> <b>郑松&nbsp;&nbsp;&nbsp;&nbsp;数据防泄密资深工程师</b> 年龄：27岁<br />--%>
              <%--主要项目经历：<br />--%>
              <%--● 真诺(Zenner)仪器 PGP实施<br />--%>
              <%--● 协鑫 PGP实施</div>--%>
            <%--<h3>工程师资质</h3>--%>
            <%--<img src="/img/sermain_pre8.jpg" width="563" height="151" /><br />--%>
          <%--</div>--%>
          <%--<div class="tabmain">222222222222222</div>--%>
          <%--<div class="tabmain">33333333333</div>--%>
          <%--<div class="tabmain">4444</div>--%>
          <%--<div class="tabmain">55555</div>--%>
          <%--<div class="tabmain">66666</div>--%>
          <%--<div class="tabmain">77777</div>--%>
          <%--<div class="tabmain">8888</div>--%>
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
            <%--<li class="on">郑松</li>--%>
            <%--<li>曹伟1</li>--%>
            <%--<li>曹伟2</li>--%>
            <%--<li>曹伟3</li>--%>
            <%--<li>曹伟4</li>--%>
            <%--<li>曹伟5</li>--%>
            <%--<li>曹伟6</li>--%>
            <%--<li>曹伟7</li>--%>
          </ul>
            <c:forEach var="engineer" items="${engineers}" varStatus="status">
            <c:if test="${status.index == 8}">
                <div class="tabmain" style="display:block;">
                    <div class="info"> <img src="${engineer.image}" width="100" height="122" class="img" /> <b>${engineer.name}&nbsp;&nbsp;&nbsp;&nbsp;${engineer.title}</b> 年龄：${engineer.age}岁<br />
                        主要项目经历：${engineer.experiences}</div>
                    <h3>工程师资质</h3>
                        ${engineer.aptitude}
                </div>
            </c:if>
            <c:if test="${status.index > 8 && status.index < 16}">
            <div class="tabmain">
                <div class="info"> <img src="${engineer.image}" width="100" height="122" class="img" /> <b>${engineer.name}&nbsp;&nbsp;&nbsp;&nbsp;${engineer.title}</b> 年龄：${engineer.age}岁<br />
                    主要项目经历：${engineer.experiences}</div>
                <h3>工程师资质</h3>
                    ${engineer.aptitude}
                </c:if>
                </c:forEach>
          <%--<div class="tabmain" style="display:block;">--%>
            <%--<div class="info"> <img src="/img/sermain_pre7.jpg" width="100" height="122" class="img" /> <b>曹斌&nbsp;&nbsp;&nbsp;&nbsp;数据备份资深工程师</b> 年龄：28岁<br />--%>
              <%--主要项目经历：<br />--%>
              <%--● 林肯电气DR&nbsp;&nbsp;&nbsp;&nbsp;● 上汽制动NBU升级&nbsp;&nbsp;&nbsp;&nbsp; ● 中钞油墨NBU升级迁移<br />--%>
              <%--● 小南国NBU&nbsp;&nbsp;&nbsp;&nbsp;● 电力医院DR项目&nbsp;&nbsp;&nbsp;&nbsp; ● 李锦记Altiris+BE+SEP<br />--%>
              <%--● 华谊NBU5220</div>--%>
            <%--<h3>工程师资质</h3>--%>
            <%--MCP system center \ hyper-v、STS for NBU\DLP\SEP<br />--%>
          <%--</div>--%>
          <%--<div class="tabmain">222222222222222</div>--%>
          <%--<div class="tabmain">33333333333</div>--%>
          <%--<div class="tabmain">4444</div>--%>
          <%--<div class="tabmain">55555</div>--%>
          <%--<div class="tabmain">66666</div>--%>
          <%--<div class="tabmain">77777</div>--%>
          <%--<div class="tabmain">8888</div>--%>
        </div>
      </div>
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
<%@include file="common/weibo.jsp"%>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/js/runsn.js"></script>
<script type="text/javascript">
    $(function () {
        $(".num1").addClass("active");
    });
</script>
</body>
</html>