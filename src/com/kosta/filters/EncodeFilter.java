package com.kosta.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncodeFilter
 */
@WebFilter("/*")
public class EncodeFilter implements Filter {

	public EncodeFilter() {
		System.out.println("EncodeFilter 생성자");
	}
	
	public void destroy() {
		System.out.println("EncodeFilter destroy");
	}
	
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 요청가기 전
		long start = System.currentTimeMillis();
		System.out.println("요청가기 전");
		request.setCharacterEncoding("utf-8");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		//응답하기 전
		long end = System.currentTimeMillis();
		System.out.println("응답하기 전:요청처리소요시간은 " + (end-start) + "ms");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
