package singleton_ex1;

public class SingleObjectDemo {
	
	public static void main( String[] args ) {
		
		// try construct object: The constructor SingleObject() is not visible 
		// SingleObject test = new SingleObject();
		
		// Get the only existing object:
		SingleObject object = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		SingleObject object3 = SingleObject.getInstance();
		
		object.showMessage();
		object2.showMessage();	
		object3.showMessage();	
		
	}

}
