package ex02_two_dim;

public class Ex02_advanced_for {
	
	public static void ex01() {
		
		int[][] scores = {
				{70, 80, 90},
				{80, 90, 100},
				{50, 60, 70}
	};							//2차원 배열에서 향산된 for문을 쓰려면 앞에 1차원배열을 준비해줘야 함
		for(int[] arr : scores) { //1차원 배열은 2차원 배열을 꺼낸다
			for(int score : arr) {	//하나씩 값을 꺼내서 쓴다
				System.out.print(score + "\t");
			}
			System.out.println();
		}
	}
	public static void ex02() {
		
		String[][] timeTable = {
				{"국어", "윤리", "수학", "체육"},
				{"미술", "수학", "영어"},
				{"사회", "한자", "수학", "국어", "영어"},
				{"음악", "국어", "윤리"},
				{"수학", "영어", "체육", "과학"}
		};
		for(String[] arr : timeTable) {
			for(String time : arr ) {
				System.out.print(time + "\t");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		ex01();
	}

}
