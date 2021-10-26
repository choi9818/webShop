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
 * Servlet implementation class DeptDetailServlet
 */
@WebServlet("/dept/deptDetail")
public class DeptDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//부서상세보기
		String deptid = request.getParameter("deptid");
		int ideptid = Integer.parseInt(deptid);
		
		String path = getServletContext().getRealPath(".");
		DeptService service = new DeptService(path);
		DeptDTO dept = service.selectById(ideptid);
		request.setAttribute("dept", dept);
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("deptDetail.jsp");
		rd.forward(request, response);
			
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//부서테이블에 수정하기
		request.setCharacterEncoding("utf-8");
		int did = convertInteger(request.getParameter("department_id"));
		String dname = request.getParameter("department_name");
		int mid = convertInteger(request.getParameter("manager_id"));
		int loc = convertInteger(request.getParameter("location_id"));
		DeptDTO dept = new DeptDTO(did, dname, mid, loc);
		String path = getServletContext().getRealPath(".");
		DeptService service = new DeptService(path);
		int result = service.updateService(dept);
		request.setAttribute("message", result>0?"수정성공":"수정실패");
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}
	
	private int convertInteger(String str) {
		if(str==null) return 0;
		return Integer.parseInt(str);
	}
	

}
