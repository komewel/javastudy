package ex09_access_modifier;

public class MainClass {

	public static void main(String[] args) {
		// User 객체 생성하기
		User user = new User(); 
		
		// user 객체에 id 전달하기
		user.setId("admin");
		
		// user 객체의 id 확인하기
		System.out.println(user.getId());
		
		//비밀번호
		user.setPw("132456");
		
		System.out.println(user.getPw());
		
		//
	}	
}
