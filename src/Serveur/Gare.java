package Serveur;

import java.util.HashMap;


/* simule la gare elle-m�me avec son planning du jour.
 * Le planning est un tableau de correspondance entre num�ro de train
 * et informations relatives au train (quai, horaire attendu, pass� ou non).
 * */
public abstract class Gare {
	private Gare gare;
	private int nbQuai = 5; // nombre de quais dans une gare
	private int nbTrain = 60;
	private HashMap<Integer, Object> planning = new HashMap<Integer, Object>();
	
	Gare () {
		
	}
	// cr�e et renvoie la gare avec son planning et ses quais
	private static Gare initGare() {
		new Quai();
		new Quai();
		new Quai();
		System.out.println("La gare est creee.");
		return gare;
	}
	
	private void planning () {

	}
	
	private void infosTrains () {
		/**
		 * Object : Tableau d'infos
		 * 1�re ligne = num�ro du quai
		 * 2�me ligne = heure du train
		 * 3�me ligne = boolean si le train est pass� dans la gare 
		 */

		Object[][] infos = new Object[3][27];
		int nb = 1; // sert � remplir le num�ro du quai
		int heure = 6;// heure de passage d'un train dans un quai
		for (int i = 0 ; i < 27 ; i++) {			
			if (nb > 3) {
				heure += 2;
				nb = 1;
			}
			infos[0][i] = nb;
			infos[1][i] = heure; // un train toutes les 2 heures dans les quais
			infos[2][i] = false;
			nb++;
		}
		for (Object[] train : infos) {
			for (Object info : train){
				System.out.print(info.toString() + " ");
			}
			System.out.println();
		}

	}
}
