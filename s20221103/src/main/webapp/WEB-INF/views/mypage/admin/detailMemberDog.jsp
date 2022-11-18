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
<h1>회원 정보</h1>
	<table border="1">
		<tr><th>이름</th><th>연락처</th><th>주소</th><th>반려견명</th><th>성별</th><th>나이</th>
			<th>견종명</th><th>회원등급</th><th>서비스만료일</th><th>메모(특이사항)</th></tr>
			<input type="hidden" value="${selMemberDogList.id}">
		<c:forEach var="memDog" items="${selMemberDogList}">
			<input type="hidden" value="${memDog.id}">
			<tr><td>${memDog.member_name }</td><td>${memDog.member_call }</td><td>${memDog.member_address }</td><td>${memDog.dog_name }</td>
				<td>${memDog.dog_gender }</td><td>${memDog.dog_age }</td><td>${memDog.dog_kind }</td>
				<td>${memDog.role }</td><td>${memDog.sc_enddate }</td><td>${memDog.dog_memo }</td></tr>
		</c:forEach>
	</table>


<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>