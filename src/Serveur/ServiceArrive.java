package Serveur;

import java.net.Socket;

public class ServiceArrive implements Runnable {

	ServiceArrive(Socket s) {

	}
	@Override
	public void run() {
	}
	// lancement du service
	public void lancer() {
		(new Thread(this)).start();		
	}

}
