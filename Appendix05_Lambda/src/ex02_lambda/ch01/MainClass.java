package ex02_lambda.ch01;

public class MainClass {

	public static void m1() {
		
		/*
		 	람다식 
		 	
		 	1. 익명 객체를 생성하기 위한 표현식이다.
		 	2. 실행(Runtime)할 때 익명 객체가 생성되면서 동작한다.
		 	3. 추상 메소드가 하나인 인터페이스(함수형 인터페이스)에서 람다식을 사용할 수 있다.
		 	3-1. 기본적으로 람다식은 추상메소드가 1개있는 익명객체를 상대로 진행한다, 추상메소드가 하나있을때 불필요한 문법을 간소하게 만들어서 이용하게 해주는 문법식이다.
		 	4. 형식
		 		(매개변수) -> { 메소드 본문 };
		 		더 정확히는  => 익명객체 = (매개변수) -> { 메소드 본문 };
		 	5. 예시 
		 		1) () -> { System.out.println("Hello World"); } 실패 
		 		   () -> System.out.println("Hello World");     메소드 본문이 한 줄이면 중괄호({}) 생략
		 		2) (int n) -> { System.out.println(n); };       실패 
		 		   (n) -> System.out.println(n);				매개변수의 타입은 생략 
		 		3) (a, b) -> {  
		 		  			System.out.println(a + ", " + b);
		 		  			return a + b; 
		 		  	} 											반환타입은 생략(실패하지는 않는다)
		 		4) (a, b) -> { return a + b; }					실패
		 		   (a, b) -> a + b;								실행문이 return만 있으면 return 생략
		 */

		Car car = () -> System.out.println("기름 넣기");
			
		car.addOil();
	}
		
	public static void gasStation() {
		
		GasStation gasStation = new GasStation();
		
		gasStation.getCar().addOil();
		
		System.out.println("남은기름 : " + gasStation.getTotalOil());
		System.out.println("번 돈 : " + gasStation.getEarning());
		
	}
	
	public static void main(String[] args) {
		m1();
	}
}
