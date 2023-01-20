package parking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor //생성자, 생성자는 처음만 일해주고 다신 안해줌 다음은 메소드가 함 
public class Car {
	private String carNo;
	private String model;
}
