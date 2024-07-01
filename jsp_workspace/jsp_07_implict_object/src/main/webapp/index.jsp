<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index jsp</title>
</head>
<body>
	<h3>
		<a href="request/requestTest.jsp">request method 확인</a>
	</h3>
	<!-- 
		속성-영역 객체(저장하는 범위가 다르다)
		pageContext	   <    request  		<  		session    		< 		 application
		하나의 jsp page   하나의 요청에 대한 응답이	  브라우저가 종료 될 때 까지		서버가 종료 될 때 까지 유지
						완료 될 때 까지 유지
	 -->
	<h3>
		<a href="attrForm.jsp">속성-영역 객체 테스트</a>
	</h3>
	
	<h4>pageContext id : <%= pageContext.getAttribute("pageId") %></h4>
	<h4>request email : <%= request.getAttribute("requestEmail") %></h4>
	<h4>session email : <%= session.getAttribute("sessionEmail") %></h4>
	<h4>application id : <%= application.getAttribute("appId") %></h4>
	
	
</body>
</html>