package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberRegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public MemberRegisterServlet() {
		System.out.println("==============================");
		System.out.println("MemberRegisterServlet 생성");
		System.out.println("==============================");
	}// end MemberRegisterServlet
	 
											 // 요청                        // 응답
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		System.out.println("MemberRegisterServlet doPost 호출");
		
		// 톰캣 서버 버전이 10부터 배포서술자에 utf-8로 서술할 수 있도록 미리 지정해놨음.
		// 그 이전 버전은 아래처럼 요청/응답 할 시에 적어줘야함
		request.setCharacterEncoding("utf-8");
		
		// 전달된 데이터중에 이름이 "뭐시기" 인 것의 값을 불러온다.
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String mobile = request.getParameter("mobile");
		
		// 동일한 name으로 값을 전달할 때는 문자열 배열로 전달할 수 있다.
		String[] hobbys = request.getParameterValues("hobbys"); 
		
		System.out.println("name : " + name);
		System.out.println("addr : " + addr);
		System.out.println("mobile : " + mobile);
		System.out.println("hobbys : " + Arrays.toString(hobbys));
		
		// MIME type(마임타입) or Media type : 출력되기 전에 지정해준다
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		// image/png, image/gif
		// video/mp4
		
		// 요청 처리 응답
		PrintWriter out = response.getWriter();
		out.println("이름 : " + name + "<br/>");
		out.println("주소 : " + addr + "<br/>");
		out.println("전화번호 : " + mobile + "<br/>");
		out.println("선택한 취미 : " + Arrays.toString(hobbys) + "<br/>");
		out.println("<a href='index.html'>메인으로</a>");
		
	}// end doPost()

}// end MemberRegisterServlet class
