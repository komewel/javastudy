package ex02_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//finally 블록
		//항상 마지막에 실행되는 블록으로 생략할 수 있다.(꼭 필요한건 아니다)
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.print("나이를 입력하세요>>>");
			int age = sc.nextInt();
			System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
			//sc.close(); //더이상 작동하지 않습니다. int age = sc.nextInt();가 
                        //처리 불가능하면 try문을 벗어나는데 그러면 이 구문이 동작을 안한다
		} catch(Exception e) {
			System.out.println("예외 발생");
		} finally {
			sc.close();  //finally 블록은 자원(resource)을 반납할 때 주로 사용한다. sc.close()을 할때
		}
	}

}
