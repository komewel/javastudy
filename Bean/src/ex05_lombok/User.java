package ex05_lombok;

import lombok.AllArgsConstructor; //소스창에 유징필드로 만드는 생성자
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder //내부 클래스 기능 써서 체이싱(빌더) 으로 코드 작성 하게 해주는애 
@ToString //정리 잘 되서 출력되게 해주는애
@NoArgsConstructor //인수가 없는 생성자도 커버해줌
@AllArgsConstructor//인수 있는 생성자
@Getter //get 역할 하는애
@Setter //set 역할 하는애
public class User {
	private String ID;
	private String pw; 
		
	
}
