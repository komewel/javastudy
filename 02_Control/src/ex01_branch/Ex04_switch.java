package ex01_branch;

public class Ex04_switch {
	
	/*
		  switch(표현식,switch를 쓰면 가독성이 좋음 많이쓰는 이유) {
		  case(추가구문) 값1: 실행문
		  case 값2: 실행문
		  ....
		  default(else같은 역할): 실행문
	 
	 	}
		 표현식의 결과로 주로 사용하는 타입
		 - int
		 - String 
		 
		 표현식의 결과로 사용 불가능한 타입
		 - boolean
		 - double
		 - long 
	 */
	
	public static void ex01() {
		
		int month = 1;
		switch(month) {
		case 12:
		case 1: 
		case 2: System.out.println("겨울"); break; //겨울을 출력했으면 그만하세요
		case 3: 
		case 4: 
		case 5: System.out.println("봄"); break; //봄을 출력했으면 그만하세요
		case 6: 
		case 7: 
		case 8: System.out.println("여름"); break; //여름을 출력했으면 그만하세요
		default: System.out.println("가을");
		}
		
	}
	public static void ex02() {
		
		int day = 13;
		
		String weekName;
		
		switch(day % 7) {
		case 0: weekName = "토"; break;
		case 1: weekName = "일"; break;
		case 2: weekName = "월"; break;
		case 3: weekName = "화"; break;
		case 4: weekName = "수"; break;
		case 5: weekName = "목"; break;
		default: weekName = "금";
		}
		System.out.println(day + "일은 " + weekName + "요일이다.");
		
	}
	public static void ex03() {
		
		//수,우,미,양,가,잘못된 점수
		
		int score1 = 100; //내가 푼 답
		switch(score1 / 10) {
		case 10: 
		case 9: System.out.println("수"); break;
		case 8: System.out.println("우"); break;
		case 7: System.out.println("미"); break;
		case 6: System.out.println("양"); break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: System.out.println("가"); break;		
		default: System.out.println("잘못된 점수"); 
		}
		int score2 = 100; //선생님 답
		
		if(score2 < 0 || score2 > 100) {
			System.out.println("잘못된 점수");
			return; // ex03 메소드를 종료하시오
		}
		
		switch(score2 / 10) {
		case 10: 
		case 9: System.out.println("수"); break;
		case 8: System.out.println("우"); break;
		case 7: System.out.println("미"); break;
		case 6: System.out.println("양"); break;	
		default: System.out.println("가"); 
		}
		
		
	}
	public static void ex04() {
		
		//1분기, 2분기, 3분기, 4분기
		
		int month1 = 5; //내가 푼 답 
		switch(month1 % 12) {
		case 1: case 2: case 3:
		  System.out.println("1분기"); break; //이런 모양으로도 가능
		case 4: case 5: case 6:
		  System.out.println("2분기"); break;
		case 7: case 8: case 9:
		  System.out.println("3분기"); break;
		default: System.out.println("4분기");
			
		}
		int month2 = 5; //선생님 답
		System.out.println((month2 - 1) / 3 + 1 + "분기");
		
		switch((month2 - 1) / 3) { //선생님 답2
		case 0: 
		  System.out.println("1분기"); break; 
		case 1: 
		  System.out.println("2분기"); break;
		case 2: 
		  System.out.println("3분기"); break;
		default: System.out.println("4분기");
		}
		
	}

	public static void main(String[] args) {
		ex04();
	}

}


