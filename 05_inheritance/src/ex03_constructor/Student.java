package ex03_constructor;
/*
	상속 관계의 생성자
	1. 자식 클래스는 "반드시" 부모 클래스를 먼저 생성한다.
	2. 자식 클래스의 생성자를 호출하면 "반드시" 부모 클래스의 생성자가 "먼저" 호출된다.
	3. 부모 클래스의 생성자가 "디폴트 생성자" 형식이면 자식 클래스에서 부모 클래스의 생성자 호출을 생략할수 있다.
 	4. 부모 클래스의 생성자를 호출할 때 super()를 사용한다.
 */
public class Student extends Person {
	
	//생성자
	public Student() {
		super(); //이게 생략되있었다 (언제나 생략가능 매개변수가 없는 default 형식은 언제나 생략가능)
				 //생략 가능한 부모 클래스의 생성자 호출(매개변수가 없는 디폴트 형식의 생성자는 생략 가능)
		System.out.println("Student 생성");
	}
	
	/*******************************************************/
	
	//필드
	private String school;
	
	//생성자 (source에 constructor...field쓰면 알아서 생성자 만들어줌 그 아래꺼는 아까 솔져 같이 필드 아예 없는거)
	public Student(String name, String school) {
		super(name); //person 생성자에게 값을 전달. 가장 먼저 호출해야함 
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}	
	
}
