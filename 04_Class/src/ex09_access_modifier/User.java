package ex09_access_modifier;

public class User {

	/*
	 *  접근 제어 지시자(Access Modifier)
	 * 	1. **private : 클래스 내부에서만 접근할 수 있다. (얘는 주는것도 빼가는것도 안됨)
	 *  2. default 	 : 동일한 패키지에서만 접근할 수 있다.
	 *  3. protected : 동일한 패키지 또는 상속 관계의 클래스에서만 접근할 수 있다.
	 *  4. **public  : 누구나(어디서든) 접근할 수 있다. 
	 */
	
	/*
	 * 정보 은닉(Information Hiding)
	 * 1. 클래스의 내부 정보를 외부에 노출하지 않는 것을 말한다.
	 * 2. 클래스의 내부 정보는 "필드"를 의미하므로 "필드"값을 외부에 공개하지 않는 것을 말한다.
	 * 3. **"필드"는 private 하게 처리한다**.
	   4. "메소드"는 public 하게 처리한다. "필드"에 접근하기 위해서는 "메소드"를 통해서 접근해야 한다.
	 */
	
	
	/*
	  	Getter 와 Setter
	  	1. Getter 
	  	  	1) 필드값을 외부로 반출하는 메소드 
	  	  	2) get + 필드 이름을 가지는데 **이를 수정하면 안 된다.**
	    2. Setter
	  	 	1) 외부로부터 필드값을 받아오는 메소드.
	  	 	2) set + 필드 이름을 가지는데 **이를 수정하면 안 된다.**
  	 	이클립스 source창에 가면 generate getter and setter창에서 알아서 메소드를 만들어줌
  	 	마우스 우클릭창에도 있음
	 */
	//필드
	private String id; //얘네들은 원래는 default
	private String pw;
	//직접 정보를 주진 못하고 돌아가는방법을 쓴다(직접적인 접근은 x 간접적인 접근으로 개인정보 변경가능)
	private boolean isVip;
	
	//메소드 
	public String getId() { // 값을 필드한테 받아와서 반출한다
		return id;
	}
	public void setId(String id) { // 값을 외부로부터 받아와서 필드한테주고
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) { 
		this.pw = pw;
	}
	public boolean isVip() {
		return isVip;
	}
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}
}	

	
