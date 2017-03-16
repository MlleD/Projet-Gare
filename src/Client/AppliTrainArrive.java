package Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppliTrainArrive {
	private final static int PORT_ARRIVEE = 1000;
	private final static String HOST = "localhost"; 

	public static void main (String[] args) {
		Socket s = null;
		try {
			s = new Socket (HOST, PORT_ARRIVEE);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
