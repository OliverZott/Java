package chapter7_5_binding;

public class Room extends GameObject {
	
	public int size;
	
	@Override
	public String toString() {
		return super.toString() + "[size=" + size + "]";
	}

}
