<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="main">
	<div class="container">
		<form action="write" method="post">
			
				<div class="mb-3">
				  <label for="exampleFormControlInput1" class="form-label">Email address</label>
				  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
				</div>
				<div class="mb-3">
				  <label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
				  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
				</div>
				
				<div class="mb-3">
				  <label for="formFileMultiple" class="form-label">Multiple files input example</label>
				  <input class="form-control" type="file" id="formFileMultiple" multiple>
				</div>
				
				<button type="submit" class="btn btn-outline-secondary"></button>
			
		</form>
	</div>
</div>
	
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>