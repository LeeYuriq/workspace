<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->
		<%@ page errorPage="error_500.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page Test</title>
</head>
<body>
	<% 
		String age = request.getParameter("age");
		int ageNum = Integer.parseInt(age);
	%>
	
	당신의 나이는 : <%= ageNum %> 입니다.
</body>
</html>