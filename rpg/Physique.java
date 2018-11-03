package rpg;

abstract class Physique extends Arme{

	private int durabilite;
	private boolean utilisable = true;

    public Physique(int degat, int durabilite) {
        super(degat);
        this.durabilite = durabilite;
    }

	//Fonction qui enleve de la durabilité à l'arme
	public void user(){
    	if(this.durabilite > 0) {
			this.durabilite -= 1;
		}
		else{
			this.utilisable = false;
		}
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

	public boolean isUtilisable() {
		return utilisable;
	}
}
