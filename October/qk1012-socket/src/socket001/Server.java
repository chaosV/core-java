package socket001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private Socket socket;
	private ServerSocket serversocket;
	private BufferedReader in;
	private PrintWriter out;
	
	public Server(){
		try{
			serversocket=new ServerSocket(10000);
			while(true){
				socket = serversocket.accept();
				in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out=new PrintWriter(socket.getOutputStream(),true);
				String line =in.readLine();
				out.println("Your input is:"+line);
				out.close();
				in.close();
				socket.close();
				
			}
		}catch(IOException e){
			
		}
	}
	
	public static void main(String[] args){
		new Server();
	}
	
	
}
