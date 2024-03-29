package practice05_Cart;

public class Customer {

	private int myMoney;
	private int myPoint;
	private Cart mycart;
	
	public Customer(int myMoney, int myPoint) {
		this.myMoney = myMoney;
		this.myPoint = myPoint;
		this.mycart = new Cart(10);
	}
	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}

	public Cart getMycart() {
		return mycart;
	}

	public void setMycart(Cart mycart) {
		this.mycart = mycart;
	}
	
	//카트에 물건 담기
	public void addToCart(Product product) {
		mycart.addProduct(product);
	}
	//카트에서 물건 빼기
	public void deleteFromCart(int prodNo) {
		mycart.deleteProduct(prodNo);
	}
	//구매
	//영수증을 String으로 반환
	public String buy() {
		int buyMoney = 0; //구매한 물건들의 가격 합계
		int buyPoint = 0; //구매한 물건들의 가격에 의한 포인트
		
		String receipt = "----- 영수증-----\n";  //영수증
				
		for(int i = 0; i < mycart.getProdCount(); i++) {
			
			
			Product product = mycart.getProducts()[i]; //카트에서 뺀 물건 1개
			buyMoney += product.getProdPrice();
			buyPoint += product.getProdPrice() * 0.05; //제품가격의 5%를 포인트로 지급
			receipt += product.getProdName() + "   " + product.getProdPrice() + "원\n";
			
			//구매가 불가능한 경우 : 돈이 부족함
			if(myMoney < buyMoney) {
				System.out.println("돈이 부족합니다. 구매를 종료합니다.");
				return "";
			}
		}
		
		myPoint += buyPoint;
		myMoney -= buyMoney;
		
		receipt += "-----------------\n";
		receipt += "발생한 포인트 " + buyPoint + "점\n";
		receipt += "보유 포인트 " + myPoint + "점\n";
		receipt += "구매총액" + buyMoney + "원\n";
		return receipt;
		
	}
}
