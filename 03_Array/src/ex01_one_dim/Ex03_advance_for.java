package ex01_one_dim;

public class Ex03_advance_for { //배열 전용 for문
	
	public static void ex01() {
		
		int[] scores = {50, 90, 60, 100, 80}; //일반 버전
		int total = scores[0];
		for(int i = 1; i < scores.length; i++) {
			total += scores[i];
		}
			System.out.println(total);
		int[] scores1 = {50, 90, 60, 100, 80}; //향상 for문 버전
		int total1 = 0;
		int max = 0;
		int min = 100;
		for(int n : scores1) {
			total1 += n;
			if(max < n) {
				max = n;
			}
			if(min > n) {
				min = n;
			}
		}
			System.out.println(total1);
			System.out.println(max);
			System.out.println(min);
	}
	public static void ex02() {
		String[] files = {"hello.txt", "hi.txt", "안녕.txt"};
		for(String file : files) {
			System.out.println(file);
		}
		
	}

	public static void main(String[] args) {
		ex02();
	}

}

