package rpg;

public class Demo {
	public static void main(String args[]){

		//Création du héro
		Hero hero = new Hero(20, 2, 1);

		//Création de l'épée de type arme
		Epee épée = new Epee();

		//Le héro s'équipe de l'arme
		hero.equiper(épée);

		Dragon dragon = new Dragon();

		dragon.attaquer(hero);
		dragon.attaquer(hero);
		dragon.attaquer(hero);
		dragon.attaquer(hero);
		dragon.attaquer(hero);
		dragon.attaquer(hero);
		dragon.attaquer(hero);

	}
}