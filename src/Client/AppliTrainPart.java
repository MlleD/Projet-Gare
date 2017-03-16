package Client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppliTrainPart {
	private final static int PORT_DEPART = 1001;
	private final static String HOST = "localhost"; 

	public static void main (String[] args) {
		Socket s = null;
		try {
			s = new Socket (HOST, PORT_DEPART);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
