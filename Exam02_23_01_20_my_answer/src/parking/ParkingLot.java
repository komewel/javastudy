package parking;

import java.util.Scanner;

public class ParkingLot {
	
	 private String name;
	 private Car[] cars;
	 private int idx;
	 private Scanner sc;
	 
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() { 
		System.out.println("현재 등록된 차량" + idx + "대");
		if(cars.length == idx) {
			System.out.println( "더 이상 차량 등록이 불가능합니다.");
			return;
		}
		
		System.out.print("차량번호를 입력해주세요. ->");
		String carNo = sc.next();
		System.out.print("모델명을 입력해주세요. ->");
		String model = sc.next();		
		cars[idx++] = new Car(carNo, model);
		System.out.println("차량번호" + carNo + "차량이 등록 완료되었습니다.");
		while(true) {
		System.out.println("추가 등록 하시겠습니까?" + "\n" + "Y / N");
		String choice = sc.next();
		switch(choice) {
		case "Y": 
			addCar();
			break;
		case "N": 
			manage();
			break;
		case "n": 
			manage();
			break;
		case "y": 
			addCar();
			break;
		default : 
			System.out.println("잘못된 입력 입니다.");
		}
		}
	}
	
	public void deleteCar() {
		System.out.println("삭제할 차량번호를 입력해주세요");
		String carnumber = sc.next();
		int b = cars.length; 
		for(int i = 0; i < b; i++) {
			if(cars[i].getCarNo() == carnumber) {
				for(int a = i; a < b - 1; a++) {
					cars[a] = cars[a + 1];
					cars[10] = null;
					break;
				}
			} 
		}
		
	}
	
	public void printAllCars() {
		for(int i = 0; i < cars.length; i++) {
			if(cars[0] == null) {
				System.out.println("현재 등록된 차량이 없습니다.");
				return;
			
			}
			System.out.println("현재 등록 되어있는 차량은");
			
			if(cars[i] == null) {
				break;
			}
			System.out.println(cars[i]);
			break;
		}
		
	}
	public void manage() { 
		
		while(true) {
		System.out.println("1.추가 2.삭제 3.전체 0.종료");
		
		String choice = sc.next();
		
			switch(choice) {
			
			case "1": addCar(); 
					break;
					
			case "2": deleteCar();
					break;
					
			case "3": printAllCars();
					break;
					
			case "0":
				System.out.println("차량등록을 종료합니다 안녕히 가십시오.");
				return;
			
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
			}
		}
	}
	
	 
	 
}

