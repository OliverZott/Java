/** Example - File Input/Out
 * 
 * - File I/O (Chapter 19 - page 1061)
 * - null		
 * - wrapping
 * - try / catch (Chapter 
 * - FileReader: Abstract class for reading character streams
 * - InputStream: Abstract class is the superclass of all classes representing an input stream of bytes. 
 * 
 * 
 * source:		Tutorial: https://caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html
 * 				NIO / IO: http://tutorials.jenkov.com/java-nio/nio-vs-io.html
 * 
 * explanation:	https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/BufferedReader.html
 * 				https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileReader.html
 * 
 * 
 * @author Oliver Zott
 * @version 1.0 16.08.2019
 */

import java.io.*;
/*
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
*/

public class FileIO {
	
	public static void main( String[] args ) {
		
		// Name of file to open; Has to be in project folder!
		String fileName_in = "infile.txt";
		String fileName_out = "outfile.txt";
		
		// This will reference one line at a time
		String line = null;			

		
		// ----------------------------------------- Read from file: 
		try {
			// FileReader Instance reads text files in the following encoding
			FileReader fileReader = new FileReader( fileName_in );
			
			// Always wrap FileReader in BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while( (line = bufferedReader.readLine()) != null) {						// https://stackoverflow.com/questions/26092910/type-mismatch-when-using-whileline-reader-readline-null
				System.out.println(line);
			}
			
			// Always close files!
			bufferedReader.close();
			
		}
		
		catch( FileNotFoundException ex ) {
			System.out.println( "Unable to open file '" + fileName_in + "'... " + ex);;
		}
		
		catch( IOException ex ) {
			System.out.println( "Error reading file '" + fileName_in + "'." );
			System.out.println(ex);
		}
		
		
		// ----------------------------------------- Write to file:
		try {
			// FileWriter instance 
			FileWriter fileWriter = new FileWriter( fileName_out );
			
			// Always wrap (same as above)
			BufferedWriter bufferedWriter = null;
			bufferedWriter = new BufferedWriter( fileWriter );
			//bufferedWriter = new BufferedWriter( new FileWriter("C:\\Users\\Dura\\eclipse-workspace\\Examples\\file_out.txt") );
			
			// write() doesn't automatically add line break
			bufferedWriter.write( "Hello there, " );
			bufferedWriter.write( " here is stuff. " );
			bufferedWriter.newLine( );
			bufferedWriter.write( "blabla." );
			
			// Always close file
			bufferedWriter.close();
			
		}
		
		catch( IOException ex ) {
			System.out.println( "Error writing file '" + fileName_out + "': " + ex);
		}
				
	}

}
