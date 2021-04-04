package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDeleteController
 */
@WebServlet("/session/delete")
public class SessionDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("/session/delete [dpget] is connected");
		
			//세션 객체
			HttpSession session = req.getSession();
			
			//세션 객체 제거(로그아웃 구현)
			session.invalidate();
			
			req.getRequestDispatcher("/WEB-INF/views/session/delete.jsp")
				.forward(req, resp);
	
	}
}
