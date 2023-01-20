package ex01_String;

public class Ex01_String {
	
	public static void Literal() {
		
		//문자열 리터럴(Literal)
		String str1 = "hello";
		String str2 = "hello";
		
		//문자열 리터럴은 java에 의해서 최적화되기 때문에
		//동일한 리터럴("hello")를 2번이상 사용하면
		//기존에 사용한 리터럴을 재사용한다.("hello"라는 리터럴이 2개이상 만들어 지지 않는다.)
	
		  /*
		    
        |-------|
   str1 | 0x123 |
        |-------|
   str2 | 0x123 |
        |-------|
        |  ...  |
        |-------|
        |"hello"| 0x123
        |-------|
		  
		  */
		
		System.out.println(str1 == str2); //참조값이 같다는 의미이다, 저장된 문자열이 같다는 의미가 아니다.
	}
	
	public static void stringObject() {

		
		//문자열 객체
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		//문자열 객체는 언제나 새로 생성된다.(최적화 대상이 아님)
		
		  /*
	    
		|-------|
   str1 | 0x123 |
        |-------|
   str2 | 0x456 |
        |-------|
        |  ...  |
        |-------|
        |"hello"| 0x123
        |-------|
	    |  ...  | 
	    |-------|
        |"hello"| 0x456  
		|-------|  
		  
		  */
		System.out.println(str1 == str2); //false, 같은 참조값이 아니다, 문자열은 단순비교하면 안된다
		
	}
	
	public static void equals() {
		
		//equals 메소드
		//비교하는 문자열이 동일하면 true, 아니면 false 반환
		
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
	
	public static void length() {
		
		//length 메소드
		//문자열의 길이(글자수)를 반환
		String str = "Hello\nWorld";
		int length = str.length();
		System.out.println("글자수 : " + length);
	}
	
	public static void charAt() {
		
		//charAt 메소드
		//문자열의 특정 인덱스의 문자(char)를 반환
		
		String name = "김영환";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		
		//for문 방식
		for(int i = 0; i < name.length(); i++) {  //비효율적인 코드이다 name.length(); 메소드를 계속 호출하는거라서 효율적이지 않다 리팩토링(효율적인 코드)이 필요하다.
			System.out.println(name.charAt(i));	  //문자열은 name.length() ()가 붙고 배열은 name.length ()가 안붙는다
		}
		
		/*
		 	name.length() 메소드 호출 횟수를 줄이기 위한 리팩토링
			for(int i = 0, length = name.length(); i < length; i++) { //메소드를 없애버리면 됨
				System.out.println(name.charAt(i));
				}
		 */
	}
	
	public static void substring() {
		
		//substring 메소드
		//문자열의 일부 문자열을 반환 //charAt의 진화형
		//substring 사용법
		//1. substring(int begin) : 인덱스 begin부터 끝까지 반환
		//2. substring(int begin, int end) : 인덱스 begin부터 end 이전까지 반환(begin <= 추출범위 < end)
		
		String name = "김영환";
		
		String familyName = name.substring(0,1);
		String givenName = name.substring(1); //1 뒤에 다 출력하는 의미
		
		System.out.println(familyName);
		System.out.println(givenName);
	}
	
	public static void indexOf() {
		
		//indexOf
		//특정 문자열의 인덱스 정보를 반환 
		//발견된 첫 번째 문자열의 인덱스 정보를 반환
		//발견된 문자열이 없는 경우 -1을 반환
		
		//indexOf 사용법
		//1. indexOf(String str) : 인덱스 0부터 str을 검색
		//2. indexOf(String str, int index) : 인덱스 index부터 str을 검색
		
		String slogan = "걱정한다고 걱정이 없어지면 걱정이 없겠네";
		
		int idx1 = slogan.indexOf("걱정");             //0
		int idx2 = slogan.indexOf("걱정", idx1 + 1);   //6
		int idx3 = slogan.indexOf("걱정", idx2 + 1);   //15
		int idx4 = slogan.indexOf("김영환");   	       //-1
		System.out.println(idx4);
	}
	
	public static void lastindexOf() {
		
		//lastindexof
		//발견된 마지막 문자열의 인덱스를 반환
		//나머지 특성은 indexof와 동일
		
		String slogan = "걱정한다고 걱정이 없어지면 걱정이 없겠네";
		
		int idx1 = slogan.lastIndexOf("걱정");
		int idx2 = slogan.lastIndexOf("김영환");		
		System.out.println(idx1);
	}
	
	public static void starsWith() {
		
		//starsWith
		//문자열이 지정된 정규식 패턴(Regular Expression)으로 시작하면 true 반환
		
		//endsWith
		//문자열이 지정된 정규식 패턴(Regular Expression)으로 끝나면 true 반환
		
		//matches
		//문자열이 지정된 정규식 패턴(Regular Expression)을 포함하면 true 반환
		
		String name = "김영환";
		
		if(name.startsWith("김")) {
			System.out.println("김씨다.");
		} else {
			System.out.println("김씨가 아니다.");
		}	

	}
		
	public static void contains() {
		
		//contains
		//문자열이 지정된 CharSequence(ex. String, char[] 등)를 포함하면 true 반환
		
		//참고
		//public interface charSequence { }
		//public class String implements CharSequence { }
		
		String email = "kimcomewel@gmail.com";
		
		if(email.contains("@")) {	//charSequence는 String으로 생각해도된다.
			System.out.println("이메일이 맞다.");
		} else {
			System.out.println("이메일이 아니다.");
		}
	}

	public static void toCase() {
		
		//toUpperCase
		//대문자로 변환
		
		//toLowerCase
		//소문자로 변환
		
		String str = "I am a boy";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	
	}
	
	public static void trim() {
		//trim
		//문자열의 앞뒤에 포함된 공백 문자(스페이스, 탭, 엔터 등)를 제거
		
		String str = "   hahaha  hohoho   ";
		System.out.println("(" + str + ")");
		System.out.println("(" + str.trim() + ")");
	}
	
	public static void replace() {
		
		//replace
		//기존 문자열을 새로운 문자열로 변환한 결과를 반환
		
		//replace 사용법
		//replace(String str1, String str2)
		//모든 str1을 str2로 변환
		
		String str = "best of the best";
		String result = str.replace("best", "worst");
		System.out.println(result);
		
		//replaceAll 
		//정규식 패턴(Regular Expression)을 만족하는 부분을 변환한 결과를 반환
		//모든 문자a를 b로 다 바꾸는기능
		
		String ip = "61.78.121.242";
		String replacedip = ip.replaceAll("1", "_"); //61_78_121_242을 기대하지만 다른 정답이 나옴(정규식에서 마침표는 모든 문자를 의미함)
		System.out.println(replacedip);
		
	}

	public static void isEmpty() {
		
		//isEmpty
		//빈 문자열이면 true 반환
		//빈 문자열("") : 문자열의 길이(length)가 0이면 빈 문자열 
		
		String str = " "; //" "은 빈문자열이 아니다
		if(str.trim().isEmpty()) { //트림을 넣으면 잘못 공백이 생긴경우를 보완해준다
			System.out.println("빈 문자열이다.");
		} else {
			System.out.println("빈 문자열이 아니다.");
		}
		
		//isBlank
		//빈 문자열이거나 공백 문자로만 구성되었다면 true 반환, trim의 역할까지 동시에 해줌
		//**JDK 11 이후에서만 사용 가능**
		if(str.isBlank()) {
			System.out.println("빈 문자열이다.");
		} else {
			System.out.println("빈 문자열이 아니다.");
		}
	}
	
	public static void format() {
		
		//format
		//문자열을 지정한 형식으로 반환
		
		//숫자 형식 지정하기
		int number = 1000;
		
		System.out.println(String.format("%o", number));  //%o : 8진수로 표현하시오
		System.out.println(String.format("%d", number));  //%d : 10진수로 표현하시오
		System.out.println(String.format("%x", number));  //%x : 16진수로 표현하시오(0~9, a, b, c, d)
		System.out.println(String.format("%X", number));  //%X : 16진수로 표현하시오(0~9, A, B, C, D)
		
		//문자열 형식 지정하기
		String str = "hi";
		System.out.println(String.format("%s", str)); //%s : 문자열로 표시하시오.
		
		//출력 폭 지정하기
		System.out.println(String.format("%10d", number));  // %10d : 10자리로 표시하시오. 숫자는 오른쪽에 표시하시오.
		System.out.println(String.format("%-10d", number));  // %-10d : 10자리로 표시하시오. 숫자는 왼쪽에 표시하시오.
		System.out.println(String.format("%5s", str));   
		System.out.println(String.format("%-5s", str));
		
	}
	
	public static void ex01() {
		
		String url = "https://comic.naver.com/webtoon/detail?titleId=758037&no=112&weekday=mon";
		
		String requestURI = url.substring(0, url.indexOf("?"));
		System.out.println(requestURI);
		
		String params = url.substring(url.indexOf("?") + 1);
		System.out.println(params);
	}
	
	public static void ex02() {
		
		String fullName = "apple.jpg";
		
		//확장자가 일반적이지 않을때 예외두기
		String fileName = "";
		String extName = "";
		if(fullName.endsWith(".tar.gz")) {
			fileName = fullName.substring(0, fullName.lastIndexOf(".tar.gz"));
			extName = ".tar.gz";
		} else {
			fileName = fullName.substring(0, fullName.lastIndexOf(".")); //apple
			extName = fullName.substring(0, fullName.lastIndexOf(".") + 1); //.jpg
		}
		System.out.println(fileName);
		System.out.println(extName);
		
		/*
		lastIndex 버전
		String fileName = fullName.substring(0, fullName.lastIndexOf("."));
		System.out.println(fileName);
		String extName = fullName.substring(fullName.lastIndexOf(".") + 1);
		System.out.println(extName);
		*/
	}
	
	public static void main(String[] args) {
		format();
		
	}

}
