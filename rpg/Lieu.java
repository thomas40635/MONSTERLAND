package rpg;

import java.util.ArrayList;

public class Lieu {

	private String nom;
	private int levelMinRequis;
	private int nbEtape_MAX = 7;
	//	private int nbAnimaux_MAX;
	//Liste de monstre
//	private ArrayList<Monstre> monstres = new ArrayList<Monstre>();
	private ArrayList<Object> etapes = new ArrayList<Object>();
	//	public ArrayList<NonJoueur> nonJoueurs = new ArrayList<Monstre>();

	//initialiser la creation du lieu avec son nom et ses etapes
	public Lieu(String nom) {
		this.nom = nom;
		etapes.add(new Dragon());
		etapes.add(new Druide());
		etapes.add(new Dragon());
		etapes.add(new Dragon());
		etapes.add(new Marchand());
		etapes.add(new Dragon());
		etapes.add(new Dragon());
	}

//	public void ajouterElement(Element element){
//		monstres.add(element);
//		
//	}

	public void afficherCaracteristiques(Lieu lieu){
	}
	
	public void afficherEtape(Lieu lieu){
		
		for(int i = 0; i < this.nbEtape_MAX; ++i){
		System.out.println("Etape" + +i + " : " + lieu.getEtapes().get(i));
		}
	}
//	public void desequiper(Arme arme){
//		for(int i = 0; i < this.nbArme; ++i){
//			if(this.armes[i].equals(arme)){
//				this.armes[i] = this.armes[this.nbArme];
//				this.nbArme -= 1;
//				System.out.println("Vous vous deséquipez de " + arme.getClass().getSimpleName());
//			}
//		}
//	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public ArrayList<Object> getEtapes() {
		return etapes;
	}

	public void setEtapes(ArrayList<Object> etapes) {
		this.etapes = etapes;
	}

	






	//Afficher le nombre 

}
