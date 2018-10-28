package rpg;

public class Demo {
	public static void main(String args[]) {

		Hero hero = new Hero();
		Dragon dragon = new Dragon();
		Epee épée = new Epee();

		System.out.println(hero);
		hero.equiper(épée);
		System.out.println(hero);
		hero.desequiper(épée);
		System.out.println(hero);
	}
}