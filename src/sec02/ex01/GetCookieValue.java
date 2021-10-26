package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/get")
public class GetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
	      PrintWriter out=response.getWriter();
	      Cookie[] allValues=request.getCookies();//쿠키들어옴
	      out.println("<h1>쿠키가져오기연습</h1>");
	      for(int i=0; allValues!=null && i<allValues.length;i++){
	    	  String name = allValues[i].getName();
	    	  String value = allValues[i].getValue();
		      out.println("<h2>Cookie 값 가져오기 : " + name + "==>" + 
		    		  URLDecoder.decode(value,"utf-8"));		  
	      }
	}

}
