package ex1_solution1;


public class Staff {
	private String name;
	private String id;
	
	public Staff ( String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId( String id ) {
		this.id = id;
	}
	public String getId() {
		return id;
	}

}
