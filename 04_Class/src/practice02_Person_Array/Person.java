package practice02_Person_Array;

public class Person {

	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {} //defalult생성자는 생성자를 하나도 안만들었을때만 자동으로 만들어지면 안만들어도되는거지 하나라도 있을경우 defalult 생성자를 만들어줘야함
	public Person (String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	//메소드 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
