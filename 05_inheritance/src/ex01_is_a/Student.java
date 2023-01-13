package ex01_is_a;

/*
		자식 클래스
		1. 서브 클래스라고 한다. (sub)
		2. 부모 클래스의 기능을 자기 것처럼 사용할 수 있다.
 */

public class Student extends Person { //약간 종속관계 생각하면 된다 학생은 사람이지만 사람이 학생은 말이안되는 논리

	public void study() {
		System.out.println("공부한다.");
	}
}
