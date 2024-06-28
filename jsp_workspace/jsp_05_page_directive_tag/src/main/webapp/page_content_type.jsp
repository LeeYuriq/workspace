
<%-- script tag 주석 --%>

<%-- 
	ctrl + shift + /  범위주석
	<%@ page language="java" contentType="text/html; charset=UTF-8" %>
 --%>
 
 <%@ page pageEncoding="UTF-8" %>
<%--  <%@ page contentType="image/png" %> --%>
<!-- 브라우저가 알 수 없는 형식을 출력해달라고하면 사용자가 알아서 하라고 다운로드 받게 되어있다. -->
<%@ page contentType="text/html" %>

<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->
			

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content Type Test</title>
</head>
<body>
	<h1>Content Type</h1>
	<h2>안녕하세요!</h2>
	<a href="index.jsp">메인으로</a>
	
</body>
</html>