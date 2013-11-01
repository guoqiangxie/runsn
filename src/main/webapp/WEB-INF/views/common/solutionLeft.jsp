<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="sLeft collapse">
    <h3>按业务需求分</h3>

    <c:forEach var="requirementSolution" items="${requirementSolutions}" varStatus="status1">
        <dl class="${requirementSolution[0].documentType.title2code}_${requirementSolution[0].documentType.title3code}"><dt>${requirementSolution[0].documentType.title3}</dt><dd>
        <c:forEach var="documentDetail" items="${requirementSolution}" varStatus="status2">
            <a href="/solutionTemplate/${documentDetail.document.id}">${documentDetail.document.name}</a>
        </c:forEach>
            </dd></dl>
    </c:forEach>

    <h3>按行业分</h3>
            <c:forEach var="requirementSolution" items="${bizSolutions}" varStatus="status1">
                <dl class="${requirementSolution[0].documentType.title2code}_${requirementSolution[0].documentType.title3code}"><dt>${requirementSolution[0].documentType.title3}</dt><dd>
                    <c:forEach var="documentDetail" items="${requirementSolution}" varStatus="status2">
                        <a href="/solutionTemplate/${documentDetail.document.id}">${documentDetail.document.name}</a>
                    </c:forEach>
                </dd></dl>
                </c:forEach>

    <h3>按公司规模分</h3>
            <c:forEach var="requirementSolution" items="${sizeSolutions}" varStatus="status1">
            <dl class="${requirementSolution[0].documentType.title2code}_${requirementSolution[0].documentType.title3code}"><dt>${requirementSolution[0].documentType.title3}</dt><dd>
                <c:forEach var="documentDetail" items="${requirementSolution}" varStatus="status2">
                    <a href="/solutionTemplate/${documentDetail.document.id}">${documentDetail.document.name}</a>
                </c:forEach>
            </dd></dl>
            </c:forEach>
</div>