package ex04_builder;

public class User {
	
	//User필드(Builder 객체가 가진 값을 받아온다.)
	private String id;
	private String pw;
	
	//User 생성자
	public User(Builder builder) {
		this.id =builder.id;
		this.pw =builder.pw;
	}
	
	//패스워드 아이디 출력할수있게 오버라이드 해줌
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
	
	//------------------------------------여기를 경계로 보면 편함-----------------------------------------------------------------

	
	//Builder 객체 반환
	public static Builder builder() {
		return new Builder();
	}
	
	//Builder 클래스(내부클래스)
	public static class Builder {
		
		//Builder 필드(여기로 값을 전달 받아서 User 필드로 전달한다.)
		private String id;
		private String pw;  //값이 이리로 들어옴
		
		//값을 받아오는 메소드 
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		public Builder pw(String pw) {
			this.pw = pw;
			return this;
		}
		
		//User 객체 반환
		//Builder 필드 값을 가진 User객체를 반환
		public User build() {
			return new User(this); //여기서 this는 id,pw 값을 모두 가지고 있는 Builder 객체
		}
	}
}
