package com.kosta.controller3;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kosta.model.EmpService;
import com.kosta.model.EmployeeVO;
import com.kosta.model.MemberVO;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/emp/emplist")//get방식
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.request
		String data1= (String)request.getAttribute("data1");
		//2.session
		HttpSession session = request.getSession();//세선얻기
		String data2 = (String)session.getAttribute("data2");
		//3.application
		ServletContext application = getServletContext();
		String data3 = (String)application.getAttribute("data3");
		
		System.out.println("request:" + data1);
		System.out.println("session:" + data2);
		System.out.println("application:" + data3);
		//무조건 Object로 오기 때문에 String으로 형변환
		String user_id = (String)session.getAttribute("user_id");
		String user_pw = (String)session.getAttribute("user_pw");
		String phone = (String)session.getAttribute("phone");
		String address = (String)session.getAttribute("address");
		String email = (String)session.getAttribute("email");
		System.out.println("user_id" + user_id);
		System.out.println("user_pw" + user_pw);
		System.out.println("phone" + phone);
		System.out.println("address" + address);
		System.out.println("email" + email);
		
		
		//세션에 저장된 멤버가 없다면 로그인 안한 것
		//로그인 없이 직원정보 보기 불가.
		/*
		 * Object obj = session.getAttribute("member"); if(obj==null) {
		 * System.out.println("세션에 저장된 멤버가 없다면 로그인 안한 것.정보조회불가");
		 * //response.sendRedirect("../html/loginpost");
		 * response.sendRedirect("../pro09/memberlogin"); return; }
		 */
		
		
		EmpService service = new EmpService();
		request.setAttribute("emplist", service.selectAll());//"사용할변수", 조회된 내용 전부 저장
		
		RequestDispatcher rd = request.getRequestDispatcher("emplist.jsp");//보여줄페이지
		rd.forward(request, response);
	}
	
	

}
