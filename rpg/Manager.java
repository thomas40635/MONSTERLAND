package rpg;

public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Monde monde = new Monde();
		Hero hero = monde.getHero();
		Foret foret = monde.getForet();
		MaisonHantee maisonHantee  = monde.getMaisonHantee();
		Volcan volcan  = monde.getVolcan();

		hero.avancer(foret);
		hero.avancer(maisonHantee);
		hero.avancer(volcan);

	}

}
