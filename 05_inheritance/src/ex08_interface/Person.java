package ex08_interface;

	public interface Person {
		/*
		 인터페이스(interface)
		 1. 추상 클래스의 한 형태이다.
		 2. JDK 1.7 이전에는 추상 메소드로만 구성된 추상 클래스를 의미
		 3. JDK 1.8 이후에는 본문이 있는 default 메소드, static 메소드를 추가할 수 있다.
		 4. 인터페이스는 주로 final 상수, 추상메소드 가진다.
		 5. 인터페이스의 추상 메소드는 public abstract를 모두 생략할 수 있다(워낙 추상 메소드가 많이 들어가니까 abstract를 생략할수있게 해준거임.), 근데 public은 생략 잘 안한다 
		 	생략만 되는거지 작동은 public으로 함.
		 6. 중간수정(유지보수)을 최소화 할 수 있음(유연하게 대처가능하단말)
		 */
		//default 메소드(본문이 있는 메소드), 모든 펄슨은 먹는것과 자는것을 할수있으니
		public default void eat() {    
			System.out.println("먹는다.");
		}
		//default 메소드(본문이 있는 메소드)
		public default void sleep() {
			System.out.println("잔다.");
		}
		//추상(abstract) 메소드(본문이 없는 메소드)
		public void study();
		
	}
