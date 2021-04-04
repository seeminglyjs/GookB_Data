package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/update")
public class CookieUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		System.out.println("---- /cookie.update [doGet] is Connected -----");
	
		Cookie coo1 = new Cookie("ID", "boo"); // 쿠키의 이름(key값)은 중복될 수 없다
		resp.addCookie(coo1); // 클라이언트에게 쿠키전달
		
//		Cookie coo2 = new Cookie("Pass", "485845"); // 쿠키의 이름(key값)은 중복될 수 없다
//		resp.addCookie(coo2); // 클라이언트에게 쿠키전달
		
		resp.addCookie(new Cookie("Pass", "999999")); // 한번에 쿠키값 변경
		resp.addCookie( new Cookie("name", "Bob")); //쿠키의 이름(key값)은 대소문자를 구분한다.
		
		
		req.getRequestDispatcher("/WEB-INF/views/cookie/update.jsp")
			.forward(req, resp);
	}
	
}
