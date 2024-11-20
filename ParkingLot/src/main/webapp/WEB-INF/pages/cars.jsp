<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="ParkingLot">
    <h1>Cars</h1>
    <div class="container text-center">
        <c:forEach var="car" items="${cars}">
        <div class="row">
            <div class="col">
                ${car.licensePlate}
            </div>
            <div class="col">
                ${car.parkingSpot}
            </div>
            <div class="col">
                ${car.ownerName}
            </div>
        </div>
        </c:forEach>
    </div>
    <h5>Free parking spots : ${numberOfFreeParkingSpots}</h5>
</t:pageTemplate>

