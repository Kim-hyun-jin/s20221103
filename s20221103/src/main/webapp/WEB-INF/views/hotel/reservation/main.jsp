<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hotel reservation main</title>
<link href="/css/hotel/reservation.css" rel="styleSheet" type="text/css">
</head>
<body>
	<h1>호텔 예약하기</h1>
	<div id="container" class="container">
		<div id="content" class="content">
			<form action="">
				<c:forEach var="room" items="roomList">
				 <input type="radio" name="roomType" value="${room.roomType }">${romm.roomType }
				</c:forEach>
			</form>
		</div>
	</div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>