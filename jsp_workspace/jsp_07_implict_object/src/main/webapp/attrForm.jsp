<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>attrForm.jsp</title>
</head>
<body>
	<form action="attrTest1.jsp" method="POST">
		id : <input type="text" name="id" />
		<button>확인</button>
	</form>
</body>
</html>