package Factory_Ex1;

public class FactoryPatternDemo {
	
	public static void main( String[] args ) {
		
		ShapeFactory shapefac = new ShapeFactory();
		
		// get circle object and call draw method
		Shape shape1 = shapefac.getShape( "circle" );
		shape1.draw();
		
	}

}
