/**
 * Shape Factory to create object of concrete class from given information
 * 
 * Oliver Zott
 * 03.09.2019
 */

package Factory_Ex1;

public class ShapeFactory {
	
	// getShape method to get object of type shape
	public Shape getShape( String shapeType ) {
		if ( shapeType == null ) {
			return null;
		}
		
		if ( shapeType.equalsIgnoreCase( "Circle" )) { 		// compares strings without case!
			return new Circle();
			
		} else if ( shapeType.equalsIgnoreCase( "Rectangle" )) {
			return new Rectangle();
			
		} else if ( shapeType.equalsIgnoreCase( "Square" )) {
			return new Circle();
		}
		
		return null;
	}

}
