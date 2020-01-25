package chapter7_6_abstract;

public class Door extends GameObject {
	
	int id;
	boolean isOpen;
	
	
	public Door(int id) {
		this.id = id;
	}
	
	@Override
	public boolean useOn(GameObject object) {
		return false;  // so door can't be used on key or other
	}
	

}
