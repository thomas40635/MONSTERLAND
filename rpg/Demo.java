package rpg;

public class Demo {
	public static void main(String args[]) {
		Hero hero = new Hero();
		Dragon dragon = new Dragon();
		Dragon dragon1 = new Dragon();
		Ogre ogre = new Ogre();
		Ogre ogre2 = new Ogre();
		Epee epee = new Epee();
		
		System.out.println(hero.getArmes().length);
		hero.equiper(epee);

			hero.attaquer(dragon, epee);
			hero.attaquer(dragon, epee);
			hero.attaquer(dragon, epee);
			hero.attaquer(dragon, epee);
			hero.attaquer(dragon, epee);
		
			
			hero.attaquer(ogre, epee);
		
			
			hero.attaquer(ogre2, epee);
		
			
			hero.attaquer(dragon1, epee);
			hero.attaquer(dragon1, epee);
			hero.attaquer(dragon1, epee);
			hero.attaquer(dragon1, epee);
			hero.attaquer(dragon1, epee);
		
	}
}