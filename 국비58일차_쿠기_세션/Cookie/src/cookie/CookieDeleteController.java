package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/delete")
public class CookieDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		System.out.println("----- cookie/delete [doGet] is connected -----");
	
		//쿠키 삭제하는 방법
		// 쿠키의 유지시간 (MaxAge)을 0으로 설정하고
		// 쿠키정보를 클라이언트에 전송한다
				
		//요청된 쿠키들 얻기
		Cookie [] cookies = req.getCookies();
		
		int count = 0;
		for(Cookie c : cookies) {
			//c.setMaxAge(0); // 즉시 삭제
			c.setMaxAge(3); //3초 뒤 삭제
			//c.setMaxAge(24 * 60 * 60); //24 시간뒤 삭제
			
			resp.addCookie(cookies[count]); // 클라이언트로 쿠키 전송
			count++;
		}
		
		
		req.getRequestDispatcher("/WEB-INF/views/cookie/delete.jsp")
		.forward(req, resp);
	}

}
