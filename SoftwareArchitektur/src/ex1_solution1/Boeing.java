package ex1_solution1;

public class Boeing extends Flugzeug{
	
	private String flotte;
	private String manager;
	
	public Boeing(  String id, String model, String type, String flotte, String manager ) {
		super(id, model, type);
		this.flotte = flotte;
		this.manager = manager;
	}

	public void setFlotte( String flotte ) {
		this.flotte = flotte;
	}
	
	public String getFlotte() {
		return flotte;
	}
	
	public void setManager( String manager ) {
		this.manager = manager;
	}
	
	public String getManager() {
		return manager;
	}
}
