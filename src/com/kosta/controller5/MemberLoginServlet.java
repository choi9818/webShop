package com.kosta.controller5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kosta.model.MemberService;
import com.kosta.model.MemberVO;

/**
 * Servlet implementation class MemberLoginServlet
 */
@WebServlet("/pro09/memberlogin")
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login3.html").forward(request, response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pwd");
				
		MemberService service = new MemberService();
		MemberVO member = service.loginChk(Integer.parseInt(user_id), user_pwd);
		if(member == null) {
			response.sendRedirect("memberlogin");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("member", member);//내정보 member에 들어있으니까 member저장
			response.sendRedirect("../emp/emplist");
			//request는 못 가져가지만 session에 저장한 정보는 가져와서 쓸 수 있음
		}
	}

}
