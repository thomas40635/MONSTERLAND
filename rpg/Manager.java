package rpg;

public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Monde monde = new Monde();
		Hero hero = monde.getHero();
		Foret foret = monde.getForet();
		Epee epee = new Epee();
		hero.parcourir(foret);

	}

}
