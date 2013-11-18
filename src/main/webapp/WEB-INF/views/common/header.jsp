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
                <a href="/serviceTemplate/60">服务</a>
      <span class="menu m1">
      <b>服务</b>
      <c:forEach var="service2" items="${services}">
          <a href="/serviceTemplate/${service2.id}">${service2.name}</a>
      </c:forEach>
      <a href="/service_7.html">Runsn工程师资质</a>
      </span> </li>
            <li class="num2"><a href="/solutionTemplate/71">解决方案</a>
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
      <span class="col">按行业分</span>
          <c:forEach var="bizSolution" items="${bizSolutions}">
              <c:forEach var="documentDetail" items="${bizSolution}" varStatus="status">
                  <c:if test="${status.index==0}">
                      <a>${documentDetail.documentType.title3}</a>
                  </c:if>
              </c:forEach>
          </c:forEach>
      <span class="col">按公司规模分</span>
          <c:forEach var="sizeSolution" items="${sizeSolutions}">
              <c:forEach var="documentDetail" items="${sizeSolution}" varStatus="status">
                  <c:if test="${status.index==0}">
                      <a>${documentDetail.documentType.title3}</a>
                  </c:if>
              </c:forEach>
          </c:forEach>
      </span> </span> </li>
            <li class="num3"><a href="/product.html">产品</a>
      <span class="menu m3">
      <b>产品</b>
      <span class="col">需求</span>
      <c:forEach var="productClass" items="${productClasss}">
          <a href="/productClass/${productClass.id}">${productClass.className}</a>
      </c:forEach>
      <span class="col">品牌</span>
      <c:forEach var="brand" items="${productBrands}">
          <a href="/productClass/${brand.firstClass}">${brand.brandName}</a>
      </c:forEach>
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
      <a href="/train_2.html">新闻</a>
      <a href="/train_1.html">合作伙伴</a>
      <a href="/train.html#b">培训资质</a>
      <a href="/train.html#a">培训课程表</a>
      <a href="/train.html#c">明星讲师</a>
      </span> </li>
            <li class="num6"><a href="/building.html">I Partner</a></li>
            <li class="num7"><a href="/company.html">公司</a>
      <span class="menu m7">
      <b>公司</b>
      <a href="/company_1.html">为何选择runsn</a>
      <a href="/company_2.html">关于软盛</a>
      <a href="/company_3.html">成功用户</a>
      <a href="/company_4.html">荣誉资质</a>
      <a href="/company.html">活动</a>
      <a href="/company_5.html">构建企业智慧云</a>
      <a href="/company_6.html">职业发展</a>
      <a href="/company_8.html">联系我们</a> </span> </li>
        </ul>
    </div>
</div>