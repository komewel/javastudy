package ex06_Object;

public class MainClass {

	/*
	 	java.lang(가장기본이 되는 패키지).Object 클래스 
	 	1. 모든 클래스의 최상위 슈퍼 클래스이다.
	 	2. 별도의 슈퍼 클래스를 명시하지 않는 경우 Object 클래스가 슈퍼클래스(하나의 타입으로 묶기 위해 잘 정리하기위해)이다. 
	 	3. 모든 것을 저장할 수 있는 만능 타입이다. , 다 저장되는데 꺼내서 쓸땐 캐스팅을 해야한다
	 	4. Obeject 타입으로 저장된 객체는 Obeject 클래스의 메소드만 호출할 수 있으므로 다시 원래 객체의 타입으로 캐스팅해서 사용해야 한다. 그래서 오브젝트타입이 만능은 아니다
	 	
	 	
	 	Object 클래스의 주요 메소드
	 	1. equals 	 
	 		1) 동등 비교할 때 사용하는 메소드
	 		2) 동등 비교하는 객체들의 참조값(해쉬코드)을 비교함(객체의 값을 비교하지 못함)
	 		3) **객체의 값으로 동등 비교를 수행하기 위해서는 equals 메소드를 "오버라이드(다시만들다)" 해야 함
	 	2. toString 
	 	 	1) 문자열로 변환할 때 사용하는 메소드
	 		2) 객체이름 + @ + "참조값" 형식으로 변환함
	 		3) 원하는 형식으로 변경하려면 ToString 메소드를 "오버라이드" 해야 함
	 
	 */
	
	public static  void ex01() {
		
		Object person = new Person();	//Object 클래스는 모든 객체를 저장할 수 있다.
		
		
		if(person instanceof Person) {  //person이 Person이 맞냐? 물어보는거
			((Person) person).eat();  //강제 다운캐스팅, Object 객체는 사용하기 위해서 항상 캐스팅해야 한다.
			((Person) person).sleep();
		}
		
	}
	
	public static  void ex02() {
		
		//name이 같으면 같은 Person으로 처리하기로 한 시스템
		
		Person person1 = new Person("홍길동");
		Person person2 = new Person("홍길동");
		
		if(person1.equals(person2)) {
			System.out.println("같은 Person이다.");
		} else {
			System.out.println("다른 Person이다.");
		}
		//다른 Person이다. 이름이 같다면 같은 사람이란건 우리의 기준이다 참조(주소)값이 다르기때문에 다른 Person이다.
		//Object 클래스의 equals는 참조값을 비교하므로 다른 Person이다라는 값이 나온다.
	}
	
	public static  void ex03() {
		 
		Person person = new Person("홍길동") ; 
		
		System.out.println(person.toString()); //개발자가 디버깅하는용도 확인하는 용도
		
		System.out.println(person); // toString 메소드는 호출을 생략한다
	                                // tooString 기능을 오버라이드 해줘야함.
		
		
	}
	
	public static void main(String[] args) {
		ex03();
	}

}
