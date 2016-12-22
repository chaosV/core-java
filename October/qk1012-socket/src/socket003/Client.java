package socket003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;

	public Client() {

		try {
			socket = new Socket("127.0.0.1", 10001);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
			out.println(line.readLine());

			line.close();
			out.close();
			in.close();
			socket.close();

		} catch (IOException e) {

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();
	}

}
