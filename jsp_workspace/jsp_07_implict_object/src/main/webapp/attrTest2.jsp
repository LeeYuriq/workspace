<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>attrTest2.jsp</title>
</head>
<body>
	<%
		String email = request.getParameter("email");
	
		// 새로 생성된 요청에는 id가 포함되어 있지 않음.
		String id = request.getParameter("id");
		
		request.setAttribute("requestEmail", email);
		session.setAttribute("sessionEmail", email);
		
	%>
	<h3>request param id : <%= id %></h3>
	<h3>request param email : <%= email %></h3>
	<hr/>
	<h4>pageContext id : <%= pageContext.getAttribute("pageId") %></h4>
	<h4>request email : <%= request.getAttribute("requestEmail") %></h4>
	<h4>session email : <%= session.getAttribute("sessionEmail") %></h4>
	<h4>application id : <%= application.getAttribute("appId") %></h4>
	<hr/>
	<h4></a><a href="attrTest3.jsp">새로운 요청 시 확인</a></h4> 
	
</body>
</html>