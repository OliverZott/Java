package chapter7_5_binding;

public class GameObject {
	
	public String name;
	
	@Override
	public String toString() {
		return String.format("%s[name=%s]", getClass().getSimpleName(), name);
	}

}
