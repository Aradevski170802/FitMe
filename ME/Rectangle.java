package ME;

public class Rectangle implements Shape {

	private int width;
	private int height;
	
	public Rectangle() {
		super();
		this.width = 1;
		this.height = 1;
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}

}
