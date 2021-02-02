package java12_exception_19day.custom;

public class CustomEx {

	public static void main(String[] args) {
		
		User u  = new User();
		
		try {
			u.setAge( -9);
		}catch(UserAgeException e) {
			e.printStackTrace();
		}
		
	}

}
