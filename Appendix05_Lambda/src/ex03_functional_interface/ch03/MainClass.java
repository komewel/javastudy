package ex03_functional_interface.ch03;

public class MainClass {

	public static void main(String[] args) {
		MyInterface myInterface1 = () -> {
			int n = 10;
			return n;
		};
		
		System.out.println(myInterface1.method());
	
		MyInterface myInterface2 = () -> 20; // 반환타입이 있을때는 return은 생략할 수 있고, 한줄이니까 중괄호 생략하므로 이렇게 생략이 가능하다.
		System.out.println(myInterface2.method());
	}

}
