package assignment3_Composite;


public class CabinItem implements TraverseCabin{
	
	private int id;
	private static int NUMB = 1000;
	private String name;
	private boolean isPay;
	
	
	/* constructor */
	public CabinItem( String name, boolean pay ) {
		this.id = NUMB++;
		this.name = name;
		this.isPay = pay;
	}
	
	
	/* Setter and Getter */
	public void setName( String name ) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId( int id ) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setPay( boolean pay ) {
		this.isPay = pay;
	}
	public boolean getPay() {
		return this.isPay;
	}
	
	
	@Override
	public void traverse(String einrueckung) {
		System.out.println(einrueckung + "Product: " + getName() + ", extra-cost: " + getPay());
	}

}
