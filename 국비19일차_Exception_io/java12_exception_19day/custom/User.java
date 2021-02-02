package java12_exception_19day.custom;

public class User {
	private int age;



	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException {	
		if(age < 0 | age > 150) {
//			System.out.println("[ERROR] Wrong Age");
			throw new UserAgeException();
		}else {
			this.age = age;
		}

	} 

}
