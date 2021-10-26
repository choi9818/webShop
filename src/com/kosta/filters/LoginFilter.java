package com.kosta.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
//@WebFilter("/emp/*")
public class LoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// ���ǿ� ����� ����� ���ٸ� �α��� ���� ��
		// �α��� ���� �������� ���� �Ұ�.
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse rsp = (HttpServletResponse)response;
		
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("member");
		if (obj == null) {
			System.out.println("���ǿ� ����� ����� ���ٸ� �α��� ���� ��.������ȸ�Ұ�");
			rsp.sendRedirect("../pro09/memberlogin");
			return;
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}