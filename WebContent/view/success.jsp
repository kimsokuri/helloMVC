<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- JSP Expression Language--%>
	.
	<!--함수결과값customer가 넘어왔다. 여기서 사용 가능하다  -->
	<ul>
		<li>Id: ${customer.id}</li>
		<li>Name: ${customer.name}</li>
		<li>Email: ${customer.email}</li>
	</ul>
	
	<%-- JSTL--%>
	<!-- core태그에ㅇ 있는 forEach요소를 쓰겟다
	"customers"이름으로 넘어온 request 객체안에 잇는 customerlist를
	 하나하나꺼내서 customer라는 변수에 집어넣고
	id, name, email을 다 출력하겟다. -->
	<table>
		<c:forEach var="customer" items="${customers}"> 
			<tr>
				<td> ${customer.id}</td>
				<td> ${customer.name}</td>
				<td> ${customer.email}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>