package rpg;

import java.util.Arrays;

public class Hero extends Personnage{

	private static final int VIE_DFL = 20;
	private static final int FORCE_DFL = 2;

	private int vieMax = 20;
	private int mana = 20;
	private int niveau = 1;
	private int nbArme = 0;
	private Arme[] armes = new Arme[5];

	private int chance = 5;
	private int experience = 0;

	public Hero() {
		super(VIE_DFL, FORCE_DFL);
		Poing poing = new Poing();
		armes[0] = poing;
		nbArme++;
	}

	/**
	 *
	 * @param cible
	 * @param arme
	 */
	public void attaquer(Personnage cible, Arme arme){
		if(cible.isEnVie()) {
			if (arme instanceof Physique){
				if(this.attaquerPhysique((Physique) arme)) {
					int degat = arme.getDegat();
					((Physique) arme).user();
				}
				else{
					System.out.println("Votre arme est cassée...");
				}
			}
			else if (arme instanceof Magique){
				if(this.attaquerPhysique((Physique) arme)) {
					int degat = arme.getDegat();
					((Physique) arme).user();
				}
				else{
					System.out.println("Votre arme est cassée...");
				}
			}

			System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName() + " avec " + arme.getClass()           .getSimpleName() + ".");
			cible.recevoirDegats(this,degat);

		}
		else {
			System.out.println(cible.getClass().getSimpleName()+" est déjà  mort.");
		}
	}

	public boolean attaquerPhysique(Physique arme){
		if(!arme.isUtilisable()){

		}
	}

	public boolean attaquerMagique(Magique arme){
		if(this.mana >= arme.getMana()) {
			arme.getMana();
		}
		else{
			System.out.println();
		}
		if(!arme.isUtilisable()){

		}
	}

	/**
	 * 
	 * @param arme
	 */
	public void equiper(Arme arme){
		// Si le héro a encore de la place, l'équipe de l'arme
		if(nbArme < this.armes.length) {
			this.armes[this.nbArme] = arme;
			this.nbArme++;
			System.out.println("Vous vous équipez de " + arme.getClass().getSimpleName());
		}
		// Sinon, ne l'équipe pas
		else{
			System.out.println("Vous ne pouvez pas vous équiper de "+arme.getClass().getSimpleName() + " car vous avez trop d'armes ");
		}
	}
	// TODO : Vérifiez si l'arme désequiper est bien équipé
	public void desequiper(Arme arme){
		for(int i = 0; i < this.nbArme; ++i){
			if(this.armes[i].equals(arme)){
				this.armes[i] = this.armes[this.nbArme];
				this.nbArme -= 1;
				System.out.println("Vous vous deséquipez de " + arme.getClass().getSimpleName());
			}
		}
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
        this.setVieMax(this.getVieMax() + 2);
        this.setVie(this.getVie() + 2);
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

	public static int getVieDfl() {
		return VIE_DFL;
	}

	public static int getForceDfl() {
		return FORCE_DFL;
	}

	public int getVieMax() {
		return vieMax;
	}

	public int getNiveau() {
		return niveau;
	}

	public int getExperience() {
		return experience;
	}

	@Override
	public void setVie(int vie) {
		if(this.vieMax >= vie){
			super.setVie(vie);
		}
	}

	public void setVieMax(int vieMax) {
		this.vieMax = vieMax;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
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

	@Override
	public String toString() {
		return "Hero{" +
				"armes=" + Arrays.toString(armes) +
				'}';
	}
}