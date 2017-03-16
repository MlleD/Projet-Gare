package Serveur;

public class ServiceDepart implements Runnable {

	@Override
	public void run() {
	}
	// lancement du service
	public void lancer() {
		(new Thread(this)).start();		
	}

}
