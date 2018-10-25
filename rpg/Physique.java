package rpg;

abstract class Physique extends Arme{

	private int durabilite;

    public Physique(int degat, int durabilite) {
        super(degat);
        this.durabilite = durabilite;
    }

	// TODO : public void?
	//Fonction qui enleve de la durabilité à l'arme

	public void user(){
		this.durabilite -= 1;
	}

	/**
	 * @return the durabilite
     */
	public int getDurabilite() {
		return durabilite;
	}

	/**
	 * @param durabilite the durabilite to set
	 */
	public void setDurabilite(int durabilite) {
		this.durabilite = durabilite;
	}


}
