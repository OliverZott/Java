/**
 * Exception Example 4 - Catch various exception 
 * (source: 'insel' page 561)
 * 
 * 
 * @author Oliver Zott
 * date: 2020-02-01
 */

package chapter8_1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Listing4_CatchVariousException {
	
	public static void main(String[] args) {
		
		printAllEMailAdresses("https://www.rheinwerk-verlag.de/hilfe/service-und-kontakt_8");
	}

	private static void printAllEMailAdresses(String urlString) {
		
		try {
			URL url = new URL(urlString);
			Scanner scanner = new Scanner(url.openStream()); // IOException needs to be handled
			Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");
			for ( String email; (email = scanner.findWithinHorizon(pattern, 0)) != null;)
				System.out.println(email);
		}
		catch(MalformedURLException e) {
			System.out.println("URL is wrong: " + e);
		}
		catch(IOException e) {
			System.out.println("Couldn't open URL: " + e);
		}
	}

}
