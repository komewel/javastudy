package ex08_interface;

public class MainClass {

	public static void main(String[] args) {
		Person person = new Student(); //new 연산자는 불러올때 초기화를 해서 불러오는 역할을 하는거 같음.
		
		person.eat();
		person.sleep();
		person.study();
		
		
		
	}

}
