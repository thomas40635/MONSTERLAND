package rpg;

import java.util.Arrays;
import java.util.Scanner;

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
					this.desequiper(arme);
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
				System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getNom() + " avec " + arme.getClass().getSimpleName() + ".");
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
			boolean succes = true;
			for(int i = 0; i < this.nbArme; i++){
				if(arme.equals(this.armes[i])){
					System.out.println("Vous êtes déjà équipé de cette arme...");
					succes = false;
				}
			}
			if(succes){
				this.armes[this.nbArme] = arme;
				System.out.println("Vous vous équipez de " + arme.getClass().getSimpleName());
				this.nbArme++;
			}
		}
		// Sinon, ne l'équipe pas
		else{
			System.out.println("Vous ne pouvez pas vous équiper de "+arme.getClass().getSimpleName() + " car vous avez trop d'armes ");
		}
	}

	public void desequiper(Arme arme){
		
		for(int i = 0; i < this.armes.length; i++){
            if(this.armes[i].equals(arme)){
                for(int j = i; j < this.armes.length - 1; j++){
                	this.armes[j] = this.armes[j+1];
                	
                }
                break;
            }
        }
		this.nbArme -= 1;
		
	}
	
//	public void desequiper(Arme arme){
//		for(int i = 0; i < this.nbArme; ++i){
//			if(this.armes[i].equals(arme)){
//				this.armes[i] = this.armes[this.nbArme];
//				this.nbArme -= 1;
//			}
//		}
//	}

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
    public void gagnerEcaille(int ecaille) {
		this.ecaille += ecaille;
		System.out.println("Vous avez gagné "+ecaille+" ecaille(s)");
	}
    
    public void gagnerOs(int os) {
		this.os += os;
		System.out.println("Vous avez gagné "+os+" os");
	}

    public void gagnerOr(int or) {
		this.or += or;
		System.out.println("Vous avez gagné "+or+" pièce(s) d'or");
	}
    
    public void gagnerPoil(int poil) {
		this.poil += poil;
		System.out.println("Vous avez gagné "+poil+" poil(s) de monstre");
	}

    public void gagnerEsprit(int esprit) {
		this.esprit += esprit;
		System.out.println("Vous avez gagné "+esprit+" esprit(s)");
	}

    public void entrer(Lieu lieu){
		System.out.println("Vous vous aventurez dans "+lieu.getNom());
		lieu.entrer(this);
	}

    public void avancer(Lieu lieu){
		System.out.println("Vous avancez dans "+lieu.getNom());
		lieu.avancer(this);
	}

    public Arme getArmes(int num) {
        return armes[num];
    }


	@Override
	public void setVie(int vie) {
		if(this.vieMax >= vie){
			super.setVie(vie);
		}
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

	public int getMana() {
		return mana;
	}

	public int getNiveau() {
		return niveau;
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

	public int getEcaille() {
		return ecaille;
	}

	public int getEsprit() {
		return esprit;
	}

	public int getPoil() {
		return poil;
	}

	public int getOs() {
		return os;
	}

	public int getOr() {
		return or;
	}

	public void setVieMax(int vieMax) {
		this.vieMax = vieMax;
	}

	public void setMana(int mana) {
		this.mana = mana;
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

	public void setEcaille(int ecaille) {
		this.ecaille = ecaille;
	}

	public void setEsprit(int esprit) {
		this.esprit = esprit;
	}

	public void setPoil(int poil) {
		this.poil = poil;
	}

	public void setOs(int os) {
		this.os = os;
	}

	public void setOr(int or) {
		this.or = or;
	}
}