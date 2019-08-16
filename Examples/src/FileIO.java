/** Example - File Input/Out
 * 
 * - File I/O
 * - null
 * - wrapping
 * - try / catch
 * 
 * source:		https://caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html
 * 
 * explanation:	https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/BufferedReader.html
 * 				https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileReader.html
 * 
 * 
 * @author Oliver Zott
 * @version 1.0 16.08.2019
 */

import java.io.*;

public class FileIO {
	
	public static void main( String[] args ) {
		
		// Name of file to open; Has to be in project folder!
		String fileName = "test.txt";			
		
		// This will reference one line at a time
		String line = null;			
		
		try {
			// FileReader Instance reads text files in the following encoding
			FileReader fileReader = new FileReader(fileName);
			
			// Always wrap FileReader in BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while( (line = bufferedReader.readLine()) != null) {						// https://stackoverflow.com/questions/26092910/type-mismatch-when-using-whileline-reader-readline-null
				System.out.println(line);
			}
			
			// Always close files!
			bufferedReader.close();
			
		}
		
		catch( FileNotFoundException ex ) {
			System.out.println( "Unable to open file '" + fileName + "'... " + ex);;
		}
		
		catch( IOException ex ) {
			System.out.println( "Error reading file '" + fileName + "'." );
			System.out.println(ex);
		}
				
	}

}
