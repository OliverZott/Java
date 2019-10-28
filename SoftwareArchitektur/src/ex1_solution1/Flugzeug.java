package ex1_solution1;

public class Flugzeug {
	
	private String id;
	private String model;
	private String type;
	
	public Flugzeug( String id, String model, String type ) {
		this.id = id;
		this.model = model;
		this.type = type;
	}
	
	public void setId( String id ) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setModel( String model ) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setType( String type ) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
