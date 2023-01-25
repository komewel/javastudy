import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class MainClass {
	
	public static void ex01() {
		
	}
	public static void ex02() {
		
		// 문제2. C:\Program Files\Java\jdk-11.0.17 경로의 파일 목록을 아래와 같이 출력하시오.
		/*
		2023-01-04  오후 02:19    <DIR>          bin
		2023-01-04  오후 02:19    <DIR>          conf
		2023-01-04  오후 02:19    <DIR>          include
		2023-01-04  오후 02:19    <DIR>          jmods
		2023-01-04  오후 02:19    <DIR>          legal
		2023-01-04  오후 02:19    <DIR>          lib
		2023-01-04  오후 02:19               160 README.html
		2023-01-04  오후 02:19             1,302 release
		               2개 파일               1,462 바이트
		*/
		}
	
	public static void ex03() {
		// 문제3. C:\storage 디렉터리를 삭제하시오.
		// 파일이 저장된 디렉터리는 지워지지 않으므로 먼저 디렉터리에 저장된 파일을 삭제해야 한다.
		
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File("C:" + File.separator + "storage", "myfile.txt");
		if(file.exists()) {
			file.delete();
		}
		
		if(dir.exists()) {
			dir.delete();
		}
		
		
	}

	public static void main(String[] args) {
		ex03();
		
	}

}
