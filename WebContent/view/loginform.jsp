<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- doLogin에 request 보낼거야 -->
	<form action="/helloMVC/doLogin" method="get">
		Customer ID (id001, id002, id003, id004, id005)
		<input type="text" name ="customerId"><br/> 
		<!--  /일반적으로 데베에 커스터머 정보를 넣고 가져오는데 우리가 아직안햇응까 해시맵하자-->
		<input type="submit" value="press"><br/>	
	</form>
</body>
</html>