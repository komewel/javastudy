package ex02_constructor;

public class User {
	
	//필드
	private String id;
	private String pw;
	
	//생성자
	public User(String id, String pw) {
		super(); //Object 부르는거, 생략가능함
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}

}
