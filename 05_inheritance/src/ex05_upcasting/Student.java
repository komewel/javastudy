package ex05_upcasting;

public class Student extends Person { //자식클래스
	@Override
	public void study() {
		System.out.println("공부한다.");
	}
}
