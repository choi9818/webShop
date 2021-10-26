package com.kosta.controller4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamServlet
 */
@WebServlet(urlPatterns = {"/InitParamServlet2"},
			initParams = {@WebInitParam(name = "tel", value = "010-1234-5678"),
						@WebInitParam(name = "address", value = "seoul")}
		)
public class InitParamServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String tel = getInitParameter("tel");
		String address = getInitParameter("address");
		
		System.out.println(tel);
		System.out.println(address);
		
	
	}

	

}
