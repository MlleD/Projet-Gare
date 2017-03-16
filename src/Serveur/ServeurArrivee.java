package Serveur;

import java.io.IOException;
import java.net.ServerSocket;

public class ServeurArrivee implements Runnable {

	private ServerSocket listen_socket;
	ServeurArrivee(int port) throws IOException {
		listen_socket = new ServerSocket(port);
	}
	@Override
	public void run() {
		try {
			while(true)
				new ServiceArrive(listen_socket.accept()).lancer();
		}
		catch (IOException e) { 
			try {this.listen_socket.close();} catch (IOException e1) {}
			System.err.println("Pb sur le port d'écoute d'arrivee :"+e);
		}
	}
	// lancement du serveur
	public void lancer() {
		(new Thread(this)).start();	
	}

}
