package Serveur;

import java.io.IOException;

public class AppliGare {
	private static final int NUM_PORT_TRAIN_ARRIVEE = 1000;
	private static final int NUM_PORT_TRAIN_DEPART = 1001;

public static void main (String[] args) {
	Gare.initGare();
	try {
		new ServeurDepart(NUM_PORT_TRAIN_DEPART).lancer();
		System.out.println("Serveur départ lance sur le port " + NUM_PORT_TRAIN_DEPART);		
	} catch (IOException e) {
			System.err.println("Pb lors de la création du serveur de depart : " +  e);			
	}
	try {
		new ServeurArrivee(NUM_PORT_TRAIN_ARRIVEE).lancer();
		System.out.println("Serveur arrivee lance sur le port " + NUM_PORT_TRAIN_ARRIVEE);		
	} catch (IOException e) {
			System.err.println("Pb lors de la création du serveur d'arrivee : " +  e);			
	}
}
}
