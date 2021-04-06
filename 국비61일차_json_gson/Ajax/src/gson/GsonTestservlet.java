package gson;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/gson/test01")
public class GsonTestservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/gson/test01 접속완료");
	
		//Gson 라이브러리 객체 생성
		Gson gson = new Gson();
		
//		gson.toJson(자바객체) : Java데이터 -> Json Text(마샬링)
//		gson.fromJson(json텍스트, 자바데이터타입)
		//  json Text -> java데이터 (언마샬링) 
		
		
		//----------------------------------------------------------
		
		//int형 데이터
		System.out.println(gson.toJson(123));
		
		//String형 데이터
		System.out.println(gson.toJson("Apple"));
		
		//Long형 데이터
		System.out.println(gson.toJson(new Long(20)));
		System.out.println(gson.toJson(1005L));
		
		//----------------------------------------------------------
		
		//int[] 형 데이터
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);
		
		System.out.println(gson.toJson(arr));
		
		//----------------------------------------------------------
		// int 형 데이터로 언마샬링
		int n1 = gson.fromJson("123", int.class);
		System.out.println(n1);
		
		
		//long형 데이터로 언마샬링
		Long n2 = gson.fromJson("123",Long.class);
		System.out.println(n2);
		
	
	
	}

}
