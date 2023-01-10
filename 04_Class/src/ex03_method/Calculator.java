package ex03_method;
 
public class Calculator { //클래스 제목 바꾸고 싶으면 파일클릭 f2

	//필드 (=변수)
	//메소드 (=함수, 기능)
	/*
	   메소드 형식 
	   
	   반환타입 메소드명(매개변수) {
	   		메소드 본문
	   		return 반환값
	   }
	   
	   1. 반환값 + 반환타입
	    	메소드 실행(메소드 호출)의 결과
	   2. 메소드명
	   		개발자 마음대로 정함
	   3. 매개변수(타입)
		   메소드로 전달되는 값(인수, argument)을 저장하는 변수 
	 */
	
	/*
	 	메소드의 4가지 형식                                                       메소드 호출
	 																
	 	1. 반환값 X, 인수 X														  method();  ex. void ex01() {
	 		void method() {   //인수도 없기 때문에 ()안에 채워지는게 없다         
	 			메소드 본문
 			}
	 	2. 반환값 X, 인수 O														  int a = 0;
	 		void method(int arg) {												  method(a);
	 			메소드 본문
	 		}																	  
	 	3. 반환값 O, 인수 X														  int result;
	 		int method() {														  result = method();
	 			메소드 본문
	 			return 반환값
 			}
	 	4. 반환값 O, 인수 O														  int a = 0;
	 		int method(int arg) {												  int result;
	 			메소드 본문 													  result = method(a);
	 			return 반환값
	 		}
	 	
	 */
	//addition 메소드 정의
	double addition(double a, double b) {         //외부의값 (더블타입)a,b를 더해서 더블타입의 값으로 돌려주겠다
		return a + b;
	}
	double subtraction(double a, double b) {
		return a - b;
	}
	double a(double a, double b) {
		return a * b;
	}
	
	
}
