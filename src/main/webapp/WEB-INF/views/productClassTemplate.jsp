<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>产品-硬件 | 软盛</title>
<link href="/css/global.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="w948">
  <div class="p25">
    <div class="caption caption3">
      <h2>我们的产品渗透至企业级应用领域的各个层面</h2>
      <p>全系列产品源自经典品牌，兼顾客户独有需求，领跑个性化IT产品市场 ...</p>
    </div>
    <div class="sermain sPage1 proPage">
      <div class="sRight collapse">
        <dl>
          <dt><a href="#">数据存储</a></dt>
        </dl>
        <dl>
          <dt><a href="#">企业网络基础硬件</a></dt>
        </dl>
        <dl>
          <dt><a href="#">企业级无线覆盖交互</a></dt>
        </dl>
        <dl>
          <dt><a href="#">企业级数据安全</a></dt>
        </dl>
        <dl>
          <dt><a href="#">服务器及应用负载均衡</a></dt>
        </dl>
        <dl>
          <dt><a href="#">主题活动</a></dt>
        </dl>
        <dl>
          <dt><a href="#">培训课堂</a></dt>
        </dl>
        <div class="sAd"><img src="/img/promain_pre1.jpg" width="219" height="163" /></div>
      </div>
      <div class="sLeft">
      <div class="center">传统IT厂商纷纷投身于虚拟化的热潮中。他们的远见在于：虚拟服务器、虚拟应用和虚拟桌面，都可以以更低的成本通过数据中心有效地进行管理。
<br />虚拟化技术具有诸多短期优势。这不仅仅意味着用户可以节省不少硬件的开支，而且可以在更低成本、不需要太多空间的基础上实现增长。</div>
      <div class="txtlist tl2">
        <h3><a href="#">产品</a> &gt; 虚拟化基础</h3>
        <div class="main">
        <div class="m_l">
            <c:forEach var="types" items="${typesList}" varStatus="status1">
                <c:if test="${status1.index%2==0}">
                    <c:forEach var="type" items="${types}" varStatus="status2">
                        <c:if test="${status2.index==0}">
                            <b>${type.brandName}<span>${type.brandDesc}</span></b>
                        </c:if>
                        <a href="/productType/${type.brandId}/${type.typeId}">${type.typeName}</a>
                    </c:forEach>
                </c:if>
            </c:forEach>
        <%--<b>Vmware <span>全球桌面到数据中心虚拟化解决方案</span></b>--%>
        <%--<a href="product_3.html">vSphere</a>--%>
        <%--<a href="product_3.html">vCloud Suite</a>--%>
        <%--<a href="product_3.html">vCloud Director</a>--%>
        <%--<a href="product_3.html">vSphere Storage Appliance</a>--%>
        <%--<a href="product_3.html">Fusion</a>--%>
        <%--<a href="product_3.html">Workstation</a>--%>
        <%--<a href="product_3.html">Horizon Suite</a>--%>
        <%--<a href="product_3.html">Horizon Workspace</a>--%>
        <%--<a href="product_3.html">Horizon View</a>--%>
        <%--<a href="product_3.html">Horizon Mirage</a>--%>
        <%--<a href="product_3.html">vCenter Operations Manager for View </a>--%>
        <%--<a href="product_3.html">Zimbra </a>--%>
        <%--<a href="product_3.html">Socialcast by VMware</a>--%>
        <%--<a href="product_3.html">vCloud Networking & Security</a>--%>
        <%--<a href="product_3.html">vFabric Application Director</a>--%>
        <%--<a href="product_3.html">vFabric Application Performance Manager</a>--%>
        <%--<a href="product_3.html">vCenter Application Discovery Manager</a>--%>
        <%--<a href="product_3.html">vCenter AppSpeed</a>--%>
        <%--<a href="product_3.html">Studio</a>--%>
        <%--<a href="product_3.html">vFabric Hyperic</a>--%>
        <%--<a href="product_3.html">vSphere Hypervisor</a>--%>
        <%--<a href="product_3.html">Server</a>--%>
        <%--<a href="product_3.html">Player </a>--%>
        <%--<a href="product_3.html">vCenter Converter </a>--%>
        <%--<a href="product_3.html">vSphere Hypervisor</a>--%>
        <%--<a href="product_3.html">vFabric Suite</a>--%>
        <%--<a href="product_3.html">vFabric tc Server </a>--%>
        <%--<a href="product_3.html">vFabric RabbitMQ</a>--%>
        <%--<a href="product_3.html">vFabric GemFire</a>--%>
        <%--<a href="product_3.html">vFabric SQLFire</a>--%>
        <%--<a href="product_3.html">vFabric Data Director </a>--%>
        <%--<a href="product_3.html">vFabric Postgres </a>--%>
        <%--<a href="product_3.html">vFabric Web Server</a>--%>
        <%--<a href="product_3.html">vFabric Enterprise Ready Server</a>--%>
        <%--<a href="product_3.html">IT Business Management Suite</a>--%>
        <%--<a href="product_3.html">vCenter Chargeback Manager</a>--%>
        <%--<a href="product_3.html">Service Manager</a>--%>
        <%--<a href="product_3.html">VMmark </a>--%>
        <%--<a href="product_3.html">Capacity Planner </a>--%>
        <%--<a href="product_3.html">Cisco Nexus 1000V</a>--%>
        <%--<a href="product_3.html">VMware Compliance Checker for PCI </a>--%>
        <%--<a href="product_3.html">VMware Compliance Checker for vSphere</a>--%>
        <%--<a href="product_3.html">SUSE Linux Enterprise Server for VMware</a>--%>
        </div>
        <div class="m_r">
            <c:forEach var="types" items="${typesList}" varStatus="status1">
                <c:if test="${status1.index%2==1}">
                    <c:forEach var="type" items="${types}" varStatus="status2">
                        <c:if test="${status2.index==0}">
                            <b>${type.brandName}<span>${type.brandDesc}</span></b>
                        </c:if>
                        <a href="/productType/${type.brandId}/${type.typeId}">${type.typeName}</a>
                    </c:forEach>
                </c:if>
            </c:forEach>
        <%--<b>微软<span>全球桌面到数据中心虚拟化解决方案</span></b>--%>
        <%--<a href="product_3.html">服务器应用软件</a>--%>
        <%--<a href="product_3.html">应用软件</a>--%>
        <%--<a href="product_3.html">操作系统</a>--%>
        <%--<b>思杰<span>提供全球接入架构解决方案及服务</span></b>--%>
        <%--<a href="product_3.html">应用虚拟化</a>--%>
        <%--<a href="product_3.html">桌面虚拟化</a>--%>
        <%--<a href="product_3.html">服务器虚拟化</a>--%>
        </div>
        </div>
        
        </div>
      </div>
    </div>
    
    <div class="q_menu">
      <dl>
        <dt>软盛特色</dt>
        <dd><a href="#">服务</a></dd>
        <dd><a href="#">解决方案</a></dd>
        <dd><a href="#">产品</a></dd>
        <dd><a href="#">IPARTNER</a></dd>
      </dl>
      <dl>
        <dt>主题活动</dt>
        <dd><a href="#">促销活动</a></dd>
        <dd><a href="#">原厂信息</a></dd>
        <dd><a href="#">电子期刊</a></dd>
      </dl>
      <dl>
        <dt>培训课堂</dt>
        <dd><a href="#">新闻</a></dd>
        <dd><a href="train_1.html">合作伙伴</a></dd>
        <dd><a href="#">培训资质</a></dd>
        <dd><a href="#">培训课程表</a></dd>
        <dd><a href="#">明星讲师</a></dd>
      </dl>
      <dl class="bnone">
        <dt>公司</dt>
        <dd><a href="#">为何选择RUNSN</a></dd>
        <dd><a href="#">关于软盛</a></dd>
        <dd><a href="#">成功用户</a></dd>
        <dd><a href="#">荣誉资质</a></dd>
        <dd><a href="#">联系我们</a></dd>
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
        $(".num3").addClass("active");
    });
</script>
</body>
</html>