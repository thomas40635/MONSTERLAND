package rpg;

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
