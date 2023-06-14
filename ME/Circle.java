package ME;

public class Circle implements Shape {
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	private void setRadius(double radius) {
		if(radius<=0) {
			this.radius = 0.1;
		}
		this.radius = radius;
	}

	
	public Circle() {
		super();
		setRadius(0);
		
	}

	public Circle(double radius) {
		super();
		setRadius(radius);
	}
	
	@Override
	public double getArea() {
		return this.radius*this.radius * 3.14;
	}

}
