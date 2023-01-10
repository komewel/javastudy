package ex03_method;

public class MainClass {

	public static void main(String[] args) {

		//calculator 객체 선언 + 생성
		Calculator calc = new Calculator();
		
		double add = calc.addition(1.5, 2.5); //addition 메소드 호출
		System.out.println(add);
		double sub = calc.subtraction(2.5, 1.3);
		System.out.println(sub);
		double b = calc.a(4, 5);
		System.out.println(b);
	}
}
