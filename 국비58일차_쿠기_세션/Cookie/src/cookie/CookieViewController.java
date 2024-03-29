package cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie/view")
public class CookieViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("------ /cookie/view [doget] is connected ------");
		
		//전체 쿠키 정보를 가졍괴
		Cookie[] cookies = req.getCookies();
		
		//모든 쿠키 정보 출력
		for(Cookie c : cookies) {
			System.out.println(c.getName() + " = " + c.getValue());
		}
		
		req.getRequestDispatcher("/WEB-INF/views/cookie/view.jsp")
			.forward(req, resp);
	}

}
