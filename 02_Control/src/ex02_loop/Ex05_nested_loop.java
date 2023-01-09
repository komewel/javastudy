package ex02_loop;

public class Ex05_nested_loop {
	
	public static void ex01() {
		
		for(int day = 1; day <= 5; day++) {
			for(int hour = 1; hour <= 8; hour++) {
				System.out.println(day + "일차" + hour + "교시 수업"); //변수가 복수일때 쓰는듯한 느낌
			}
		}
		
	}
	public static void ex02() {
		int day = 1;
		while(day <= 5) {
			int hour = 1;
			while(hour <= 8) {
				System.out.println(day + "일차" + hour + "교시 수업");
				hour++;
			} 
			day++;
		}
	}
	public static void ex03() {
		//전체 구구단 출력하기
		// 2 x 1 = 2
		// .....
		// 9 x 9 = 81
		for(int a = 2; a <= 9; a++) {
			for(int b = 1; b <= 9; b++) {
				System.out.println(a + " x " + b + " = " + a*b);
			}
			
		}
		
		
	}
	public static void ex04() {
		//전체 구구단 출력하기
		//2x1=2 3x1=3 4x1=4 ...... 9x1=9
		//......
		//2x9=18 3x9=27 ...... 9x9=81
		for(int a = 1; a <= 9; a++) {
			for(int b = 2; b <= 9; b++) {
				System.out.print(b + "x" + a + "=" + a*b + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ex04();

	}

}
