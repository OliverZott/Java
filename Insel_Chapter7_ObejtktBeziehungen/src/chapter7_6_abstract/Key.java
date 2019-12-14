package chapter7_6_abstract;

public class Key extends GameObject{
	
	int id;
	
	public Key(int id) {
		this.id = id;
	}
	
	@Override
	public boolean useOn(GameObject object) {
		if (object instanceof Door) {
			if (this.id == ((Door) object).id) {		// explicit type-casting !!!!
				return ((Door) object).isOpen = true;		// explicit type-casting !!!!
			}
		}
		return false;
	}
}
