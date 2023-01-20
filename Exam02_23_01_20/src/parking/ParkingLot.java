package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;  //주차장에 필드값
	private Car[] cars;
	private int idx; 
	private Scanner sc;
	
	

	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in); //입력하게 해줄수 있는 구문 
	}
	
	public void addCar() {
		System.out.println("현재 등록된 차량 : " + idx + "대");
		if(cars.length == idx) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		
		System.out.print("차량번호 >>>"); 
		String carNo = sc.next(); //carNo를 위에서 선언안했는데 바로되네.. 
							      //next는 공백 남기면 다음값으로 인식함
		System.out.print("모델 >>>");
		String model = sc.next();
		cars[idx++] = new Car(carNo, model); //생성자에 넣는줄 알았는데 여기서 배열처리 
		//Car car = new Car(carNo, model);
		//cars[idx++] = car; ,이걸 줄여놓은게 위에 버전
		//Car car = new Car(sc.next(), sc.next()); 이걸로 해도됨
		System.out.println("차량번호 " + carNo + "차량이 등록되었습니다.");
		  }
	
	public void deleteCar() {   
		
	}
		
	public void printAllCars() {
		for(int i = 0; i < cars.length; i++) {
			if(cars[i] == null) {
				continue;
			}
		System.out.println(cars[i]);
		}
	}
	
	public void manage() {
		
		while(true) {
			
			System.out.print("1.추가  2.삭제  3.전체  0.종료 >>> ");
			
			String choice = sc.next(); //String이 좋은 이유가 int로 설정하고 문자넣으면 ㅈ됨
									   //String은sc.next int는sc.nextln 으로 하래
			switch(choice) {
			case "1":
				addCar(); //addCar호출
				break;
			case "2":
				deleteCar(); //deleteCar호출
				break;
			case "3":
				printAllCars(); //printAllCars호출
				break;
			case "0":
				return; //manage 메소드 종료시킴
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
			}
		}
	}
	
	
	
	
	
	}
	
	
	
	
