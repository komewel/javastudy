package controller;

import java.util.Scanner;

import service.ContactService;
import service.ContactServiceImpl;

public class ContactController {

	
	/********** 1. field **********/
	private Scanner sc;
	private ContactService service; //여기서 ContactService 호출할 단축키를 만들고
	
	
	/********** 2. constructor **********/
	public ContactController() {
		sc = new Scanner(System.in);	//Scanner 클래스를 쓰는이유가 예외처리가 더 쉽고 처리속도가 더 빠르다고 한다.
		service = new ContactServiceImpl(); //여기서 추상메소드인 ContactService 불러온다 자식 클래스인 ContactServiceimpl의 기능을 쓴다.
	}
	
	
	/********** 3. method **********/
	
	public void play() {
		while(true) {
			System.out.print("1.추가  2.삭제  3.수정  4.개별조회  5.전체조회  6.연락처.csv생성  0.종료 >>> ");
			String choice = sc.next();
			switch(choice) {
			case "1":
				service.addContact(); 
				break;
			case "2":
				service.removeContact(); 
				break;
			case"3":
				service.modifyContact();
				break;	
			case"4":
				service.findContactsByName();
				break;
			case"5":
				service.findAllContacts();
				break;
			case "0":
				System.out.println("연락처 관리 프로그램이 종료되었습니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 시도하세요.");
			}
		}
	}

	
}