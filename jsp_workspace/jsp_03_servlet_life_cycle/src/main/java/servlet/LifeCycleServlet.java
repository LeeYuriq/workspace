package servlet;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet{
	
	// 노란줄 눌러서 Generate serialVersionUID
	private static final long serialVersionUID = 2117214983822497285L;
	
	
	// 생성자 추가
	public LifeCycleServlet() {
		System.out.println("LifeCycleServlet 생성");
		/*
		Class<LifeCycleServlet> servlet = Class.forName("servlet.LifeCycleServlet");
		LifeCycleServlet clazz = servlet.newInstance();
		*/
	}// end LifeCycleServlet

	
	// Servlet Class의 인스턴스가 생성되고 요청 처리할 준비가 완료되면 *최초에 한번 호출*되는 메소드
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("LifeCycleServlet init() 호출");
		String servletName = config.getServletName();
		System.out.println("Servlet Name : " + servletName);
		// setvlet 이 등록된 전체 애플리케이션 정보
		// 생성된 프로젝트 별로 한개의 context 객체 생성하여 공유 
		// (애플리케이션 context 객체)
		ServletContext application = config.getServletContext();
		String contextPath = application.getContextPath();
		System.out.println("context path : " + contextPath);
	}// end init
	

	// ****요청이 왔을때 servlet class 생성됨****
	// GET / POST *방식 상관없이 호출*되는것이 service
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LifeCycleServlet services 호출");
		// super.service(request, response);
		// 요청 전송 방식(method) 가지 : GET, POST
		String method = request.getMethod();
		System.out.println("요청 전송 방식 : "+method);
		// equalsIgnoreCase : 대소문자 상관없이
		if(method.equalsIgnoreCase("GET")) {
				doGet(request, response);
		}else {
			doPost(request, response);
		}
	}// end service
	
	
	// 방식이 틀려야할 때 각각 doGet, doPost 호출되도록.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LifeCycleServlet doGet 호출");
	}// end doGet

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LifeCycleServlet doPost 호출");
	}// end doPost

	/*
		재컴파일 되는 과정에서 기존에 생성됐던 
		서블릿 클래스의 인스턴스가 사라질때 호출되는것이고
		언제 호출되는지 확인하기 위해 destroy 사용
	*/
	@Override
	public void destroy() {
		System.out.println("LifeCycleServlet destroy 호출");
	}// end destroy
	

}// end LifeCycleServlet class
