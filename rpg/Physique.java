package rpg;

/**
 * Catégorie d'armes de type physique (Epée, dague) qui s'use à chaque utilisation jusqu'à se casser
 */
abstract class Physique extends Arme{

	private int durabilite;
	private boolean utilisable = true;

    public Physique(int degat, int durabilite) {
        super(degat);
        this.durabilite = durabilite;
    }

	/**
	 * Use l'arme à chaque utilisation en lui faisant perdre de la durabilité
	 */
	public void user(){
    	if(this.durabilite > 0) {
			this.durabilite -= 1;
		}
		else{
			this.utilisable = false;
		}
	}

	public int getDurabilite() {
		return durabilite;
	}

	public boolean isUtilisable() {
		return utilisable;
	}
}
