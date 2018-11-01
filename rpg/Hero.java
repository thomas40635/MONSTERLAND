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
	//Item
	private int ecaille = 10;
	private int esprit = 10;
	private int poil = 10;
	private int os = 10;

	private int or = 10;

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
	public void attaquer(Monstre cible, Arme arme){
		int degat = arme.getDegat();
		String typeDegat = "physique";
		boolean attaqueReussie = false;
		if(cible.isEnVie()) {
			if (arme instanceof Physique){
				if(this.attaquerPhysique((Physique) arme)) {
					attaqueReussie = true;
					typeDegat = "physique";
					((Physique) arme).user();
				}
				else{
					System.out.println("Vous ne pouvez pas attaquer avec une arme cassée...");
				}
			}
			else if (arme instanceof Magique){
				if(this.attaquerMagique((Magique) arme)) {
					attaqueReussie = true;
					typeDegat = "magique";
					this.mana -= ((Magique) arme).getMana();
				}
				else{
					System.out.println("Vous n'avez pas assez de mana...");
				}
			}

			if(attaqueReussie) {
				System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName() + " avec " + arme.getClass().getSimpleName() + ".");
				cible.recevoirDegats(this, degat, typeDegat);
				if(cible.isEnVie()) {
					cible.attaquer(this);
				}
			}
		}
		else {
			System.out.println(cible.getClass().getSimpleName()+" est déjà  mort.");
		}
	}

	public boolean attaquerPhysique(Physique arme){
		return arme.isUtilisable();
	}

	public boolean attaquerMagique(Magique arme){
		return this.mana >= arme.getMana();
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

    public void soigner(int soin){
		if(this.getVie() + mana > this.vieMax){
			this.setVie(this.vieMax);
		}
		else {
			this.setVie(this.getVie() + soin);
			System.out.println("Vous regagnez " + soin + " point(s) de vie");
		}
	}

    public void rendreMana(int mana){
		this.setMana(this.getMana() + mana);
		System.out.println("Vous regagnez " + mana + " point(s) de mana");
	}
    
    //Gain des ecaille du monstre quand le hero le tue
    public void gagnerEcaille(int gainEcaille) {
		this.ecaille += gainEcaille;
	}
    
    public void gagnerOs(int os) {
		this.os += os;
	}

    public void gagnerOr(int or) {
		this.or += or;
		System.out.println("Vous avez gagné "+or+" pièces d'or");
	}
    
    public void gagnerPoil(int gainPoil) {
		this.poil += gainPoil;
	}

    public void entrer(Lieu lieu){
		System.out.println("Vous vous aventurez dans "+lieu.getNom());
		lieu.entrer();
	}

    public void avancer(Lieu lieu){
		System.out.println("Vous avancez dans "+lieu.getNom());
		lieu.avancer(this);
	}

    public int getNbArme() {
        return nbArme;
    }

    public Arme[] getArmes() {
        return armes;
    }

    public Arme getArmes(int num) {
        return armes[num];
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

	public int getMana() {
		return mana;
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
	
	public int getEcaille() {
		return ecaille;
	}

	public void setEcaille(int ecaille) {
		this.ecaille = ecaille;
	}

	public void setPoil(int poil) {
		this.poil = poil;
	}

	public int getEsprit() {
		return esprit;
	}

	public int getOr() {
		return or;
	}

	public void setEsprit(int esprit) {
		this.esprit = esprit;
	}

	public int getPoil() {
		return poil;
	}

	public void setOr(int or) {
		this.or = or;
	}

	public int getOs() {
		return os;
	}

	public void setOs(int os) {
		this.os = os;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public String toString() {
		return "Hero{" +
				"vieMax=" + vieMax +
				", mana=" + mana +
				", niveau=" + niveau +
				", nbArme=" + nbArme +
				", armes=" + Arrays.toString(armes) +
				", chance=" + chance +
				", experience=" + experience +
				", ecaille=" + ecaille +
				", esprit=" + esprit +
				", poil=" + poil +
				", os=" + os +
				'}';
	}
}