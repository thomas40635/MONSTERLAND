package rpg;

/**
 * Un trésor que le héro peut découvrir en parcourant un lieu
 */
public class Tresor {
	public Tresor(){
		
	}

	/**
	 * Récupérer le trésor et gagner l'or qu'il contient
	 * @param hero Le héro qui découvre le trésor
	 */
	public void recuperer(Hero hero){
        System.out.println("Vous trouvez un trésor");
        hero.gagnerOr(5);
	}
}
