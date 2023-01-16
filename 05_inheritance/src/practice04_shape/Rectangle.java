package practice04_shape;

public class Rectangle implements Shape {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height;
	}
}

