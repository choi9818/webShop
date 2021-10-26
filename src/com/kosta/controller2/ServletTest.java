package com.kosta.controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet({"/stest","/stest2"})
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//Servlet=>JAVA+HTML
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myname = request.getParameter("myname");
		System.out.println(myname);
		
		request.setAttribute("as", "최수");//결과 저장setAttribute
		
		RequestDispatcher rd;//
		rd = request.getRequestDispatcher("jsp/jspTest.jsp");//연결
		rd.forward(request, response);
	}

}
