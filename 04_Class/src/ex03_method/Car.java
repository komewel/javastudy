package ex03_method;

public class Car {

	//필드
	int oilpot;
	int carSpeed; //pushAccel 마다 속도는 10씩 증가, 최대 속도 100, pushBrake 마다 속도 10씩 감소
	
	//기름 넣기 메소드1
	void addoil(int oil) {
		oilpot += oil;
		if(oilpot > 50) {
			oilpot = 50;
		}
	}
	//기름 넣기 메소드2
	void addoil2(int oil) {
		if(oilpot + oil > 50) {
			oilpot = 50;
			return;  //메소드를 종료하시오(반환값이 없으면, 값을 적어주지 않으면, 반환타입이 없을때만 가능함 특별할때만 가능(void일때만))
		}
		oilpot += oil;
	}
	
	//달리기 메소드 
	void pushAccel() {
		if(oilpot == 0) {
			return;
		}
		oilpot--;
		
		if(carSpeed + 10 > 100) {
			carSpeed = 100;
			return;
		}
		carSpeed += 10;
	}
	
	//멈추기 메소드
	void pushBrake() {
		if(carSpeed == 0) {
			return;
		}
		carSpeed -= 10;
		if(carSpeed < 0) {
			carSpeed = 0;
		}
		
	}
	
}
