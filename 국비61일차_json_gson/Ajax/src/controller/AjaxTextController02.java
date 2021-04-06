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


@WebServlet("/ajax/test02")
public class AjaxTextController02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		System.out.println("/ajax/test02 doGet로 받아 들여졌다.");
		req.getRequestDispatcher("/WEB-INF/views/ajax/test02.jsp")
		.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		System.out.println("/ajax/test02 doPost로 받아 들여졌다.");

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
		//-------------------------------
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("/WEB-INF/views/ajax/result.jsp")
			.forward(req, resp);
	}
	
}
