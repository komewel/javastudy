package ex07_abstract;

public class Student extends Person{ //ctrl + space bar로 자동으로 만들던가, 소스메뉴에
									 //오버라이드 메소드 버튼 눌러도됨

	@Override
	public void study() {
	     System.out.println("공부한다.");
	}

	
}
