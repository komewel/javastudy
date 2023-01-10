package ex01_one_dim;

public class Ex02_reference {
	
	public static void ex01() {
		int[] arr; //5개 배열 요소의 참조(주소, 번지) 값
		arr = new int[5]; 
		System.out.println(arr[0]);
		
	}
	public static void ex02() {
		int[] a = new int[5]; 
		int[] b;
		
		b = a;
		
		System.out.println(b[0]); // 배열 b 도 a 랑 동일시 됨
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		b[0] = 100; //b = a가 같다는 문구가 앞에 있어도 객체 지향언어라 그런지 순서영향이 없는듯 ex. int a 같은경우는 a가 순전히 값을 보관하는 역할만 하기때문에 저런 로직은 아님
		System.out.println(a[0]);
	}
		
		/* 쌤 설명 추가버전(참조, 배열)
        |-------|
      a | 0x123 |─────┐
        |-------|          │
        |  ...  |          │
        |-------|          │
   a[0] |   0   | 0x123    │
        |-------|          │
   a[1] |   0   |          │
        |-------|          │
   a[2] |   0   |          │ b = a;
        |-------|          │
   a[3] |   0   |          │
        |-------|          │
   a[4] |   0   |          │
        |-------|          │
        |  ...  |          │
        |-------|          │
      b | 0x123 |◀────┘
        |-------|
	*/
	
	public static void ex03() { //심화과정

		//생성된 배열의 크기 늘이는 방법
		
		// 기존배열
		int[] a = new int[5];
		
		//신규 배열
		int[] b = new int[10];
		
		//기존 배열 요소 -> 신규 배열 요소
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i]; //안에있는 성분 복사한구간
		}
		//기존 배열의 참조값을 신규 배열의 참조값으로 수정
		a = b; //참조(간판, 주소)값 복사한구간
		//기존 배열이 신규 배열로 변경되었으르모 확인
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]); //a라는 이름 그대로 쓰고 공간만 넓히고 싶을때 b라는 공간을 따로 만들고 a가 입주한다음 간판만 바꾼꼴
		}
	}

	public static void main(String[] args) {
		/*
		int[] arr;
		arr = new int[5];
		
		System.out.println(arr);  //5개 배열 요소의 참조{주소, 번지 (정하기 어려운 값 그냥 쓰는값 그냥 불러서 쓰는값 컴터 내부에 정해져 있지않는값)}값 (=이곳에 가면 5개의값이 있을것이다)
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		ex02();
	}
}
