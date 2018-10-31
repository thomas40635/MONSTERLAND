package rpg;

abstract class Lieu{
	private String nom;
	public Lieu(String nom) {
		this.nom = nom;
	}

	public void entrer(){

	}

	public void avancer(Hero hero){

	}

	public String getNom() {
		return nom;
	}
}
