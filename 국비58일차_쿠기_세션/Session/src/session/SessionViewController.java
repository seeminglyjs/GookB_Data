package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionViewController
 */
@WebServlet("/session/view")
public class SessionViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();	
		System.out.println("---- session/view [doget] is connected ----");	

		//세션 객체
		HttpSession session = req.getSession(); // == req.getSession(true);

		//req.getSession(true)
		//-> 세션객체가 없으면 새로 생성
		// -> req.getSession()과 같음
		
		//req.getSession(false)
		//-> 세션객체가 없으면 null을 반환
		
		//-----------------------------------------------------------
		
		//-----세션 관련 정보-----
		
		//세션아이디, SESSION_ID
		System.out.println("Session ID : " + session.getId());
	
		//세션 생성 시간
		System.out.println("Create Time : " + session.getCreationTime());
		
		//세션 최근(마지막) 접속 시간
		System.out.println("LastAccessedTime : " + session.getLastAccessedTime());
		
		//세션 유지 시간
		System.out.println("MaxInterativeInterval : " + session.getMaxInactiveInterval());
	
		//세션이 새롭게 생성된 건지 확인
		System.out.println("is New : " + session.isNew());
		//-----------------------------------------------------------

		// 세션 정보 출력
		System.out.println("test 세션정보 : " + session.getAttribute("test"));
		
		
		req.getRequestDispatcher("/WEB-INF/views/session/view.jsp")
		.forward(req, resp);
	}
}
