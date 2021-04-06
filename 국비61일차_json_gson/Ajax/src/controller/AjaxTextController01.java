package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dto.Member;


@WebServlet("/ajax/test01")
public class AjaxTextController01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		System.out.println("/ajax/test01 doGet로 받아 들여졌다.");
		req.getRequestDispatcher("/WEB-INF/views/ajax/test01.jsp")
		.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		System.out.println("/ajax/test01 doPost로 받아 들여졌다.");
		
		//응답 데이터 형식 지정하기(MIME타입)
//		resp.setContentType("text/html; carset=utf-8"); //html 응답형식
		resp.setContentType("application/json; carset=utf-8"); //json 응답형식

		//응답 출력 스트림
		PrintWriter out = resp.getWriter();
		//------------------------------------

//		out.println("Response Data Send"); // 단순 문자열 전송
		
		//----json Text를 직접 작성하여 응답하기
		// -> 항상 { } 이용하여 객체 타입으로 전달한다
//		out.println("{\"data\" : \"JSON DATA\", \"count\" : 123}"); 
		//------------------------------------
		
		//----DTO을 이용한 출력-----
		Member mem = new Member();
		mem.setId("Apple");
		mem.setPw("Banana");
		
//		out.println(new Gson().toJson(mem));
		//out.println( "{ \"Member\": " + new Gson().toJson(mem) + "}" );
		//------------------------------------------------
		
		//---- List를 이용한 응답 ----
		List<Member> list = new ArrayList<>();
		
		Member m1 = new Member();
		m1.setId("A");
		m1.setPw("A2");
		
		Member m2 = new Member();
		m2.setId("B");
		m2.setPw("B2");
		
		Member m3 = new Member();
		m3.setId("c");
		m3.setPw("C2");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		out.println(new Gson().toJson(list));
		//-------------------------------
		
		
		
	}
	
}
