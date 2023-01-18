package ex05_wrapper;

public class MainClass {
	
	/*
	 	wrapper Class
	 	1. 기본 자료형(Primitive Type)을 참조 자료형(Reference Type)으로 만들어 놓은 클래스이다.
	 	2. 주요 종류
	 		byte 	→  Byte
	 		int		→  Integer
	 		long 	→  Long
	 		double	→  Double
	 		boolean →  Boolean
	 		char	→  Character
	 	3. 용어 정리
	 		1)Auto Boxing 	: 기본 자료형 → 참조 자료형 으로 변환이 자동으로 진행된다. ex, int a = 10; → Integer a = 10; 자동으로 변환
	 		2)Auto UnBoxing : 참조 자료형 → 기본 자료형 ex, Integer a = 10; → int b = a;
 		4. "반드시" 참조 자료형을 요구하는 제네릭(generic)에서 주로 사용한다. 
	 */

	public static void main(String[] args) {

		Integer a = 10; //Auto Boxing
		Integer b = 10; //Auto Boxing
		
		int sum = a + b;//Auto UnBoxing
		System.out.println(sum);

	}

}
