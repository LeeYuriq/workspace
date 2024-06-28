<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- JSP도 Servlet 이다  -->
    
    
<!-- 선언문 -->
<%! 
	private String s = "test";	// 변수 선언 - Field
	private int count = 0;		// Field
	
	// member method - 인스턴스 멤버 
	public void setText(String str){
		// int a = 10;
		s += str;
		count++;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>time.jsp</title>
</head>
<body>
	<h1>TIME JSP</h1>
	
	
	<!-- 스크립틀릿 태그 -->
	<%  
		// 자바 실행 코드(로직 코드) 작성 공간
		setText("부에엥");
		request.setCharacterEncoding("utf-8");
		out.println(" 랄라"); // 표현문에 한거랑 같다
		
		java.text.SimpleDateFormat
			sdf = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(System.currentTimeMillis());
	%>
	
	
	<!-- 표현문 -->
	<%= s %>
	<br/>
	count : <%= count %>
	
</body>
</html>