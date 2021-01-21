package java06_class_11day.field;

public class MemberfieldEx {

	public static void main(String[] args) {
		
//		MemberField_01 mf01 = new MemberField_01();
//		MemberField_01 mf02 = new MemberField_01();
//		MemberField_01 mf03 = null;
//		
//		mf02.setNum(500);
//		System.out.println(mf02.getNum());
//		
//		//System.out.println(mf03.getNum());
//		// java.lang.NullPointerException 발생한다.
		
		
		MemberField_02 mf04 = new MemberField_02();
		MemberField_02 mf05 = new MemberField_02();
		
//		System.out.println(mf04.city);
		
		mf04.city = "Busan";
		
		System.out.println(mf04.city);
		System.out.println(mf05.city);
		
	}

}
