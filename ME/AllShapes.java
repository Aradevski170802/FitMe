package ME;

import java.util.List;
import java.util.ArrayList;
public class AllShapes {
	List<Shape> shapeList;

	public AllShapes(List<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	
	public AllShapes() {
		this.shapeList = new ArrayList<Shape>();
	}
	
	public void addShape(Shape s)throws HasAlreadyFiftyShapseException {
		if(this.shapeList.size() == 50) {
			throw new HasAlreadyFiftyShapseException("This list is full!");
		}
		this.shapeList.add(s);
	}
	
	public void removeShape(Shape s) throws DoesNotExistException {
		if(!this.shapeList.contains(s)) {
			throw new DoesNotExistException("This object does not exist!");
		}
		this.shapeList.remove(s);
	}
	
	public void printAllAreas() {
		for(Shape shape: this.shapeList) {
			System.out.println(shape.getArea());
		}
	}
	
}
