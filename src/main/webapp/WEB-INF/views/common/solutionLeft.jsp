<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="sLeft collapse">
    <h3>按业务需求分</h3>

    <c:forEach var="requirementSolution" items="${requirementSolutions}" varStatus="status1">
        <c:if test="${status1.index==0}">
            <dl class="on"><dt>${requirementSolution[0].documentType.title3}</dt><dd>
        </c:if>
        <c:if test="${status1.index!=0}">
            <dl><dt>${requirementSolution[0].documentType.title3}</dt><dd>
        </c:if>
        <c:forEach var="documentDetail" items="${requirementSolution}" varStatus="status2">
            <a href="/solutionTemplate/${documentDetail.document.id}">${documentDetail.document.name}</a>
        </c:forEach>
            </dd></dl>
    </c:forEach>

    <%--<dl class="on">--%>
        <%--<dt>虚拟化基础架构建设</dt>--%>
        <%--<dd><a href="solution_1.html">思科大型企业解决方案</a>--%>
            <%--<a href="solution_1.html">思科中小型企业解决方案</a>--%>
            <%--<a href="solution_1.html">A集团主机虚拟化项目解决方案</a>--%>
            <%--<a href="solution_1.html">GJ香料集团存储整合项目解决方案</a>--%>
            <%--<a href="solution_1.html">M服装集团IT基础架构升级解决方案</a>--%>
            <%--<a href="solution_1.html">N理财机构存储改造项目解决方案</a>--%>
            <%--<a href="solution_1.html">N餐饮集团虚拟化整合项目解决方案</a>--%>
            <%--<a href="solution_1.html">上海S机械有限公司VMware虚拟化解决方案</a>--%>
            <%--<a href="solution_1.html">YZ集团VMware虚拟化解决方案</a>--%>
            <%--<a href="solution_1.html">AAA农业集团基础平台建设解决方案</a>--%>
            <%--<a href="solution_1.html">ABC企业基础平台建设解决方案</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>数据存储架构建设</dt>--%>
        <%--<dd><a href="#">222</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>企业网络基础硬件架构建设</dt>--%>
        <%--<dd><a href="#">3333</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>企业级无线覆盖交互</dt>--%>
        <%--<dd><a href="#">4444</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>企业级数据安全解决方案</dt>--%>
        <%--<dd><a href="#">5555</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>服务器及应用负载均衡</dt>--%>
        <%--<dd><a href="#">6666</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>企业基础应用搭建</dt>--%>
        <%--<dd><a href="#">7777</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>桌面端应用发布</dt>--%>
        <%--<dd><a href="#">8888</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>数据挖掘及分析</dt>--%>
        <%--<dd><a href="#">9999</a></dd>--%>
    <%--</dl>--%>

    <h3>按行业分</h3>

            <c:forEach var="requirementSolution" items="${bizSolutions}" varStatus="status1">
                <dl><dt>${requirementSolution[0].documentType.title3}</dt><dd>
                    <c:forEach var="documentDetail" items="${requirementSolution}" varStatus="status2">
                        <a href="/solutionTemplate/${documentDetail.document.id}">${documentDetail.document.name}</a>
                    </c:forEach>
                </dd></dl>
                </c:forEach>
    <%--<dl>--%>
        <%--<dt>教育</dt>--%>
        <%--<dd><a href="#">1111</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>医疗</dt>--%>
        <%--<dd><a href="#">222</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>酒店</dt>--%>
        <%--<dd><a href="#">3333</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>金融</dt>--%>
        <%--<dd><a href="#">3333</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>制造业</dt>--%>
        <%--<dd><a href="#">3333</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>房地产</dt>--%>
        <%--<dd><a href="#">3333</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>物流运输</dt>--%>
        <%--<dd><a href="#">3333</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>IT及通信</dt>--%>
        <%--<dd><a href="#">3333</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>快消及零售</dt>--%>
        <%--<dd><a href="#">3333</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>其他</dt>--%>
        <%--<dd><a href="#">3333</a></dd>--%>
    <%--</dl>--%>

    <h3>按公司规模分</h3>
            <c:forEach var="requirementSolution" items="${sizeSolutions}" varStatus="status1">
            <dl><dt>${requirementSolution[0].documentType.title3}</dt><dd>
                <c:forEach var="documentDetail" items="${requirementSolution}" varStatus="status2">
                    <a href="/solutionTemplate/${documentDetail.document.id}">${documentDetail.document.name}</a>
                </c:forEach>
            </dd></dl>
            </c:forEach>
    <%--<dl>--%>
        <%--<dt>中小企业</dt>--%>
        <%--<dd><a href="#">111</a></dd>--%>
    <%--</dl>--%>
    <%--<dl>--%>
        <%--<dt>大型企业</dt>--%>
        <%--<dd><a href="#">2222</a></dd>--%>
    <%--</dl>--%>

</div>