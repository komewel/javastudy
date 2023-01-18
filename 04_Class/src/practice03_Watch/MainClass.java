package practice03_Watch;

public class MainClass {

	public static void main(String[] args) {
		
		Watch watch = new Watch(0, 0, 0);  // 16시 15분 30초
		
		watch.setHour(25);  	// 25시간 후(1시간)
		watch.setMinute(61);	// 61분 후 	(1시간 1분)
		watch.setSecond(3661);	// 3661초 후(1시간 1분 1초)
		
		watch.see();  // 19시 17분 31초

	}

}