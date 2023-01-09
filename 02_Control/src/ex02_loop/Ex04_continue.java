package ex02_loop;

public class Ex04_continue {
	
	/*
	 	continue문 
	 	1. 반복문의 실행 시작 지점부터 다시 실행
	 	2. 어떤 코드를 [제외]하고 반복문을 실행하고 싶을 때 사용 
	 */

	public static void main(String[] args) {
		// 1 ~ 50 사이에서 4의 배수를 제외하고 출력하기
		for(int a = 1; a <= 50; a++) {
			if(a % 4 == 0) {
				continue; //조건이 해당하면 출력말고 위로 올라가 다시 실행하라
			}
			System.out.println(a);
			
		}
	}

}
