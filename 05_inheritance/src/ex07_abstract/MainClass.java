package ex07_abstract;

public class MainClass {

	public static void main(String[] args) {

		Person person = new Student(); //상속이란 하나의 타입(부모)으로 여러가지 기능(자식)을 묶어두고 활용하는것(복잡하지 않음) 
		
		person.eat();
		person.sleep();
		person.study();
	
		
		
	}

}
