package ex02_loop;

public class Ex03_break {
	
	/*
	 	break문
	 	1. switch문 종료
	 	2. 반복문(for, while) 종료
	 */
	
	public static void ex01() {
		/*
		 	무한 루프
		 	1. 끝나지 않는 반복문
		 	2. 형식
		 		for(;;)
		 		while(true) 실무에선 while 더 선호
		 */
		
		// 1 ~ 10
		int a = 1;
		while(true) { 
			
			if(a > 10) {
				break;
			}
			System.out.println(a);
			a++;
		}
		
	}
	public static void ex02() {
		
		// 모금 
		int goal = 100000;
		int money = 60;
		int total = 0;
		int n = 0;
		while(true) {
			//1회 모금액 60원 현재 60원
			//2회 모금액 60원 현재 120원
			//?회 모금액 60원 현재 ?원
			if(total >= goal) {
				break;
			}
			total += money;
			System.out.println(++n + "회 모금액" + money + "원, 현재 모금액" + total + "원");
		}//for 문으로 연습해보기,더좋다는데?			
	}
	public static void ex03() { //내가만든 for 문
		
		int goal1 = 100000;
		int money1 = 60;
		int total1 = 0;
		for(int n1 = 0; total1 <= goal1; n1++) {
			total1 += money1;
			System.out.println(n1 + 1 + "회 모금액" + money1 + "원, 현재 모금액" + total1 + "원");
		}
		
	}
	public static void main(String[] args) {
		ex03();
	}

}
