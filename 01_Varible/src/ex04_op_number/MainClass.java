package ex04_op_number;

public class MainClass {

	//ex01란 메소드(기능)를 정의(내가 기능을 만드는것) 만드는 위치는 무상관(메소드 안에서 메소드 선언은x)  
	public static void ex01() {
		System.out.println("ex01");
		
		int a = 5;
		int b = 2;
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b; //나머지
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
	}
	//ex02 메소드 정의(연습)
	public static void ex02() {
		int a = 5;
		int b = 2;
		
		double div = (double) a / b;
	 System.out.println(div);
	}
	//ex03 메소드 정의(연습)
	public static void ex03() {
		int second = 90;
		int min = second / 60;
		int sec = second % 60;
		System.out.println(min);
		System.out.println(sec);		
	}
	//ex04 메소드 정의
	public static void ex04() {
		
		// 1 증가 : ++
		// 1 감소 : --
		
		// 전위 연산(pre operator)
		// ++a 또는 --a
		// 변수 a의 값을 1 증가(감소)시킨 뒤에 사용하시오.
		int a = 10;
		System.out.println(++a);
		
		//후위 연산(post operator)
		//b++ or b--
		//변수 b의값을 사용한 뒤에 1 증가(감소)시키시오.
		int b = 10;
		System.out.println(b++);
	}
	//ex05 메소드 정의(대입 연산)
	public static void ex05( ) {
	//등호(=)의 오른쪽 값을 왼쪽으로 보내는 연산
		int a;
		a = 10;//역은 성립x 10은 a가 될수없음
		System.out.println(a);		
	}
	//ex06 메소드 정의(교환)
	public static void ex06( ) {
		int x = 10;
		int y = 20;
		int temp; //값을 백업해두고 덮어쓰기
		temp = x;
		x = y;
		y = temp; 
		System.out.println(x); //20 
		System.out.println(y); //10
	}
	//ex07 메소드 정의(복합데이터 연산)
	public static void ex07( ) {
		
		int account = 10000;
		
		account += 5000; //account = account + 5000;, 5000을 더해준 값으로 수정해라
		System.out.println(account);
		account -= 50000; //account = account - 50000;
		System.out.println(account);
		}
	//ex08 메소드 정의(연습) 5% 이자를 받으면?
	public static void ex08( ) {
		
		long account = 123456;
		double result;
		result = account * 1.05;
		System.out.println(result);
		}
	public static void main(String[] args) {
		ex08(); //ex0n 메소드 호출
	}

}
