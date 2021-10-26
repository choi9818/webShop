package com.kosta.controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.model.DeptDTO;
import com.kosta.model.DeptService;

/**
 * Servlet implementation class DeptInsertServlet
 */
@WebServlet("/dept/deptinsert")
public class DeptInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 입력form보여주기
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("deptinsert.jsp");
		rd.forward(request, response);// 페이지연결-서블릿 통해서 js가게끔
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 부서테이블에 수정하기
		request.setCharacterEncoding("utf-8");
		int did = convertInteger(request.getParameter("department_id"));
		String dname = request.getParameter("department_name");
		int mid = convertInteger(request.getParameter("manager_id"));
		int loc = convertInteger(request.getParameter("location_id"));
		DeptDTO dept = new DeptDTO(did, dname, mid, loc);
		String path = getServletContext().getRealPath(".");
		DeptService service = new DeptService(path);
		int result = service.insertService(dept);
		request.setAttribute("message", result > 0 ? "등록성공" : "등록실패");
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

	private int convertInteger(String str) {
		if (str == null)
			return 0;
		return Integer.parseInt(str);
	}

}
