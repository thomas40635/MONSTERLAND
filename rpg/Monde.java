package rpg;

public class Monde {

	private static Hero hero = new Hero();
	private static Foret foret = new Foret();

	public Monde() {

	}

	public static Hero getHero() {
		return hero;
	}

	public static Foret getForet() {
		return foret;
	}
}
