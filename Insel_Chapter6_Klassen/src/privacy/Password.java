/**
 * Example 3: Privacy
 * 
 * - "private"
 * 
 * 
 * Author: Oliver Zott
 */

package privacy;

public class Password {
	
	private String password = "";
	
	
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String passwort) {
		this.password = passwort;
	}
	
	
	public void assign( String oldPassword, String newPassword ) {		// can't be static, because uses object variable!!!
		
		if( getPassword().equals( oldPassword ) && newPassword != null ) {
			setPassword(newPassword);
			System.out.println("Password set");
		} 
		else
			System.out.println("Password could not be changed!");
	}
	
	
	public boolean check( String passwordToCheck ) {
		
		return passwordToCheck.equals (getPassword());
	}
	
	
	
	// -----------------------------------------------------------------------------------------
	public static void main ( String[] args ) {
		
		Password pwd = new Password();
		pwd.assign( "", "pw" );
		
		System.out.println(pwd.check("pw"));
		System.out.println(pwd.getPassword());		// works because private only applies to outside (other) classes
	}

}
