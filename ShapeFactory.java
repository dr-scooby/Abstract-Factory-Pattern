
public class ShapeFactory extends AbstractFactory{
	
	
	public Shape getShape(String shapeType) {
		
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else
			return new Circle(); // default to Circle
		// dont want to return nulls
		
		//return null;
	}

}
