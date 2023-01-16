package practice04_shape;

public class Circle implements Shape {
	
	//필드
	private double radius;
	//생성자
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//메소드
	@Override
	public double getArea() {
		
		return PI * radius * radius ;
	}


	
}
