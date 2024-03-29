package ex05_InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.List;

import ex04_OutputStream.Person;

public class MainClass {
	
	public static void ex01() {
		
		File file = new File("C:" + File.separator + "storage", "ex01.bin");
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			//입력 단위
			//1. int 	: 1개 입력
			//2. byte[] : 2개 이상 입력
			
			int c = 0;
			StringBuilder sb = new StringBuilder();
			while((c = fis.read()) != -1) {
				sb.append((char)c);
			}
			System.out.println(sb.toString());
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public static void ex02() {
		
		//원래 한글이 깨져서 출력된다 한글이 3바이트인데 4바이트씩 출력하니까(바이트 스트림과 한글 처리의 문제확인)
		
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			byte[] b = new byte[4]; //한번에 4바이트를 읽어 오시오.
			int readByte = 0; //실제로 읽은 바이트를 저장해 두시오. 
			
			StringBuilder sb = new StringBuilder();
			
			while((readByte = fis.read(b)) != -1) {
				sb.append(new String(b, 0, readByte)); //배열b의 인덱스0부터 readByte개 데이터를 사용한다.
			}
			System.out.println(sb.toString());
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void ex02_complete() {
		

		//(ex02 해결버전) 바이트 입력 스트림을 문자 입력 스트림으로 변환하는 InputStreamReader 원래 Reader는 byte스트림에서는 못씀
		
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		
		InputStreamReader isr = null;
		
		
		try {
			
			isr = new InputStreamReader(new FileInputStream(file));  //여기서부터는 바이트스트림이 아닌다 문자 스트림이다
			
			char[] cbuf = new char[4]; //한번에 4글자를 읽어 오시오.
			int readCount = 0; //실제로 읽은 글자수를 저장해 두시오. 
			
			StringBuilder sb = new StringBuilder();
			
			while((readCount = isr.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCount); //배열cbuf의 인덱스0부터 readCount개 데이터를 사용한다.
			}
			System.out.println(sb.toString());
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(isr != null) {
					isr.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex03() {
		
		//좀더 빠르기만 할뿐 근본적인 문제해결 x
		
		File file = new File("C:" + File.separator + "storage", "ex03.bin");
		BufferedInputStream bis = null;
		
		try {
			
			bis = new BufferedInputStream(new FileInputStream(file));
			
			byte[] b = new byte[4];
			int readByte = 0;
			StringBuilder sb = new StringBuilder();
			
			while((readByte = bis.read(b)) != -1) {
				sb.append(new String(b, 0, readByte));
			}
			
			System.out.println(sb.toString());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null) {
					bis.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex03_complete() {
		
		//버퍼 기반으로 읽기(실제실무)
		
		File file = new File("C:" + File.separator + "storage", "ex03.bin");
		
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file))); //바이트스트림을 문자열로 바꾸고 속도향상을 위해 버퍼리더를 끼워넣음
			
			String line = null;
			while((line = br.readLine()) != null) {
				sb.append(line + "\n"); 
			}
			System.out.println(sb.toString());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void ex04() {
		
		// String name, int age, double height, boolean isAlive 순으로 값이 저장된 ex04.dat 파일
		
		File file = new File("C:" + File.separator + "storage", "ex04.dat");
		
		DataInputStream dis = null;
		
		try {
			
			dis = new DataInputStream(new FileInputStream(file));
			
			// 입력(변수 타입에 따라서 메소드가 다름)
			String name = dis.readUTF();          // writeUTF에 대응
			int age = dis.readInt();              // writeInt에 대응
			double height = dis.readDouble();     // writeDouble에 대응
			boolean isAlive = dis.readBoolean();  // writeBoolean에 대응
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(height);
			System.out.println(isAlive);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) {
					dis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex05() {
		
		// Person 객체가 3개 저장되어 있는 (List<Person> 2개, Person 1개) ex05.dat 파일
		
				File file = new File("C:" + File.separator + "storage", "ex05.dat");
				
				ObjectInputStream ois = null;
				
				try {
					
					ois = new ObjectInputStream(new FileInputStream(file));
					
					// 입력
					// readObject 메소드는 Object를 반환하므로 적절하게 캐스팅 해야 한다.
					@SuppressWarnings("unchecked")
					List<Person> people = (List<Person>)ois.readObject();
					Person person = (Person)ois.readObject();
					
					System.out.println(people);
					System.out.println(person);
					
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(ois != null) {
							ois.close();
						}
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
				
			}
	
	public static void main(String[] args) {
		ex05();
		
	}

}
