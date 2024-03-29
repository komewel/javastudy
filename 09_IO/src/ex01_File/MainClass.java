package ex01_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;

public class MainClass {
	/*
		 	File 클래스
		 	1. java.io 패키지
		 	2. 파일, 디렉터리(폴더)를 관리하는 클래스이다.
		 	3. 객체 생성 방법
		 		1) new File(경로, 파일)
		 		2) new File(파일)
	 		4. 경로 구분 방법
	 		 	1) 윈도우 : 백슬래시(\)
	 		 	2) 리눅스 : 슬래시(/)
	 
		File dir = new File("C: " + File.separator + "storage");  // \\라고 해야 인식한다, C드라이브 아래 storage 폴더를 의미한다.
		
		//없으면 만들고, 있으면 지운다.
		if(dir.exists() == false) {
		dir.mkdirs();  //mkdirs makedirectory 폴더를 만들어라. rmdir은 지워라
		System.out.println("c: " +File.separator + "storage 생성 완료");
		}else {
			// dir.deleteOnExit();	// jvm 실행이 끝나면 지운다.
			dir.delete();  //지금 바로 지운다.
			System.out.println("c: " +File.separator + "storage 삭제 완료");
		}
	 */
	
	
	public static void ex01() {
		
		//File.separator : 플랫폼에 따라서 자동으로 경로 구분자를 사용한다,
		
		//디렉터리 관련 필수 작업
		
		LocalTime now = LocalTime.now();
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		
		String sep = File.separator;
		File dir = new File("C: " + sep + hour + sep + minute + sep + second);
		
		if(dir.exists() == false) {   //존재여부
			dir.mkdirs();
		}
		
		
		
		
		
	}
		
	public static void ex02() throws IOException {  //예외 처리를 ex02 메소드르 호출한 곳으로 넘긴다. 예외를 내가 처리하지 않겠다 ex02에서는 예외처리 안하겠다.
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		//File file = new File("C:\\storage", "myfile.txt");
		//File file = new File("C:\\storage\\myfile.txt"); 위에거나 이거나 똑같은말인데 이거는 storage폴더가 없으면 에러가뜨지만 
		//가장상단 코드는 없으면 만들어주기 때문에 위 코드가 추천코드
		
		File file = new File(dir, "myfile.txt"); //ioException은 checkedException이라서 그냥 넘어가지 않는다, 반드시 예외처리가 필요한 코드이다
		if(file.exists() == false) {
			file.createNewFile(); 
		}else {
			file.delete();
		}
		
	}
	
	public static void ex03() throws IOException{
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "myfile.txt");
		if(file.exists() == false) {
			file.createNewFile();
		}
		
		//파일의 정보 확인
		System.out.println("파일명 : " + file.getName());
		System.out.println("디렉터리명 : " + file.getParent());
		System.out.println("경로명 : " + file.getPath());  //파일명 + 디렉터리명
		
		System.out.println("디렉터리인가? " + file.isDirectory());
		System.out.println("파일인가? " + file.isFile());
		
		long lastModified = file.lastModified(); //최종 수정일의 타임스탬프값이 나온다.
		System.out.println("최종 수정일 : " + lastModified);
		String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModified);
		System.out.println("최종 수정일 : " + lastModifiedDate);
		
		long size = file.length(); //파일의 크기가 바이트 단위로 저장
		long kb = (size / 1024) + size % 1024 != 0 ? 1 : 0;
		System.out.println("파일 크기 : " + kb + "KB"); //킬로 바이트 출력(1024바이트 = 1킬로바이트)
		}

	public static void ex04() {
		
		File dir = new File("C:" + File.separator + "Program Files");
		
		File[] files = dir.listFiles();  //배열로 리턴
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isHidden() == false) {   //숨겨진 파일
				
				System.out.println(files[i].getName());
			}
		}
	}
	
	public static void main(String[] args)throws IOException { //main 메소드를 호출하는 곳으로 예외 처리를 넘긴다. (개발자가 try-catch하지 않겠다.) 하나의 방법일뿐 추천 방법은 아니라함
		ex04();
		
	}


}
