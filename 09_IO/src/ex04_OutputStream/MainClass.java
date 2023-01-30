package ex04_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void ex01() {
		
	
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex01.bin");
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(file);  //file의 fos란 출력통로를 만들었다.
			
			//출력 단위
			//1. int 	: 1개 출력
			//2. byte[] : 2개 이상 출력
			
			int c = 'A';
			String str = "pple";
			byte[] b = str.getBytes(); //'p'같은 char문자는 2바이트라서 그냥 바이트배열로 쓸수없어서 쓰는 기능
			
			//출력
			fos.write(c);
			fos.write(b);
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void ex02() {
		//한글버전
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex02.bin");
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			
			String str = "안녕하세요";
			byte[] b = str.getBytes(StandardCharsets.UTF_8);  // 한글은 바이트가 커서 UTF_8로 만들어서 인코딩하는 과정
			
			//getBytes(String charsetName)
			//byte[] b = str.getBytes("UTF-8");
			
			fos.write(b);
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(fos != null) {
				fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
}
		
	public static void ex03() {
		
		//빨리 하기위해 상향버전 앞으로 이거만 한다고 보면됨
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex03.bin");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);  // bos = new BufferedOutputStream(new FileOutputStream(file)); 이렇게 쓰면
												  // 위에 FileOutputStream fos = null; 이것도 따로 선언 안해도 됨
			
			bos.write("반갑습니다\n또만나요".getBytes("UTF-8"));
			
			//bos.close(); 여기다가 써도됨 권장은 finally문 안에 써야함
			//이거 안쓰면 아예 내용이 작성 안되네
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	public static void ex04() {
		
		//변수를 그대로 출력하는 DataOutputStream 
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex71_dat");
		
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			
			//출력할 변수
			String name = "에밀리";
			int age = 30;
			double height = 180.5;
			boolean isAlive = true;
			
			//출력(변수 타입에 따라서 메소드가 다름)
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeDouble(height);
			dos.writeBoolean(isAlive);
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos != null) {
					dos.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex05() {
		
		// 객체를 그대로 출력하는 ObjectOutputStream
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex05.dat");
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			//출력할 객체
			List<Person> people = Arrays.asList(
				new Person("에밀리", 30, 180.5, true),
				new Person("제시카", 35, 190.5, true)
			);
			
			//출력할 객체
			Person person = new Person();
			person.setName("제임스");
			person.setAge(40);
			person.setHeight(170.5);
			person.setAlive(false);
			
			//출력
			oos.writeObject(person);
			oos.writeObject(people);
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{ 
				if(oos != null) {
					oos.close();
			}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ex05();
	}

}
