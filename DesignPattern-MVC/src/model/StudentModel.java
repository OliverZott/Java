/**
 * MVC Example 
 * 
 * source: https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
 * 
 * - Model mustn't have relationship to other classes!
 * - should always be usable in other projects without changes!
 * 
 * @author Oliver Zott
 * @version 1.0 / 27.08.2019
 */

package model;

public class StudentModel {
	
	private String rollNo;
	private String name;
	
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo( String rollNo ) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
}
