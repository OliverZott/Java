package privacy;

public class PasswordExample1 {
	
	public static void main ( String[] args ) {
		
		Password pwd = new Password();
		pwd.assign( "", "pw" );
		
		System.out.println(pwd.check("pw"));
		// System.out.println(pwd.Password());		// doesn't work because private!
		System.out.println(pwd.getPassword());		// getter is a way to solve the problem
	}
	
}
