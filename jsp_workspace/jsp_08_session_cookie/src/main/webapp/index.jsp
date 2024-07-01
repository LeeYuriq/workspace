<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<%@ include file="check.jsp" %>
	<h1>MAIN PAGE</h1>
	<a href="addCookie.jsp">쿠키 추가</a>
	
</body>
</html>