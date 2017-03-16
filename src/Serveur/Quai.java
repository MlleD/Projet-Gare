package Serveur;

public class Quai {
private boolean estPasse; // induque si un train est déjà passé ou non
private boolean occupe; // indique si le quai est occupé  ou non
private int numero = 0;
Quai () {
	this.numero ++;
	estPasse = false;
	occupe = false;
}
void trainArrive () {
	occupe = true;
}

}
