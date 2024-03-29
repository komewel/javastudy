package ex05_ellipsis;

public class Calculator {

	/*매개변수 생략(여러개일때 한번에 쓰는거 오버로드 말고 더 쉽게)
		1.전달 되는 인수의 개수가 정해지지 않은 경우에 사용한다.
		2. 말 줄임표(...)를 활용한다.
		3. 실제로는 배열로 처리된다.
	*/
	double addition(double... numbers) { //이거 배열이네
		double total = 0.0;
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
}
