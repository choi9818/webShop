package com.kosta.controller.pro12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScoreServlet
 */
@WebServlet("/pro12/scoreServlet")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String output = "";
		int score=Integer.parseInt(request.getParameter("score"));
		if(score>=90){
			output = "A학점입니다.";
		}else if(score>=80 && score<90){
			output = "B학점입니다.";
		}else if(score>=70 && score<80){
			output = "C학점입니다.";
		}else if(score>=60 && score<70){
			output = "D학점입니다.";
		}else{
			output = "F학점입니다.";
		}
		request.setAttribute("message", output);
		RequestDispatcher rd = request.getRequestDispatcher("scoreTest2.jsp");
		rd.forward(request, response);
	
	}


}
