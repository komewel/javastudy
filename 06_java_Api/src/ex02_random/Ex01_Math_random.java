package ex02_random;

public class Ex01_Math_random {
	
	public static void ex01() {
		
		//java.lang.Math 클래스
		//일반적으로 이걸 쓴다
		
		double randNumber = Math.random(); // 0.0 <= 난수 < 1

		if(randNumber < 0.1) { 	//대략 10% 확률
			System.out.println("대박");						
		} else {
			System.out.println("꽝");
		}
	}
	
	public static void ex02() {
		
		/*
		 	난수 생성하기
		 	Math.random()                                 0.0 <= n < 1.0
		 	Math.random() * 3                             0.0 <= n < 3.0
		 	(int)(Math.random() * 3)					  0 <= n < 3, 소수점없앰
		 	(int)(Math.random() * 3) + 1				  1 <= n < 4
		 	-------------------------------------------------------------
		 	(int)(Math.random() * 개수) + 시작값
		 	 				or
		 	(int)(Math.random() * 개수 + 시작값) 
		 */
		/* 내가한거
		for(int i = 1; i <= 6; i++) {
			int a = (int)(Math.random() * 9);
			String b = a + "";
			System.out.print(b);
		}
		*/
		
		StringBuilder sb = new StringBuilder();
		for(int count = 0; count < 6; count++) {
			sb.append( (int)(Math.random() * 10) );
		}
		String code = sb.toString();
		System.out.println(code);
	}
	public static void main(String[] args) {
		ex02();
	}

}
