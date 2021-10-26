package com.kosta.controller7;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.model.EmployeeVO;

/**
 * Servlet implementation class JavaBeansTestServlet
 */
@WebServlet("/pro14/beans")
public class JavaBeansTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeVO emp = new EmployeeVO();
		emp.setEmployee_id(100);
		emp.setFirst_name("stiven");
		request.setAttribute("emp", emp);
		RequestDispatcher rd = request.getRequestDispatcher("test01/emp.jsp");
		rd.forward(request, response);
	}

	

}
