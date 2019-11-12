package assignment3_Composite;

import java.util.HashSet;
//import java.util.List;
import java.util.Set;


public class CabinLayout implements TraverseCabin{
	
	private String cabinName;
	private Set<TraverseCabin> listOfCabinItem = new HashSet();  	// why use Set<> ... new HashSet() ???
	
	
	
	/* Constructor */
	public CabinLayout( String name ) {
		super();  												// why use super here ???
		this.cabinName = name;
	}

	
	
	/* Setter Getter */
	public String getCabinName() {
		return cabinName;
	}
	public void setCabinName(String cabinName) {
		this.cabinName = cabinName;
	}
	public Set<TraverseCabin> getListOfCabinItem(){
		return listOfCabinItem;
	}
	public void setListOfCabinItem( Set<TraverseCabin> itemSet) {
		this.listOfCabinItem = itemSet;
	}
	
	
	
	/* Object methods */
	public void addItem ( TraverseCabin item) {
		listOfCabinItem.add(item);
	}
	
	
	
	/* Override Interface method */
	@Override
	public void traverse(String einr) {
		System.out.println(einr + "CabinLayout: " + cabinName.toString() );  		// why toString()
		for (TraverseCabin item : listOfCabinItem) {
			item.traverse(einr + "\t");
		}
	}
	

}
