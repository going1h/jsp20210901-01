package com.going.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWolrd
 */
@WebServlet("/HelloWolrd")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)  // 톰캣에서 보내주는 것 request
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Hello World~~~~!!!!");
		// response객체 응답하는 것
		response.setContentType("text/html; charset=euc-kr"); // html 프로토콜로 response 콘텐츠 타입 설정 / euc-kr로 인코딩
		PrintWriter writer = response.getWriter(); // 웹브라우저에 출력하기 위한 스트림 설정
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>Hello World~~~~~~~!!</h1>");	
		writer.println("<h1>안녕하세요</h1>");	
		writer.println("</body>");
		
		writer.println("</html>");
		
		writer.close(); // 출력객체를 닫는다
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
