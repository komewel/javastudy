package parking;

public class ParkingLotMain {

	public static void main(String[] args) {

		ParkingLot parkingLot = new ParkingLot("대박주차장");
		parkingLot.manage(); //매니저만 부르면 된다 매니저가 알아서 parkingLot 안에서 다 주물러
							 //주기 때문에
	}

}
