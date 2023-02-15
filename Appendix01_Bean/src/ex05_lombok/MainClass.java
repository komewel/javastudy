package ex05_lombok;

public class MainClass {

	public static void main(String[] args) {

		User user1 = new User();
		
		
		user1.setID("admin");
		user1.setPw("123456");
		
		System.out.println(user1.getID());
		System.out.println(user1.getPw());
		System.out.println(user1);
		
		//빌더버전(가독성)
		User user2 = User.builder()
						.ID("admin")
						.pw("123456")
						.build();
		System.out.println(user2);
	}

}
