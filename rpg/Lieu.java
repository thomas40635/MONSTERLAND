package rpg;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Lieu{
	private String nom;
	private ArrayList<Object> etapes;
	private int etapeActuelle = 0;

	public Lieu(String nom, ArrayList<Object> etapes) {
		this.nom = nom;
		this.etapes = etapes;
	}

	public void entrer(){

	}

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
		if(hero.isEnVie()){
			if(this.etapeActuelle < this.etapes.size()){
				System.out.println("Vous continuez d'avancer.");
				this.avancer(hero);
			}
			else{
				System.out.println("GAME OVER");
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
