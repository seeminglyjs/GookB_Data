package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/create")
public class CookieCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		System.out.println("------/cookie/create/ [doGet] is connected------");
		System.out.println();
		System.out.println(req.getCookies());
	
		
		Cookie c1 = new Cookie("ID","Ali"); // 쿠키 객체 생성
		resp.addCookie(c1); //쿠키추가
		Cookie c2 = new Cookie("Pass","1234"); // 쿠키 객체 생성
		resp.addCookie(c2); //쿠키추가
		Cookie c3 = new Cookie("Name","King"); // 쿠키 객체 생성
		resp.addCookie(c3); //쿠키추가
		//응답 객체를 통한 addCookie() 메소드는
		// 응답메시지의 헤더(Response Header)에 set-Cookie항목을 추가한다
		// -> 클라이언트는 Set-Cookie항목의 정보를 저장한다
	
		req.getRequestDispatcher("/WEB-INF/views/cookie/create.jsp")
			.forward(req, resp);
	
	}


}
