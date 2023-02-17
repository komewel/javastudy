package ex03_singleton; //싱글톤, 객체를 하나(single)만 만들수있다, 하나만 미리 만들어놓은거 갖다가 쓸수있게 빌려주는형식 static이랑 잘맞는다 스태틱도 하나만 만든다고 했으니 

public class User {
	
	//static 필드 (미리 User를 만들어 둔다.)
	private static User user = new User();
	
	//private 생성자 (외부에서는 생성자를 호출할 수 없다, 외부에서는 User를 못만든다)
	private User() {
		
	}
	
	//static 메소드 (static 필드를 사용하기 위해서)
	//user 필드를 외부에서 사용할 수 있도록 반환하는 일종의 getter
	public static User getInstance() {      //유저를 반환하겠다 해서 User getInstance()
		return user;
	}
	}
	