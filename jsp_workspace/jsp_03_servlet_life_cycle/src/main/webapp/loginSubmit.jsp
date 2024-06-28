<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginSubmit.jsp</title>
</head>
<body>
	<!-- html 문서에서 자바를 이용하는 JSP - JSP도 Servlet 이다. -->
	<h1>Java Server Page</h1>
	
	<!--  스크립틀릿 : 자바언어를 작성하는 공간 -->
	<% 
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
	%>
	
	<!-- 출력  -->
	<%= uid %> <br/>
	<%= upw %> <br/>
	<a href= "index.html">메인으로</a>
</body>
</html>