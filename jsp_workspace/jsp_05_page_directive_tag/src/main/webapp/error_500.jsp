<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<!-- 
				에러 페이지니까 예외를 사용하려면 page isErrorPage="true"해야하고
				page isErrorPage="false"하면 에러 페이지가 아닌걸로 돼서 예외를 사용하지 못한다.
			 -->
	<h1>알 수 없는 오류 - <%= exception.getMessage() %></h1>
	<h2>이용에 불편을 드려 죄송합니다</h2>
	<h4>(- -)(_ _)(- -)(_ _)</h4>
	<h5>oT^To</h5>
	<a href="index.jsp">메인으로</a>
</body>
</html>