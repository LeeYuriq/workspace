<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--  contentType에 charset=UTF-8 이 지정되어있으면  
		pageEncoding="UTF-8" 은 필요없다.-->

<!-- include file 의 절대경로는 webapp -->
<%@ include file="/common/header.jsp" %>
<section>
	<h2>SECOND JSP</h2>
	<article>
		<textarea>Hello World!</textarea>
	</article>
</section>
<%@ include file="/common/footer.jsp" %>