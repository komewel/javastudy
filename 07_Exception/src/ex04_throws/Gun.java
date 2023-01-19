package ex04_throws;

public class Gun {
	
	private int bullet;
	public static final int MAX_BULLET = 10;
	
	//총알 넣기
	public void reload(int bullet) throws RuntimeException { //reload 메소드를 호출하는 곳으로 예외를 던지겠다.
		if(this.bullet + bullet > MAX_BULLET) {				 //메소드가 많아질수록 유리해지는 구조 
			throw new RuntimeException("장전 불가능");
		}
		this.bullet += bullet;
	}

	//총 쏘기
	public void shoot() throws RuntimeException { //uncheckedException 이라서 오류가 나도 그냥 넘어간다 그래서 
		if(bullet == 0) {						  //생략 가능하지만 생략하는버릇 들이지 말기 알아만두기						
			throw new RuntimeException("총알 부족");
		}
		bullet--; 
	}
	//
	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	
	
}
