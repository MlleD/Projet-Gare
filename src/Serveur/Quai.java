package Serveur;

public class Quai {
private boolean estPasse; // induque si un train est d�j� pass� ou non
private boolean occupe; // indique si le quai est occup�  ou non
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
