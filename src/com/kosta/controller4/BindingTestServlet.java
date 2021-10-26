package com.kosta.controller4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 *���ε�:���� ���� ��ü�� �����͸� ����
 *application(�����α׷���...ServletContext��ü...������ ����ִ� ���� ��ȿ.
 *session(Browser��...HttpSession��ü...Browser�� ����ִ� ���� ��ȿ.
 *request(��û����....HttpServletRequest��ü:��û(request)�� ����ִ� ���� ��ȿ
 */

@WebServlet("/bind")
public class BindingTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServletContext application = getServletContext();
		
		request.setAttribute("data1", "�ּ�request");
		session.setAttribute("data2", "�ּ�session");
		application.setAttribute("data3", "�ּ�application");
		//2.��û�̴�...�ٸ���û���� �ٲ��.
		//���� �� �ٽ� ��ȸ, ���� �� �ٽ� ��ȸ, �Է� �� �ٽ� �����ֱ�
		//response.sendRedirect("emp/emplist");
		
		//1.��û����....view�� �����ϱ�
		//��ȸ �� �����ֱ�, �Է�â �����ֱ�, �󼼺��� �����ֱ�
		RequestDispatcher rd = request.getRequestDispatcher("jsp/bindtest.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
