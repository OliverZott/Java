/**
 * Exception Example 5 - Catch various exception using "throws"
 * (source: 'insel' page 563)
 * 
 * - use 'throws' to forward error to caller
 * 
 * @author Oliver Zott
 * date: 2020-02-02
 */

package chapter8_1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Listing5_CatchVariousException_throws {
	
	
	// caller has to handle exception (function only throws it)
	public static void main(String[] args) {
		
		try {
			printAllEMailAdresses("https://www.rheinwerk-verlag.de/hilfe/service-und-kontakt_8");
		}
		catch(MalformedURLException e) {
			System.out.println("URL is wrong: " + e);
		}
		catch(IOException e) {
			System.out.println("Couldn't open URL: " + e);
		}		
	}

	// throws exception instead of handling it directly
	private static void printAllEMailAdresses(String urlString) throws MalformedURLException, IOException {

			URL url = new URL(urlString);
			Scanner scanner = new Scanner(url.openStream()); // IOException needs to be handled
			Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");
			for ( String email; (email = scanner.findWithinHorizon(pattern, 0)) != null;)
				System.out.println(email);
	}
}
