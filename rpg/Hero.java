package rpg;

import java.util.Arrays;

public class Hero extends Personnage{

	private int nbArme = 0;
	private Arme[] armes = new Arme[5];
	private int chance = 5;
	private int experience;
	private int niveau = 1;

	/**
	 * 
	 * @param vie
	 * @param force
	 */
	public Hero(int vie, int force, int niveau) {
		super(vie, force, niveau);
		Poing poing = new Poing();
		this.equiper(poing);
	}

	/**
	 * 
	 * @param cible
	 */
	protected void attaquer(Personnage cible, Arme arme){
		if(cible.isEnVie()) {
			int degat = arme.getDegat();
			System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName() + " avec " + arme.getClass().getSimpleName() + ".");
			cible.recevoirDegats(this,degat);
			// TODO si l'arme est de type physique on appelle la fonction user() qui enleve 1 de durabilité à l'arme
			if (arme instanceof Physique){
                ((Physique)arme).user();
			}
		}
		else {
			System.out.println(cible.getClass().getSimpleName()+" est déjà  mort.");
		}
	}

	/**
	 * 
	 * @param arme
	 */
	public void equiper(Arme arme){
		this.armes[this.nbArme] = arme;
		this.nbArme++;
		System.out.println(this.getClass().getSimpleName() + " s'équipe de " + arme.getClass().getSimpleName());
		// TODO : Si le nombre d'arme dépasse la limite afficher une erreur
		//        if (nbArme > 5){
		//        	System.out.println("Vous avez atteint le nombre maximal d'arme (5) sur vous");
		//        }

	}

	public void gagneExp(int experience){
	    this.experience += experience;
    }

	@Override
	public String toString() {
		return "Caractéristique du Héro : \n" +
				"nb Arme :" + nbArme + "\n" +
				"Liste Arme :" + Arrays.toString(armes) + "\n" +
				"vie :" + getVie() + "\n" +
				"force :" + getForce();
	}
}