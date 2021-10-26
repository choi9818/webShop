package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieValue
 */
@WebServlet("/set")
public class SetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Date d = new Date();
		Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP프로그래밍입니다.", "utf-8"));
		c.setMaxAge(24 * 60 * 60);
		response.addCookie(c);
		
		Cookie c2 = new Cookie("myname", "choi");
		c2.setMaxAge(-1);  //세션 쿠키를 생성합니다.(브라우저 죽으면 같이 죽음)
		response.addCookie(c2);
		
		Cookie c3 = new Cookie("subject", "jspServlet");
		c3.setMaxAge(2*60);  //2분 동안 유효
		response.addCookie(c3);
		
		out.println("현재시간 : " + d);
		out.println("<br> 문자열을 Cookie에 저장합니다.");

	}

}
