package Serveur;

import java.io.IOException;
import java.net.ServerSocket;

public class ServeurDepart implements Runnable {

	private ServerSocket listen_socket;
	ServeurDepart(int port) throws IOException {
		listen_socket = new ServerSocket(port);
	}
	@Override
	public void run() {
		
	}
	public void lancer() {
		(new Thread(this)).start();	
	}

}
