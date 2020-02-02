/**
 * Exception Example 6 - Complete Examples w
 * (source: 'insel' page 565)
 * 
 * GIF Format: http://www.onicos.com/staff/iz/formats/gif.html
 * 
 * @author Oliver Zott
 * date: 2020-02-02
 */

package chapter8_1;


import java.io.*;

public class Listing7_ReadGifSize_ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// Bad taste of TCFTC: larger scope of field! --> "try with resources"
		RandomAccessFile f = null;
		
		try {
			f = new RandomAccessFile("/home/olli/eclipse-workspace/Insel_Chapter8_Exceptions/src/chapter8_1/shark.gif", "r");
			f.seek(6);
			System.out.printf("%s x %s Pixels%n", f.read() + f.read()*256, f.read()+f.read()*256);
			f.close();
			
		} 
		catch (FileNotFoundException e) {
			System.err.println("There is no such file.");
		}
		catch (IOException e) {
			System.err.println("genral I/O-Error");
		}
		finally {
			if(f != null) {
				try {
					f.close();
				} catch (IOException e) { }
			}
		}
				
	}
}
