package chapter7_7_interfaces2;

import java.io.Serializable;

public class GameObject implements Serializable{
	
	protected String name;
	// protected properties are inherited to child-classes
	// protected properties are visible by classes in same package
	
	protected GameObject(String name) {
		this.name = name;
	}

}
