package practice;

public class Practice {
	
	public static void main(String[] args) {
	
	String str1 = "hello";
	String str2 = new String("HELLO"); //ctrl + shift + x 누르면 대문자로 고쳐짐
	//대소문자도 일치해야함
	if(str1.equals(str2)) {			//문자열은 이걸로만 비교해야한다
		System.out.println("str1과 str2는 같은 문자열이다");
	} else {
		System.out.println("str1과 str2는 다른 문자열이다");
	}
	
	//대소문자는 무시함
	if(str1.equalsIgnoreCase(str2)) {
		System.out.println("str1과 str2는 같은 문자열이다");
	} else {
		System.out.println("str1과 str2는 다른 문자열이다");
	}
}
}

	

