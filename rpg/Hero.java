package rpg;

import java.util.Arrays;

public class Hero extends Personnage{

	private static final int VIE_DFL = 20;
	private static final int FORCE_DFL = 20;
	private static final int NIVEAU_DFL = 20;

	private int nbArme = 0;
	private Arme[] armes = new Arme[5];

	private int chance = 5;
	private int experience = 0;

	public Hero() {
		super(VIE_DFL, FORCE_DFL, NIVEAU_DFL);
		Poing poing = new Poing();
		armes[0] = poing;
	}

	/**
	 * 
	 * @param cible
	 */
	public void attaquer(Personnage cible, Arme arme){
		if(cible.isEnVie()) {
			int degat = arme.getDegat();
			System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName() + " avec " + arme.getClass()           .getSimpleName() + ".");
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

	public void gagnerExp(int experience){
	    this.experience += experience;
	    int expRequis = 10 + (2*this.getNiveau());
	    while(this.experience >= expRequis){
	        this.gagnerNiveau();
	        int expRestant = this.experience - expRequis;
            this.experience = expRestant;
        }
    }

    public void gagnerNiveau() {
        this.niveau += 1;
        this.setForce(this.getForce() + 1);
        this.vi(this.getVieMax() + 2);
    }

    public int getNbArme() {
        return nbArme;
    }

    public Arme[] getArmes() {
        return armes;
    }

    public int getChance() {
        return chance;
    }

    public int getExperience() {
        return experience;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNbArme(int nbArme) {
        this.nbArme = nbArme;
    }

    public void setArmes(Arme[] armes) {
        this.armes = armes;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}