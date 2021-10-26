package com.kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/login5")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String address = request.getParameter("user_address");
		System.out.println(id);
		System.out.println(pw);
		System.out.println(address);
		request.setAttribute("major", "�İ�");
		request.setAttribute("phone", "010-1234-5678");
		
		//��û������...�ּ�â�� �ٲ��� �ʰ� ���� ���� ��û�� ���� ������ �ٸ� ������ �����Ѵ�.
		RequestDispatcher rd = request.getRequestDispatcher("jsp/result.jsp");
		rd.forward(request, response);
	}

}
