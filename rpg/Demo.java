package rpg;

public class Demo {
	public static void main(String args[]) {

		Hero hero = new Hero();
		Dragon dragon = new Dragon();
		Epee epee = new Epee();
		
		System.out.println(hero.getEcaille());
		while (dragon.isEnVie()) {
			hero.attaquer(dragon, epee);
		}
		System.out.println(hero.getEcaille());
		System.out.println(hero.getOs());
		System.out.println(hero.getViande());
//		Dragon dragon2 = new Dragon();
//		Dragon dragon3 = new Dragon();
//		BouleDeFeu sort = new BouleDeFeu();

//		hero.equiper(sort);

//		hero.attaquer(dragon,sort);
	}
}