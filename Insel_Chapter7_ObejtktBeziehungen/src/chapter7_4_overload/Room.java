package chapter7_4_overload;


public class Room extends GameObject{
	
	public int size;
	
	@Override
	public String toString() {
		// return String.format("%s[name = '%s'] (%s)", getClass().getSimpleName(), name, size, getClass());  // stupid
		return super.toString() + "[size = " + size +" ]";
		
	}
	
	
	/*//final method can not be overridden
	@Override
	public void setName(String name)	
	{
		this.name = name;
	}
	//*/
	
	/**
	 * Example - "covariant return value"
	 */
	@Override
	Room getThis()
	{
		return this;
	}
}
