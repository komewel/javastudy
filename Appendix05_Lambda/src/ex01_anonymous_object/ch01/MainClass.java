package ex01_anonymous_object.ch01;

public class MainClass {

	public static void m1() {
		// 인터페이스는 왜 객체를 못 만드는가?
		// Car car = new Car(); 를 못하는 이유? 인터페이스의 추상 메소드는 완성되어 있지 않기 때문에(미완성 상태)
		
		// 익명 객체(이름이 없는 객체)
		// 해결) 추상메소드를 완성시킬 수 있다면, 인터페이스도 객체로 만들 수 있다. 이 때 익명 객체의 형태로 만들 수 있다.  

		Car car = new Car() { // 본문을 채우게 해준다 그래야지 객체 생성을 허용해준다. (인터페이스를 객체화 시키는 방법)
			
			@Override
			public void addOil() {
				System.out.println("기름 넣기");
			}
		};
		car.addOil();
	}
		
	public static void gasStation() {
		
		GasStation gasStation = new GasStation();
		
		gasStation.getCar().addOil();
		
		System.out.println("남은기름 : " + gasStation.getTotalOil());
		System.out.println("번 돈 : " + gasStation.getEarning());
		
	}
	
	public static void main(String[] args) {
		gasStation();
	}
}
