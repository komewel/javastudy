package ex01_try_catch;

import java.io.FileReader;
import java.util.Scanner;

public class MainClass {
	
	public static void ex01() {
		
		try {
		
			String[] season = new String[4];
			
			season[0] = "spring";
			season[1] = "summer";
			season[2] = "autumn";
			season[3] = "winter";
			season[4] = "what??";
			
			
			for(String str : season) {
				System.out.println(str.substring(0, 3));
			}  //NullPointerException(Unchecked Exception속해있음) 발생 season[3] 값이 null값이라서 null.substring(0, 3)은 처리가 안되므로 
			   //오류가나도 동작은한다 책임은 내가져라 (Unchecked Exception경우)
			   //문제가 없으면 try문만 하고 catch문으로는 안넘어간다
			
	} catch(Exception e) {      //예외객체 이름은 관습적으로 e라고 적는다
								//Unchecked Exception의 경우 RuntimeException으로도 처리 가능, 모든예외는 Exception으로 처리 가능
		
		System.out.println("ArrayIndexOutOfBoundsException 발생");
	}
		
}

	public static void ex02() {
	
		try {
			String input = "1,2,3,,4,5";
			String[] numbers = input.split(",");
			int[] iNumbers = new int[numbers.length];
			
			for(int i = 0; i < numbers.length; i++) {
				iNumbers[i] = Integer.parseInt(numbers[i]); //정수로 바꿀수없으니 오류남
				System.out.println(iNumbers[i]);
			}
		} catch(NumberFormatException e) {  //Unchecked Exception(try catch문이 없어도 동작함)이므로 RuntimeException 가능, 모든예외는 Exception으로 처리 가능
			System.out.println("NumberFormatException 오류발생");
		}
	}
	
	public static void ex03() {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("덧셈식을 입력하시오(예: 1+2) >>> ");
			String expr = sc.next();
			String[] item = expr.split("[+]"); 
			int number1 = Integer.parseInt(item[0]);
			int number2 = Integer.parseInt(item[1]);
			System.out.println(number1 + number2);
			sc.close();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("+를 포함해서 입력하세요");
		} catch(NumberFormatException e) {
			System.out.println("정수 덧셈만 가능합니다.");
		} catch(Exception e) {  //마지막 catch 블록은 Exception으로 모든 예외를 처리한다.
			System.out.println("예외가 발생했습니다");
		}
	}
	public static void ex04() {
		
		try {
		FileReader fr = new FileReader("sample.txt");  // 이것만 적으면 오류가 나는데 sample.txt 이 파일이 없을때 대비책이 없기때문에 오류뜨는거임 
		fr.close();
		} catch(Exception e) {
			System.out.println("예외가 발생하였다.");
		}
		}
	
	public static void main(String[] args) {
		ex04();
	}
}
