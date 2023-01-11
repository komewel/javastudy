package ex04_metod_overloading;

public class Calculator {
	
	/*
	 	메소드 오버로딩
	 	1. 같은 이름의 메소드를 여러개 만들 수 있다.(기능이 같으면 같은 이름을써라~~ 여러개있는 이유가있겄지)
	 	2. 제한조건
	 		1) 메소드 이름이 같아야 한다.
	 		2) ****매개변수의 타입이나 개수가 달라야 한다.****
	 		3) 주의) 반환타입은 메소드 오버로딩과 연관이 없다.(어떤식으로 반환되든 상관이없다 똑같든 말든)
	 */
	
	double addition(double a, double b) {
		return a + b;
	}
	
	double addition(double[] numbers) { //mainclass의arr이랑 이름만 다르지 똑같은 거라는데?
		double total = 0.0;
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

}
