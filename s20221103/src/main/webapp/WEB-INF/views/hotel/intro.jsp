<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Intro</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<style type="text/css">
.container {
	width: 100%;
}

.hotel_mainImg {
	width: 100%;
	background: url("/img/hotel/hotel_main.PNG");
	background-repeat: no-repeat;
	height: 150px;
}
	
.hotel_title {
    font-size: 50px;
   	color: #222;
   	letter-spacing: 0;
    text-align: center;
    line-height: 1em;
    margin: 35px 0 20px 0;
    font-family: 'Jua', sans-serif;
}

ul {
	list-style: none;
	display: flex;
}

.establishment {
	margin-right: 30px;
}



dl {
	position: relative;
	text-align: center;
}
</style>
</head>
<body class="d-flex flex-column min-vh-100">
	<div class="container">  <!--- container ------------------------------------------------>
		<div class="hotel_mainImg">
			사진다시 고르기
		</div>
		
		<div class="hotel_title">
			반려동물 호텔
		</div>
		<div class="hotel_establishment">
			<ul>
				<li class="establishment">
					<img alt="" src="/img/hotel/outside.jpg">
					<dl>
						<dt>넓은 야외공간</dt>
					</dl>
				</li>
				<li class="establishment">
					<img alt="" src="/img/hotel/public.jpg">
					<dl>
						<dt>다양한 공공시설</dt>
					</dl>
				</li>
				<li class="establishment">
					<img alt="" src="/img/hotel/care.jpg" style="height: 200px; width: 288px;">
					<dl>
						<dt>데일리 케어</dt>
					</dl>
				</li>
			</ul>
		</div>
		<div class="hotel_room">
			방사진들 ~
		</div>
	</div> <!--- container ----------------------------------------------------------------->
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>