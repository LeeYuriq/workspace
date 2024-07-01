<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr/>
	<!-- 쿠키 : 사용자 pc에 브라우저별로 저장되는 것 -->
	<h1>ADD COOKIE</h1>
	<hr/>
	<%
		/* 
			Max-Age 는 초단위
			60 * 60 * 24 * 30
			30 일 동안 쿠키 유지 
		*/
		// 1번째 방법
		// response.addHeader("Set-Cookie", "id=id001; Max-Age=2592000; path=/");
		
	
		// 2번째 방법
		Cookie cookie = new Cookie("PM_NAME","최기근");
		cookie.setMaxAge(2592000);
		cookie.setPath("/");
		response.addCookie(cookie);
	%>
	
	<a href="index.jsp">메인으로</a>
	
</body>
</html>