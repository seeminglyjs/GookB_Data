package java06_class_12day.etc;

class Student{
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}



public class ObjectArray {

	public static void main(String[] args) {
		
		//��ü �迭
		Student st =new Student("aaa", 50);
		
		Student [] stuArr;
		
		stuArr = new Student[3];
		
		//stuArr[0].setAge(25);
		//NullpointException�� �߻��Ѵ�.
		
		
		for(int i = 0; i < stuArr.length; i++) {
			stuArr[i] = new Student();
		}
		// ��ü �켱 ������ �����͸� �־��־����Ѵ�.
		stuArr[0].setAge(25);
		System.out.println(stuArr[0].getAge());
	}

}
