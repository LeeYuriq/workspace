
<%-- 하나씩 import 해도되고 
	<%@ page import="java.text.SimpleDateFormat" %>
	<%@ page import="java.util.*" %>
	
	아래 처럼 쉼표를 기준으로 여러개 import 해도 된다.
--%>

<%@ page import="java.text.*, java.util.*" language="java" contentType="text/html; charset=UTF-8" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP import</title>
</head>
<body>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		out.print(date+"<br/>");
	%>
</body>
</html>