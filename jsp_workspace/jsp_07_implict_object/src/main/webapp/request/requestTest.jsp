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
	<!-- 
		<form 내부에서 사용 할 수 있는 속성>
		enctype : 어떤 인코딩 형식으로 전달할 건지(POST 로 전송되는 데이터의 인코딩 설정)
		action : 어디로 전달 할 것인가(요청경로) 
		method : 전송방식 
		
		
		<enctype 3가지>
		enctype="application/x-www-form-urlencoded"(*기본값*)
			전송되는 모든 문자들을 서버로 보내기 전에 인코딩 됨을 명시
			(한글을 3바이트로 변환)
			
		enctype="text/plain"
			일반문자 - 공백은 + 기호로 변환하지만 나머지 문자는 인코딩 되지 않음을 명시
		
		enctype="multipart/form-data"
			전달되는 데이터에 이진 데이터가 포함되어 있으므로 모든 문자를 인코딩 하지 않음을 명시
			이 방식은 문자가 아닌 데이터(이미지,파일)등을 서버에 전송할 때 사용.(파일 업로드)
	-->
	
	<form action="requestResult.jsp" method="POST">
	<!-- enctype="text/plain" -->
		이름 : <input type="text" name="name" /> <br/>
		성별 : <input type="radio" name="gender" value="male"/> 남 
			  <input type="radio" name="gender" value="female" checked/> 여 <br/>
		취미 : <input type="checkbox" name="hobbies" value="축구"/> 축구
			  <input type="checkbox" name="hobbies" value="database"/> database
			  <input type="checkbox" name="hobbies" value="자바"/> 자바
			  <input type="checkbox" name="hobbies" value="여행"/> 여행 <br/>
			  <input type="submit" />
	</form>
</body>
</html>