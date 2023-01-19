package practice05_Cart;

public class Cart {
	
	private Product[] products; 
	private int prodCount;  //실제로 product 배열에 저장된 product의 개수
	
	// new Cart(10), new Cart(20).....
	public Cart(int cartSize) {
		products = new Product[cartSize]; //배열생성
		prodCount = 0; //굳이 0으로 변수 초기화 안해줘도됨 알아서 초기화됐으니
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getProdCount() {
		return prodCount;
	}

	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}
	
	//카트에 물건 담기
	//addProduct(new Meat(1, "소고기", 5000))
	//addProduct(new Pizza(1, "고구마피자", 3000))
	//addProduct(new Noodle(1, "누들면", 1500))
	public void addProduct(Product product) {
		if(products.length == prodCount) {
			System.out.println("카트가 가득 찼습니다.");
			return;
		}
		//카트에 물건 담기
		products[prodCount++] = product;
		
		//카트가 가득 차면 물건을 담지 못한다.
	}
	//카트에서 물건 빼기
	public void deleteProduct(int prodNo) {
		
		// 카트가 비어 있으면 뺄 물건이 없다
		if(prodCount == 0) {
			System.out.println("카트가 비어있습니다.");
			return;
		}
		for(int i = 0; i < prodCount; i++) { //굳이 배열 렝스까지 뒤질필요가 없다
			if(products[i].getProdNo() == prodNo) {
				products[i] = products[--prodCount]; 
				break;
			}
			
		}
		
	}


}
