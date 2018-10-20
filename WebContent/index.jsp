<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	This is homepage for shopping
	<!-- helloMVC의 home이라는 곳에 login이라는 파라미터 넘어가면서 액션-->
	<!-- 이 url을 처리하는 home.servlet을 만들자 -->
	<p> <a href="/helloMVC/home?action=login"> go to login page</a> 
	<p> <a href="/helloMVC/home?action=help"> go to help page</a>
</body>
</html>