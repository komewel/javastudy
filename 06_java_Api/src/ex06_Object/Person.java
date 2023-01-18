package ex06_Object;

public class Person {
	
	private String name;
	
	public Person() {
		
	} //이거 안만들면 ex01이 오류난다 
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println("먹는다. ");
	}
	public void sleep() {
		System.out.println("잔다. ");
	}
	@Override
	public int hashCode() {     //소스메뉴에 있고 해쉬코드랑 이퀄기능
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {  //소스메뉴에있고 투스트링 기능
		return "Person [name=" + name + "]";
	}
	
	
	
}
