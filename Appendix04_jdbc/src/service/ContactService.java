package service;

public interface ContactService { //여기서 이용하는 단어는 사용자 친화적인 단어를 쓴다 db에서 쓰는 단어를 쓰지 않는다.
	public void addContact(); //addContact는 이런메소드가 있다, abstract(추상메소드나 추상클래스에 붙인다)
	public void removeContact();
	public void modifyContact();
	public void findContactsByName();
	public void findAllContacts();
}
