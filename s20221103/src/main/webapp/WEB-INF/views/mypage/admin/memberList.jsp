<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<% String context2 = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/WEB-INF/views/include/sidebar.jsp" %>
<h1>회원 관리</h1>
	<table border="1">
		<tr><th>보호자명</th><th>반려견명</th><th>강아지 성별</th><th>나이</th><th>견종명</th><th>회원등급</th><th>서비스만료일</th></tr>
		<c:forEach var="memDog" items="${selMemberDogList}">
			<tr><td>${memDog.memberName }</td><td>${memDog.memberName }</td>
				<td>${memDog.memberName }</td><td>${memDog.memberName }</td>
				<td>${memDog.memberName }</td><td>${memDog.memberName }</td>
				<td>${memDog.memberName }</td></tr>
		</c:forEach>
	</table>


<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>