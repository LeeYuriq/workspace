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
	<a href="page_content_type.jsp">contentType 확인</a> <br/>
	<a href="page_import.jsp">import 확인</a> <br/>
	
	<!-- 에러 일때  -->
	<a href="null_error.jsp?age=이십오">error page test</a> <br/>
	
	<!-- 
		에러가 아닐때  
		<a href="null_error.jsp?age=25">error page test</a> <br/>
	-->
</body>
</html>