package rpg;

abstract class Arme{
	private int degat;

	public Arme(int degat) {
		this.degat = degat;
	}

	public Arme() {
	}

	public int getDegat() {
		return degat;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}

}