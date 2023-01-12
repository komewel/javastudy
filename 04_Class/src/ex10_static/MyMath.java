package ex10_static;

public class MyMath {
	
	// 필드
	public static final double PI = 3.141592; // static은 퍼블릭으로 해야 누구든지 사용할수있다
											  // static은 클래스가 쓰는 메소드로써 메모리의 낭비가 싫어서
											  // 클래스 영역에 하나만 만들어서 공유하면서 쓰는 정보이다
	 										  // (객체를 이용해서 확인하지말아라, 클래스영역에서 직접 확인하라)
		/*
 		 static(클래스 메소드)
 		 1. 정적 요소
 		 2. 객체 생성 이전에 클래스 영역에 만들어 지는 요소(미리 만들어짐)
 		 3. 객체마다 생성되지 않고 클래스별로 1개씩만 생성
 		 4. 클래스를 이용해서 호출하기 때문에 클래스 변수, 클래스 메소드라고 부름
 		 5. static 요소는 다른 static 요소만을 참조할수 있음(non-static 요소는 참조할 수 없음)
 		    static 필드는 static 메소드만 쓸수있음(static을 먼저 쓰기때문에 순서차이 발생)
 		    따로 객체선언을 안해도 바로쓸수 있는듯(?)
		 */
	
	// 메소드
	public static double getCircleArea(double radius) {
		return PI * radius * radius;  //static 순서차이로 인해 발생한 오류
	}
	
	public static double max(double... numbers) {
		double max = Double.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;

	}
	public static double min(double... number) {
		double min = Double.MAX_VALUE;
		for(int i = 0; i < number.length; i++) {
			if(min > number[i]) {
				min = number[i];
			}
		}
		return min;
		
	}

}
