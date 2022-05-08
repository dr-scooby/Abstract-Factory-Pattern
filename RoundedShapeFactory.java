
public class RoundedShapeFactory extends AbstractFactory{
	

	
	public Shape getShape(String shapeType) {
		
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}else
			return new Circle(); // default to Circle
		// dont want to return nulls
		
		//return null;
	}

}
