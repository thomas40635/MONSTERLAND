package rpg;

public class Demo {
	public static void main(String args[]) {

		Hero hero = new Hero();
		Dragon dragon = new Dragon();
		Dragon dragon2 = new Dragon();
		Dragon dragon3 = new Dragon();
		BouleDeFeu sort = new BouleDeFeu();

		hero.equiper(sort);

		hero.attaquer(dragon,sort);
	}
}