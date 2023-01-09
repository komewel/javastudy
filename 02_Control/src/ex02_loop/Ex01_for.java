package ex02_loop;

public class Ex01_for {
	/*
	  for문
	  1. 연속된 숫자를 생성하는 반복문(배열에서 주로 사용)
	  2. 형식 
	   		for(초기문; 조건문; 증감문) {
	   		 	실행문
 		 	}
	 */
	
	public static void ex01() {
		
		// 1 ~ 10
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);				//실행순서. 초기문-> 조건문-> 실행문-> 증감문
		}
	}
	public static void ex02() {                 //실무 버전
		// 횟수
		int count = 5;
		for(int b = 0; b < count; b++) {
			System.out.println("Hello World"); 
		}
		
	}
	public static void ex03() {					//연습
		// 10~1
		for(int a = 10; a >= 1; a--) {
			System.out.println(a);
		}
	}
	public static void ex04() {					//연습
		// 구구단 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		//.......
		int count1 = 9;
		int count2 = 3;
		for(int a = 1; a<= count1;  a++) {
			System.out.println(count2 + " x " + a + " = " + (count2 * a)
					);
		}
		
	}
	public static void main(String[] args) {
		ex04();
	}

}
