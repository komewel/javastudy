package ex02_field;

public class MainClass {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.stuNo = "10101";
		student.name = "정숙";
		student.score = new Score(); //덮어씌워주는거 같음
		student.score.eng = 100;
		student.score.kor = 90;
		student.score.math = 80;
		School school = new School();
		school.name = "철산초";
		school.students = new Student[3]; //배열을 만드는거 학생을 세명 저장할수 있어요
		for(int i = 0; i < school.students.length; i++) {
			
			//Student 객체 생성
			school.students[i] = new Student(); // 배열 요소 학생 한명한명(정보를)을 저장할수있어요
			
			school.students[i].name ="정숙";
			school.students[i].stuNo = "10101";
			
			//Score 객체 생성
			school.students[i].score = new Score();
			
			school.students[i].score.kor = 100;
			school.students[i].score.eng = 90;
			school.students[i].score.math = 80;
		
		System.out.println("이름 : " + school.students[i].name);
		System.out.println("학번 : " + school.students[i].stuNo);
		System.out.println("국어 : " + school.students[i].score.kor);
		System.out.println("영어 : " + school.students[i].score.eng);
		System.out.println("수학 : " + school.students[i].score.math);
	
		}
	}

}
