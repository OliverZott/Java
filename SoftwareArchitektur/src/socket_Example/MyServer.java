package socket_Example;

import java.io.*;  
import java.net.*;  

public class MyServer {

	public static void main(String[] args){  
		
		try{  
			
			// Constructor (int port)
			ServerSocket ss = new ServerSocket(6666);  
			
			// Listens for a connection to be made to this socket and accepts it.
			Socket s = ss.accept();  //establishes connection   
			
			// Constructor ( input-stream in )
			DataInputStream dis = new DataInputStream( s.getInputStream() );  
			
			
			String  str = (String)dis.readUTF();  
			System.out.println("message= " + str);  
			
			// close socket
			ss.close();  
			
		}catch(Exception e){System.out.println(e);}  
	}  
	
}
