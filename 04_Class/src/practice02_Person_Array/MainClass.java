package practice02_Person_Array;

public class MainClass {
	
	public static void ex01() {
		String[] namelist = {"정숙", "상철", "미희"};
		int[] agelist = {20, 30, 40};
		
		Person[] arr = new Person[3]; //배열의생성, 비유하자면 사람이 들어갈 집이 세개 생긴거지 사람이 세명 생긴건아니다 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Person();
			arr[i].setName(namelist[i]);
			arr[i].setAge(agelist[i]);
			System.out.println("이름 : " + arr[i].getName() + ", 나이 : " + arr[i].getAge()); //확인할땐 get 바꿀댄 set
		}
	}
	public static void ex02() {
		
		String[] nameList = {"정숙", "상철", "미희"};
		int[] ageList = {20, 30, 40};
		
		Person[] arr = new Person[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Person(nameList[i], ageList[i]);
			System.out.println("이름 : " + arr[i].getName() + ", 나이 : " +  arr[i].getAge());
		}
	}
	public static void ex03() {
		
		String[] nameList = {"정숙", "상철", "미희"};
		int[] ageList = {20, 30, 40};
		
		Home home = new Home(3);
		
		for(int i = 0; i < home.getArr().length; i++) {
			home.getArr()[i] = new Person(nameList[i], ageList[i]);
			System.out.println("이름 : " + home.getArr()[i].getName() + ", 나이 : " + home.getArr()[i].getAge());
		}
		
	}
	public static void main(String[] args) {
		ex03();
	}
}
