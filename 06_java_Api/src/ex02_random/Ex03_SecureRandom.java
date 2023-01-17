package ex02_random;

import java.security.SecureRandom;

public class Ex03_SecureRandom {

	public static void main(String[] args) {
		
		//java.security.SecureRandom, 보안에 관련된 기능이 있다 보안이 필요할때 쓴다
		
		SecureRandom secureRandom = new SecureRandom();
		
		//정수 난수
		int dice = secureRandom.nextInt(6) + 1; //1 ~ 6 주사위
		System.out.println(dice);
	}

}
