<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="header">
    <div class="w940">
        <div class="topmain">
            <div class="r_top">
                <div class="search">
                    <input name="" type="text" class="inputText" title="search" />
                </div>
                <div class="other"><b class="MyRunsn">My runsn</b><a href="#" target="_blank">注册</a> | <a href="#" target="_blank">登录</a> | <a href="#" target="_blank">员工之家</a></div>
            </div>
            <a href="/" class="logo" title="runsn软盛">runsn软盛</a> </div>
        <ul class="nav">
            <li class="num1">
                <a href="/service.html">服务</a>
      <span class="menu m1">
      <b>服务</b>
      <c:forEach var="service2" items="${services}">
          <a href="/serviceTemplate/${service2.id}">${service2.name}</a>
      </c:forEach>
      <a href="/service_7.html">Runsn工程师资质</a>
      </span> </li>
            <li class="num2"><a href="/solution.html">解决方案</a>
      <span class="menu m2">
      <span class="r_menu">
          <c:forEach var="requirementSolution" items="${requirementSolutions}">
              <span class="submenu">
                  <c:forEach var="documentDetail" items="${requirementSolution}">
                          <a href="/solutionTemplate/${documentDetail.document.id}">${documentDetail.document.name}</a>
                  </c:forEach>
              </span>
          </c:forEach>

          <c:forEach var="bizSolution" items="${bizSolutions}">
              <span class="submenu">
                  <c:forEach var="documentDetail" items="${bizSolution}">
                          <a href="/solutionTemplate/${documentDetail.document.id}">${documentDetail.document.name}</a>
                  </c:forEach>
              </span>
          </c:forEach>

            <c:forEach var="sizeSolution" items="${sizeSolutions}">
              <span class="submenu">
                  <c:forEach var="documentDetail" items="${sizeSolution}">
                          <a href="/solutionTemplate/${documentDetail.document.id}">${documentDetail.document.name}</a>
                  </c:forEach>
              </span>
            </c:forEach>
      <%--<span class="submenu">--%>
      <%--<a href="solution_1.html">思科大型企业解决方案</a>--%>
      <%--<a href="solution_1.html">思科中小型企业解决方案</a>--%>
      <%--<a href="solution_1.html">A集团主机虚拟化项目解决方案</a>--%>
      <%--<a href="solution_1.html">GJ香料集团存储整合项目解决方案</a>--%>
      <%--<a href="solution_1.html">M服装集团IT基础架构升级解决方案</a>--%>
      <%--<a href="solution_1.html">N理财机构存储改造项目解决方案</a>--%>
      <%--<a href="solution_1.html">N餐饮集团虚拟化整合项目解决方案</a>--%>
      <%--<a href="solution_1.html">上海S机械有限公司VMware虚拟化解决方案</a>--%>
      <%--<a href="solution_1.html">YZ集团VMware虚拟化解决方案</a>--%>
      <%--<a href="solution_1.html">AAA农业集团基础平台建设解决方案</a>--%>
      <%--<a href="solution_1.html">ABC企业基础平台建设解决方案</a></span>--%>
      <%--<span class="submenu">22222</span>--%>
      <%--<span class="submenu">333333</span>--%>
      <%--<span class="submenu">44444</span>--%>
      <%--<span class="submenu">55555</span>--%>
      <%--<span class="submenu">66666</span>--%>
      <%--<span class="submenu">77777</span>--%>
      <%--<span class="submenu">8888</span>--%>
      <%--<span class="submenu">99999</span>--%>
      <%--<span class="submenu">10</span>--%>
      <%--<span class="submenu">11</span>--%>
      <%--<span class="submenu">12</span>--%>
      <%--<span class="submenu">13</span>--%>
      <%--<span class="submenu">14</span>--%>
      <%--<span class="submenu">15</span>--%>
      <%--<span class="submenu">16</span>--%>
      <%--<span class="submenu">17</span>--%>
      <%--<span class="submenu">18</span>--%>
      <%--<span class="submenu">19</span>--%>
      <%--<span class="submenu">20</span>--%>
      <%--<span class="submenu">21</span> --%>
      </span>
      <span class="m2body"><b>解决方案</b>
      <span class="col">按业务需求分</span>
          <c:forEach var="requirementSolution" items="${requirementSolutions}">
              <c:forEach var="documentDetail" items="${requirementSolution}" varStatus="status">
                  <c:if test="${status.index==0}">
                      <a>${documentDetail.documentType.title3}</a>
                  </c:if>
              </c:forEach>
          </c:forEach>
      <%--<a href="solution_1.html">虚拟化基础架构建设</a>--%>
      <%--<a href="solution_1.html">数据存储架构建设</a>--%>
      <%--<a href="solution_1.html">企业网络基础硬件架构建设</a>--%>
      <%--<a href="solution_1.html">企业级无线覆盖交互</a>--%>
      <%--<a href="solution_1.html">企业级数据安全解决方案</a>--%>
      <%--<a href="solution_1.html">服务器及应用负载均衡</a>--%>
      <%--<a href="solution_1.html">企业基础应用搭建</a>--%>
      <%--<a href="solution_1.html">桌面端应用发布</a>--%>
      <%--<a href="solution_1.html">数据挖掘及分析</a>--%>
      <span class="col">按行业分</span>
          <c:forEach var="bizSolution" items="${bizSolutions}">
              <c:forEach var="documentDetail" items="${bizSolution}" varStatus="status">
                  <c:if test="${status.index==0}">
                      <a>${documentDetail.documentType.title3}</a>
                  </c:if>
              </c:forEach>
          </c:forEach>
      <%--<a href="solution_1.html">教育</a>--%>
      <%--<a href="solution_1.html">医疗</a>--%>
      <%--<a href="solution_1.html">酒店</a>--%>
      <%--<a href="solution_1.html">金融</a>--%>
      <%--<a href="solution_1.html">制造业</a>--%>
      <%--<a href="solution_1.html">房地产</a>--%>
      <%--<a href="solution_1.html">物流运输</a>--%>
      <%--<a href="solution_1.html">IT及通信</a>--%>
      <%--<a href="solution_1.html">快消及零售</a>--%>
      <%--<a href="solution_1.html">其他</a>--%>
      <span class="col">按公司规模分</span>
          <c:forEach var="sizeSolution" items="${sizeSolutions}">
              <c:forEach var="documentDetail" items="${sizeSolution}" varStatus="status">
                  <c:if test="${status.index==0}">
                      <a>${documentDetail.documentType.title3}</a>
                  </c:if>
              </c:forEach>
          </c:forEach>
      <%--<a href="solution_1.html">中小企业</a>--%>
      <%--<a href="solution_1.html">大型企业</a>--%>
      </span> </span> </li>
            <li class="num3"><a href="/product.html">产品</a>
      <span class="menu m3">
      <b>产品</b>
      <span class="col">需求</span>
      <c:forEach var="productClass" items="${productClasss}">
          <a href="/productClass/${productClass.classId}">${productClass.className}</a>
      </c:forEach>
      <%--<a href="#">虚拟化基础架构建设</a>--%>
      <%--<a href="#">数据存储架构建设</a>--%>
      <%--<a href="#">企业网络基础硬件架构建设</a>--%>
      <%--<a href="#">企业级无线覆盖交互</a>--%>
      <%--<a href="#">企业级数据安全解决方案</a>--%>
      <%--<a href="#">服务器及应用负载均衡</a>--%>
      <span class="col">品牌</span>
      <c:forEach var="brand" items="${productBrands}">
          <a href="/productClass/${brand.classId}">${brand.brandName}</a>
      </c:forEach>
      <%--<a href="#">Citrix</a>--%>
      <%--<a href="#">HP</a>--%>
      <%--<a href="#">Symantec</a>--%>
      <%--<a href="#">Cisco</a>--%>
      <%--<a href="#">Microsoft</a>--%>
      <%--<a href="#">Vmware</a>--%>
      <%--<a href="#">EMC</a>--%>
      <%--<a href="#">Adobe</a>--%>
      <%--<a href="#">Aruba</a>--%>
      <%--<a href="#">Juniper</a>--%>
      <%--<a href="#">INFORMATICA</a>--%>
      <%--<a href="#">IMATION</a>--%>
      <%--<a href="#">综合产品线</a> --%>
      </span> </li>
            <li class="num4"><a href="/activity.html">主题活动</a>
      <span class="menu m4">
      <b>主题活动</b>
      <a href="/activity.html">精彩促销</a>
      <a href="/activity_1.html">厂商&amp;活动</a>
      <a href="/activity_2.html">邀请函</a> </span> </li>
            <li class="num5"><a href="/train.html">培训课堂</a>
      <span class="menu m5">
      <b>培训课堂</b>
          <%--<c:forEach var="train" items="${trains}">--%>
              <%--<c:if test="${train.mainLevel==0}">--%>
                <%--<a href="/template/${train.id}">${train.name}</a>--%>
              <%--</c:if>--%>
          <%--</c:forEach>--%>
      <a href="/train_2.html">新闻</a>
      <a href="/train_1.html">合作伙伴</a>
      <a href="#">培训资质</a>
      <a href="#">培训课程表</a>
      <a href="#">明星讲师</a>
      </span> </li>
            <li class="num6"><a href="#">I Partner</a></li>
            <li class="num7"><a href="/company.html">公司</a>
      <span class="menu m7">
      <b>公司</b>
      <a href="/company_1.html">为何选择runsn</a>
      <a href="/company_2.html">关于软盛</a>
      <a href="/company_3.html">成功用户</a>
      <a href="/company.html">荣誉资质</a>
      <a href="/company.html">活动</a>
      <a href="/company.html">构建企业智慧云</a>
      <a href="/company.html">职业发展</a>
      <a href="/company_8.html">联系我们</a> </span> </li>
        </ul>
    </div>
</div>