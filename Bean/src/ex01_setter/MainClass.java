package ex01_setter;  //실무에서 이방법을 더 쓴다

public class MainClass {

	public static void main(String[] args) {

		//User 객체(Bean) 생성
		User user = new User();
		
		//setter를 이용해 필드 값 저장
		user.setId("admin");
		user.setPw("123456");
		
		//필드 값 확인(오버라이드의 활용)
		System.out.println(user);
		
	}

}
