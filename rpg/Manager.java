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
		BouleDeFeu bouledefeu = new BouleDeFeu();
		Dague dague = new Dague();
		hero.equiper(epee);
		hero.equiper(bouledefeu);
		hero.equiper(dague);

		hero.entrer(foret);
		hero.avancer(foret);

	}

}
