<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<!-- 드롭다운 기능을 가능하게 해주는 popper.js -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" 
integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>

</head>
<body>

<div id="main">
    <div class="container">
        <div class="text-center my-5">
            <h2>로그인</h2>
            <p class="lead">이용하려는 서비스 계정으로 로그인 </p>
        </div>
        <div class="row justify-content-center my-10">
            <div class="col-lg-6">
                <form action="#">
                    <label for="username" class="form-label my-2">ID:</label>
                    <input type="text" id="username" name="username" placeholder="id" class="form-control"/>

                    <label for="name" class="form-label my-2">PASSWORD:</label>
                    <input type="text" id="password" name="password" placeholder="password" class="form-control"/>

                    <label for="role" class="form-label my-2">로그인 권한:</label>
                    <select name="role" id="role" class="form-select">
                        <option value="admin">관리자</option>
                        <option value="instructor">선생님</option>
                        <option value="member">보호자(회원)</option>
                    </select>

				<div class="my-3 justify-content-end my-2">
					<!-- <button type="button" class="btn btn-outline-secondary">회원가입</button>
					<button type="button" class="btn btn-outline-secondary">메인화면</button> -->
					
					<div class="d-grid gap-2 d-md-flex justify-content-md-end">
                        <a href="signinForm.html"><button class="btn btn-warning me-md-2" type="button">회원가입</button></a>
                        <a href="/index"><button class="btn btn-warning" type="button">메인화면</button></a>
					</div>
				</div>	
				</form>
               </div>
              </div>
             </div>
</div>

<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>