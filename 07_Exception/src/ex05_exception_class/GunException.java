package ex05_exception_class;

/*
    예외 클래스 만들기(추가적인 정보를 더 담을수있다 "총알 부족" 이런거만 말고 더 담을수 있다 그래서 예외클래스를 추가적으로 만듦)
    1. Exception 클래스를 상속 받는다. (필수)
    2. Exception 클래스 슈퍼 클래스인 Throwable 클래스가 Serializable 인터페이스를 구현하기 때문에 SerialVersionUID 값을 가질 수 있다.(선택)
	
 */

	public class GunException extends Exception {

		private static final long serialVersionUID = 3700059434730916901L;
		
		private String exceptionCode;
		
		public GunException(String message, String exceptionCode) {
			super(message);  //수퍼클래스에다가 정보를 넘기는 구간
			this.exceptionCode = exceptionCode;
		}
		
		public String getExceptionCode() {
			return exceptionCode;
		}

		public void setExceptionCode(String exceptionCode) {
			this.exceptionCode = exceptionCode;
		}
	

}
