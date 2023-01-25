package practice;

import java.io.File;

public class MainClass {

	public static void main(String[] args) {
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
			System.out.println("C:" + File.separator + "storage 생성 완료");
		} else {
			// dir.deleteOnExit();  // JVM 실행이 끝나면 지운다.
			dir.delete();  // 지금 바로 지운다.
			System.out.println("C:" + File.separator + "storage 삭제 완료");
		}
		}
	}

