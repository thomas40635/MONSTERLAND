package rpg;

public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Monde monde = new Monde();
		Hero hero = monde.getHero();
		Foret foret = monde.getForet();
		System.out.println(foret.getEtapes());
		Epee epee = new Epee();
		Dragon dragon = (Dragon) foret.getEtapes().get(0);
		System.out.println(dragon);
		hero.attaquer(dragon, epee);
		System.out.println(dragon);
//		hero.parcourir(foret);
//		hero.parcourir(foret);
//		hero.parcourir(foret);
//		hero.parcourir(foret);
//		hero.parcourir(foret);

	}

}
