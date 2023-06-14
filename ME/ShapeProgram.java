package ME;

public class ShapeProgram {

	public static void main(String[] args) {
		AllShapes storage = new AllShapes();
		Shape rect1 = new Rectangle(10,10);
		Shape rect2 = new Rectangle(7,7);
		Shape circle = new Circle(10);
		try {
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect1);
			storage.addShape(rect2);
			storage.addShape(rect2);
		}catch(HasAlreadyFiftyShapseException e) {
			System.err.print(e.getMessage());
			e.printStackTrace();
		}
		
		
		try {
			storage.removeShape(circle);
		}catch(DoesNotExistException e) {
			System.err.print(e.getMessage());
			e.printStackTrace();
		}
		
		storage.printAllAreas();
	}

}
