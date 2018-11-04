package rpg;

import java.util.ArrayList;

/**
 * Le lieu dans lequel le héro va se retrouver confronter à une suite d'évènements
 */
abstract class Lieu{
	private String nom;
	private ArrayList<Object> etapes;
	private int etapeActuelle = 0;

	public Lieu(String nom, ArrayList<Object> etapes) {
		this.nom = nom;
		this.etapes = etapes;
	}

	/**
	 * Indique que le héro vient de pénétrer le lieu
	 * @param hero Personnage qui entre dans le lieu
	 */
	public void entrer(Hero hero){
		this.avancer(hero);
	}

	/**
	 * Fait avancer le héro dans le lieu et ainsi lui fait rencontrer un nouvel évènement
	 * @param hero Personnage qui avance dans le lieu
	 */
	public void avancer(Hero hero){
		this.etapeActuelle++;
		Object etape = this.etapes.get(this.etapeActuelle - 1);
		if(etape instanceof Monstre) {
			((Monstre) etape).combattre(hero);
		}
		else if(etape instanceof Marchand){
			((Marchand) etape).rencontrer(hero);
		}
		else if(etape instanceof Druide){
			((Druide) etape).rencontrer(hero);
		}
		else if(etape instanceof Quête){
			((Quête) etape).debuter(hero);
		}
		else if(etape instanceof Tresor){
			((Tresor) etape).recuperer(hero);
		}
		if(hero.isEnVie()){
			if(this.etapeActuelle < this.etapes.size()){
				System.out.println("Vous continuez d'avancer.");
				this.avancer(hero);
			}
			else{
				System.out.println("VOUS AVEZ FINI LA MAP " + this.nom);
			}
		}
		else{
			System.out.println("Perdu. Partie terminé.");
		}
	}

	public String getNom() {
		return nom;
	}

	public void setEtapes(ArrayList<Object> etapes) {
		this.etapes = etapes;
	}
}
