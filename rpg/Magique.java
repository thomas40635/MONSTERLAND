package rpg;

/**
 * Catégorie d'armes de type magique (sort) et qui demande du mana pour être utilisées
 */
abstract class Magique extends Arme{

	private int mana;

	public Magique(int degat, int mana) {
		super(degat);
		this.mana = mana;
	}

	public int getMana() {
		return mana;
	}
}
