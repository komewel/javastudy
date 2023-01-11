package ex08_this;

public class User {

	/*
	 	this
	 	1. 현재 객체의 참조값
	 	2. 클래스 내부에서만 사용할 수 있다.
	 	3. 클래스의 구성요소(필드, 메소드)를 호출할 때 사용할 수 있다.
	 		1) 필드	: this.필드 **
	 		2) 메소드 : this.메소드()
	 */
	
	//필드
	String id; // this.id, 이름이 중복되어도 쉽게 쓰는거라는데..?
	String pw;	//this.id //this 매개변수하고 필드이름이 같아서 구분이 필요할때만 붙임
	//생성자
	User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	// 메소드
	void printthis() {  //this를 출력하는
	System.out.println(this); //외부에서는 다른이름으로 내부에서는 this라고 부름
	}
	
	void info() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	}
}
