package ex06_dafault_constructor;

public class User {
	
	//생성자를 만들지 않으면 "디폴트가 생성자"가 사용된다.
	
	User() { 		//디폴트생성자가 생성된 모습
		System.out.println("우리의 첫 생성자");
	}
	
	//필드 
	String id;
	String pw;
	
	//메소드
	void info() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	}
	

}

