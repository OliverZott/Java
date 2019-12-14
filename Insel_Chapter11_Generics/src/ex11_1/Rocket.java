/** Example 11.1 (page 728)
 * 
 * @author Oliver Zott
 */

package ex11_1;


// Generic Version with object-type "T"
public class Rocket<T> {
	
	
	// private object value;	//  most general type of object
	private T value;	//  general type of object
	
	public Rocket() {}
	
	public Rocket(T value) {
		this.value = value;
	}
	
	public void set(T value) {
		this.value = value;
	}
	
	public T get() {
		return value;
	}
	
	public boolean isEmpty() {
		return value == null;
	}
	
	public void empty() {
		value = null;
	}
	
	

}



/*
public class Rocket {
	
	
	private Object value;	// most general type of object
	
	public Rocket() {}
	
	public Rocket(Object value) {
		this.value = value;
	}
	
	public void set(Object value) {
		this.value = value;
	}
	
	public Object get() {
		return value;
	}
	
	public boolean isEmpty() {
		return value == null;
	}
	
	public void empty() {
		value = null;
	}
	
	

}
//*/