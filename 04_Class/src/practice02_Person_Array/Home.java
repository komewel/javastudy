package practice02_Person_Array;

public class Home {
	
	//필드	
	private Person[] arr; //new를 쓰면 안되는 이유가 사람이 몇명사는진 다르기땜에
	private int count;
	
	//생성자
	public Home(int count) {
		arr = new Person[count];
		this.count = count;
	}

	//메소드
	public Person[] getArr() {
		return arr;
	}

	public void setArr(Person[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	
}
