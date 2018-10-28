package rpg;

public class Demo {
	public static void main(String args[]) {

		//Création du héro
		Hero hero = new Hero();

		//Création de l'épée de type arme
		Epee épée = new Epee();

		//Le héro s'équipe de l'arme
		hero.equiper(épée);

		Dragon dragon1 = new Dragon();

		System.out.println(hero.getVieMax());

		hero.gagnerNiveau();

		System.out.println(hero.getVieMax());
	}
}