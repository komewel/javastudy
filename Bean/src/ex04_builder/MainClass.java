package ex04_builder;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		값을 받아오는 메소드 
		1. **메소드명과 필드명을 동일하게 구성한다(클래스값을 건내줘야하므로)**
		2. 메소드 체이닝(메소드를 여러번 부르는것 체인 사슬을 걸듯이)을 위해서 현재 객체를 반환한다. 
		   ex: user.setId("admin").setPw("123456") 여기서 user.setId("admin")가 user값(this, 현재객체의 참조값)으로 나와야 체이닝이 가능하다.
		*/

		User user = User.builder()
						.id("admin")
						.pw("123456")
						.build(); //이게 메소드 체이닝이자 빌더 패턴
		
		System.out.println(user);
	}

}

