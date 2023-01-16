package practice04_shape;

public class Square extends Rectangle {

	// 필드 필요없음(Rectangle이 가지고 있음)
	
	// 생성자 필드가없는데 생성자 만드는 방법은 소스창에 수퍼클래스 머시기
	public Square(double width) {
		super(width, width);
	}
	//부모의 기능을 이용
}
