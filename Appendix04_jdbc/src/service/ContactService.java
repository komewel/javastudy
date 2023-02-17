package service;

public interface ContactService { //여기서 이용하는 단어는 사용자 친화적인 단어를 쓴다 db에서 쓰는 단어를 쓰지 않는다.
	public void addContact(); //addContact는 이런메소드가 있다, abstract(추상메소드나 추상클래스에 붙인다)
	public void removeContact();
	public void modifyContact();
	public void findContactsByName();
	public void findAllContacts();
}
/*
package service;

import dao.ContactDAO; //패키지가 달라서 임포트를 해줘야지만 쓸수있다.

public class ContactService {
	
	//서비스는 다오를 불러서 데이터를 호출해야 한다.
	//ContactDAO 객체를 필드로 선언해 보자
	private ContactDAO dao = ContactDAO.getInstance(); //클래스 메소드이므로 클래스 이름으로 불러야 한다.
	
	public void 목록서비스() { 
	dao.목록보기();
	}
}

*/