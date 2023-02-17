package ex03_singleton;

public class MainClass {

	public static void main(String[] args) {

		// User 객체 가져오기(객체를 만들었는데 new를 못쓴다, private기 떄문에 user를 주세요 요청할수밖에 없다.)
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		//같은 User인가?
		System.out.println(user1 == user2); //같은걸 빌려주었기 때문에 참조값은 무조건 같다 고로 true
		
	}

}
