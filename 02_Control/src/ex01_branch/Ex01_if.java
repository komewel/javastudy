package ex01_branch;

public class Ex01_if {
	
	public static void ex01() {
		//if문
		int score = 50;
		if(score >= 60)
			System.out.println("합격");
		if(score < 60)
			System.out.println("불합격");
	}
	public static void ex02() {
		
		//if문의 중괄호
		//실행문이 1개인 경우 생략할 수 있다.(코드스타일이 다른거라 생략해도되고 안해도 되는데 평균적으로 생략안한다)
		//실행문이 2개 이상인 경우 반드시 필요하다.
		
		int score = 50;
		
		if(score >= 60) {
			System.out.println("합격");
			System.out.println("축하합니다");
		}
		if(score < 60) {
			System.out.println("불합격");
			System.out.println("보충수업입니다");
		}
	}
	
	public static void main(String[] args) {
		ex02();
		
	}
	
}

