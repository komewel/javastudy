package ex04_throws;

public class MainClass {

	public static void main(String[] args) {

		Gun gun = new Gun();
		
		try {
			gun.reload(10); //reload 메소드 호출하는곳 (새로운기능) return기능 비슷
			for(int n = 0; n < 11; n++) {
				gun.shoot();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
