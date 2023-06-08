package ex03_functional_interface.ch04;

public class MainClass {

	public static void main(String[] args) {
	
		int n = 10;
		
		// n을 전달하면 n보다 1 큰 수를 반환하는 myinterface1 객체를 생성해 보자
		MyInterface myInterface1 = (a) -> a + 1; // return 생략, 한줄이니까 중괄호 생략
		System.out.println(myInterface1.method(n));
		
	
		// n을 전달하면 n의 제곱 값을 반환하는 myinterface2 객체를 생성해 보자
		MyInterface myInterface2 = (a) -> a * a; // return 생략, 한줄이니까 중괄호 생략
		System.out.println(myInterface2.method(n)); 
	}
}
