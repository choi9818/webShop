package com.kosta.controller.pro12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.model.EmpService;

/**
 * Servlet implementation class RetrieveByJobServlet
 */
@WebServlet("/pro12/test03/retrieveByJob")
public class RetrieveByJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job_id = request.getParameter("job_id");
		EmpService service = new EmpService();
		request.setAttribute("emplist",service.selectByJob(job_id));
		
		RequestDispatcher rd = request.getRequestDispatcher("empResult.jsp");
		rd.forward(request, response);
	}

	

}
