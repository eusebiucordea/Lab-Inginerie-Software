<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>
    <div class="container text-center">
        <c:forEach var="car" items="${cars}">
            <div class="row">
                <div class="col">
                        ${user.licensePlate}
                </div>
                <div class="col">
                        ${user.parkingSpot}
                </div>
            </div>
        </c:forEach>
    </div>
</t:pageTemplate>
