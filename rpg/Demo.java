package rpg;

public class Demo {
	public static void main(String args[]){

		//Création du héro
		Hero hero = new Hero(100, 50);


		//Création de l'épée de type arme
		Arme épée = new Epee();

		//Le héro s'équipe de l'arme
		hero.equiper(épée);

		//Création de la dague de type arme
		Arme dague = new Dague();

		hero.equiper(dague);

		Arme poing = new Poing();

		hero.equiper(poing);



		//Stat Hero
//		System.out.println(hero);
		//Stat Arme courrante du hero
//		System.out.println(poing);

		//Creation dragon
		Dragon dragon = new Dragon();
//		System.out.println(dragon);

		hero.attaquer(dragon);

		
		//Stat Hero
				System.out.println(dragon);
				//Stat Arme courrante du hero
				System.out.println(poing);
	}
}