package practice03_Watch;

public class Watch {

	// 필드
	private int hour;  // 0 ~ 23
	private int minute;  // 0 ~ 59
	private int second;  // 0 ~ 59
	
	// 생성자
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// 메소드
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour += (this.hour += hour) % 24;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute += minute;
		if(this.minute > 60) {	
			this.hour += 1;
		}else {
		return;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second += (this.second += second) % 60;
	}
	public void see() {
		System.out.println(this.hour + "시" + minute + "분" + second + "초");
	}
	
	
	
}