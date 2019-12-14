package chapter7_4_overload;


public class GameObject {
	
	/*
	 * protected is inherited and visible by ALL sub-classes
	 * 
	 * public > protected > packet_visible > private
	 * can be tricky in use and might make code fragile
	 */
	protected String name = "";	 
	
	
	// getter
	public String getName() {
		return name;
	}
	/** 
	 * Example - "final"
	 * final setter (so can't be overloaded)
	 * 
	 * @param name
	 */
	public final void setName(String name) {
		if (name != null && ! name.isEmpty())
		{
			this.name = name;
		}
	}

	/**
	 * Example - "override methods"
	 * 
	 * @return String (special version of "toString")
	 */
	@Override
	public String toString() {
		return String.format("%s[name = '%s'] (%s)", getClass().getSimpleName(), name, getClass());
	}

	
	/** 
	 * Example - "covariant return value"
	 * 
	 */
	GameObject getThis()
	{
		return this;
	}
}
