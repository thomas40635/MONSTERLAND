package rpg;

public class Monde {

	

	//Initialise le héro a la création du monde
	//Initialise les 3 lieux à la création du monde
	public Monde() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hero hero = new Hero();
		Lieu foret = new Lieu("Forêt");
		Lieu manoirHante = new Lieu("Manoir Hanté");
		Lieu volcan = new Lieu("Volcan");

	}

}
