package ex04_override;

public class Americano extends Espresso { //extends Espresso 이거 지워보면 답나옴

	@Override // 보통여기다가 붙여준다(새롭게 다시만든 taste)
	public void taste() {
		System.out.println("아메리카노는 맛있다.");
	} 
/*
 	메소드 오버라이드
 	1. method override
 	2. 부모 클래스의 메소드와 **동일한 메소드 형식**으로 자식 클래스가 새로운 메소드를 만드는 것이다.
 	3. 부모 클래스의 메소드를 사용할 수 없기 떄문에, 새로운 메소드를 다시 만드는 것이다.
 	4. 자식 클래스가 메소드를 다시 만들 때는 에너테이션(Annotation) 중 @Override를 추가한다.
 	   부모가 가진 메소드를 자식이 다시만들수 있다
 */
	

			
}
