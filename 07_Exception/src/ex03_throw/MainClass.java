package ex03_throw;

import java.util.Scanner;

public class MainClass {
	
	public static void ex01() {
		
		try {
			Integer.parseInt("하핳"); //예외 확인 하고 싶은거 먼저 올리면됨
			int a = 4 / 0;
			System.out.println(a);
		} catch(Exception e) {
			System.out.println(e.getClass().getName()); //예외 클래스 이름을 보여줌 그냥 Exception이 아니라 세부내용
			System.out.println(e.getMessage()); //예외가 왜 발생했는지 메시지로 대강 알려줌 
		}
		
	}
	
	public static void ex02() {
		
		try {
			Integer.parseInt("호홓");
		} catch(Exception e) { 
			
			e.printStackTrace(); ////예외발생내역을 저장하는 저장소를 추적하겠다.
								 ////예외를 추적하는 메소드(개발중에는 이것만 사용함)
			
		}
		
	}
	
	public static void ex03() {
		
		/*
		   throw
		   1. 예외 객체를 생성해서 직접 던질 수 있다.
		   2. 개발자가 직접 예외를 처리할 때 사용한다.
		*/
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요 >>> ");
			int age = sc.nextInt();
			if(age < 0 || age > 100) {
				throw new RuntimeException(age + "살은 불가능합니다."); //return이랑 비슷 트라이 캣치문 버전 return
			}
			System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
		} catch(Exception e) {
			System.out.println(e.getMessage()); ////중요 여기 만져보기
		} finally {
			sc.close();
		}
		
	}

	public static void main(String[] args) {

		ex03();
		
	}

}
