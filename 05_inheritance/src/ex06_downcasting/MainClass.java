package ex06_downcasting;

public class MainClass {
	
	public static void ex01() {
	
		
		Person person = new Student(); //자식을 부모타입에 저장, 업캐스팅, 부모가 가진 메소드만(업캐스팅된 서브클래스 객체는 슈퍼클래스의 메소드만 호출할 수 있음) 
									   //호출할수있었음 해결책 오버라이드, 다운캐스팅
		
		
		Student student = (Student)person; //다운캐스팅은 자동으로 안됨 강제로 해야함
		
		student.eat();
		student.sleep();
		student.study();
	}
		
	public static void ex02() {
		
		//Person
		Person person = new Person(); 
		
		//잘못된 캐스팅
		Student student = (Student)person; 
		
		//잘못된 캐스팅은 컴파일 오류로 걸러지지 않는다.
		student.eat();
		student.sleep();
		student.study(); //오류 발생 부분
	}
	public static void ex03() {
		
		//Person
		Person person = new Person(); //잘못된 부분
		
		//Student 객체(인스턴스, instance)가 맞다면 Student 타입으로 캐스팅하자, Person이 Student 객체가 맞다면, if는 검사기같은 느낌 오류나면 백지로 나옴
		if(person instanceof Student) {
			
			Student student = (Student)person;
			student.eat();
			student.sleep();
			student.study();
			
			person.eat(); 
			person.sleep();
			((Student)person).study(); //다른 코드스타일, 의미는 완전히 같음
			

			
		}
		
	}
	
	
	public static void main(String[] args) {

		ex03();
}
	}
