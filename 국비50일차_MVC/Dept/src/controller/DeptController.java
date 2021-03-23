package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Dept;
import service.face.DeptService;
import service.impl.DeptServiceImpl;

public class DeptController {
	
	//서비스 객체
	private static DeptService deptService = new DeptServiceImpl();
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//---- 부서번호 입력받아 부서정보 조회----
		System.out.print("조회할 부서는? ");
		int deptno = sc.nextInt();
		System.out.println();	
		Dept info = deptService.deptInfo(deptno);
		System.out.println(info);
		System.out.println();
		
		
		//---부서 이름을 입력받아 부서정보 조회
		System.out.print("조회할 부서이름을 입력해주세요  ->");
		sc.nextLine(); // 버퍼비우기
		List<Dept> list = new ArrayList<>();
		String dname = sc.nextLine();
		list = deptService.deptDname(dname);
		for(Dept d : list) {
			System.out.println(d);
		}
		
		//--지역 정보를 전달받아 부서정보 조회
		System.out.print("조회할 지역을 입력해주세요  ->");
		list = new ArrayList<>();
		String loc = sc.next();
		list = deptService.deptLoc(loc);
		for(Dept d : list) {
			System.out.println(d);
		}
		
		
		
		
		
		//----- 신규 부서정보 삽입하기
		Dept newDept = new Dept();
		System.out.print("삽입할 부서정보를 입력하세요. -> ");
		newDept.setDeptno(sc.nextInt());
		System.out.println();
		System.out.print("삽입할 부서이름를 입력하세요. -> ");
		sc.nextLine();
		newDept.setDname(sc.nextLine());
		System.out.println();
		System.out.print("삽입할 부서위치를 입력하세요. -> ");
		newDept.setLoc(sc.nextLine());
		System.out.println();
		
		//-----신규 부서 등록
		deptService.register(newDept);
		
		
		//---삽입한 부서 확인
		// 삽입에 사용한 newDept 객체의 deptno 이용하기
		Dept insertResult = deptService.deptInfo(newDept.getDeptno());
		System.out.println("삽입된 부서 - - > " + insertResult);
		
		
		//부서번호 받아 부서 삭제하기
		System.out.println();
		System.out.print("삭제할 부서 번호를 입력해 주세요");
		deptno = sc.nextInt();
		deptService.delete(deptno);
		System.out.println();
		
	}
}
