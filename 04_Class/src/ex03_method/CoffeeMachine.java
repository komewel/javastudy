package ex03_method;

public class CoffeeMachine {
	
	
	//필드
	int moneyPot;
	String[] menu = {"아메리카노", "카페라떼", "마끼아또"};
	int[] prices = {900, 1500, 2000};
	
	//메소드
	CoffeeAndChange buyCoffee(int money, int choice) {
		
		//돈이 모자르면 money 그대로 반환
		int price = prices[choice - 1];
		
		if(money < price) {
			CoffeeAndChange cnc = new CoffeeAndChange();
			cnc.change = money;
			return cnc;
			
		}
		
		String coffee = menu[choice - 1]; //무슨커피를 먹고 싶은지 그 커피의 가격은 얼마인지
		
		moneyPot += price;
		
		CoffeeAndChange cnc = new CoffeeAndChange();
		cnc.coffee = coffee;		//
		cnc.change = money - price;
		return cnc;  //리턴문 다음문구는 실행을 안하므로 이 뒤에 쓰기x //coffeemachine 호출한 그래로 반환값으로 돌아간다.
		
	
	}
	

}
