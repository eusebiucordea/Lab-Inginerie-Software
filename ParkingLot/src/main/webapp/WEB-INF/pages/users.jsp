<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>
    <form method="post" action="${pageContext.request.contextPath}/Users">
    <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
    <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/AddUser">Add User</a>
        <c:if test="${pageContext.request.isUserInRole('INVOICING')}">
        <button type="submit" class="btn btn-secondary">Invoice</button>
        </c:if>
    </c:if>
    <div class="container text-center">
        <c:forEach var="user" items="${users}">
            <div class="row">
                <div class="col">
                    <input type="checkbox" name="user_ids" value="${user.id}" />
                </div>
                <div class="col">
                        ${user.username}
                </div>
                <div class="col">
                        ${user.email}
                </div>
                <div class="col">
                    <a class="btn btn-secondary" href="${pageContext.request.contextPath}/EditUser?id=${user.id}">Edit User</a>
                </div>
            </div>
        </c:forEach>
    </div>
    </form>
    <c:if test="${not empty invoices}">
        <h2>Invoices</h2>
        <c:forEach var="username" items="${invoices}" varStatus="status">
            ${status.index + 1}. ${username}
            <br/>
        </c:forEach>
    </c:if>
</t:pageTemplate>
