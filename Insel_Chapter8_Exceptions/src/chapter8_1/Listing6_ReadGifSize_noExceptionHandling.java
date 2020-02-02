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

public class Listing6_ReadGifSize_noExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		RandomAccessFile f = new RandomAccessFile("/home/olli/eclipse-workspace/Insel_Chapter8_Exceptions/src/chapter8_1/shark.gif", "r");
		
		f.seek(6);
		
		// f.read ... Reads a byte of data from this file.
		System.out.printf("%s x %s Pixels%n", f.read() + f.read()*256, f.read()+f.read()*256);
		
		// close can also raise an IOException
		f.close();
	}
}
