package rpg;

abstract class Physique extends Arme{
	protected int durabilite;

	public Physique(int degat, int durabilité) {
		super(degat);
	}

	// TODO : public void?
	//Fonction qui enleve de la durabilité à l'arme
	public void user(){
//		System.out.println(Physique.durabilite);
		System.out.println(durabilite);
		System.out.println(durabilite);
		System.out.println(this.durabilite);
//		Physique.durabilite = durabilite - 1;
	}

	/**
	 * @return the durabilité
	 */
	public int getDurabilite() {
		return durabilite;
	}

	/**
	 * @param durabilité the durabilité to set
	 */
	public void setDurabilite(int durabilite) {
		this.durabilite = durabilite;
	}


}
