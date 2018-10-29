package rpg;

public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Monde monde = new Monde();
		Hero hero = Monde.getHero();
		Foret foret = Monde.getForet();

		hero.parcourir(foret);
		hero.parcourir(foret);
		hero.parcourir(foret);
		hero.parcourir(foret);
		hero.parcourir(foret);

	}

}
