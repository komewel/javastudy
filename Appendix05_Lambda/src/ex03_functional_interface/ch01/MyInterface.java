package ex03_functional_interface.ch01;

@FunctionalInterface  // 함수형 인터페이스 : 추상형 메소드를 1개만 가지는 인터페이스 - 람다식의 사용이 가능한 인터페이스, 굳이 이걸 적어주는 이유는 메소드를 두개 적을시 오류가 뜬다(필수요소는 아니다 안전장치일뿐)
public interface MyInterface {
	public void method(); // 매개변수와 반환값이 모두 없는 형태
	

}
