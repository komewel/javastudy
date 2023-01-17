package practice;


public class MainClass {

	public static void main(String[] args) {
		
		String[] namelist = {"정숙", "상철", "미희"};
		int[] agelist = {20, 30, 40};
		
		Practice[] arr = new Practice[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Practice(); //이거랑
			arr[i]. setName(namelist[i]);
			arr[i]. setAge(agelist[i]);
			System.out.println("이름 : " + arr[i].getName() + "나이 : " + arr[i].getAge());
			
			
			
		}
	}

}
