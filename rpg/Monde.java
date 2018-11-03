package rpg;

public class Monde {

	private Hero hero = new Hero();
	private Foret foret = new Foret();
	private MaisonHantee maisonHantee = new MaisonHantee();
	private Volcan volcan = new Volcan();

	public Monde() {

	}

	public Hero getHero() {
		return hero;
	}

	public Foret getForet() {
		return foret;
	}

	public MaisonHantee getMaisonHantee() {
		return maisonHantee;
	}

	public Volcan getVolcan() {
		return volcan;
	}
}
