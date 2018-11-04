package rpg;

import java.util.ArrayList;

public class Jeu {
	
	private Lieu[] lieux = new Lieu[3];
	private Hero hero = new Hero();

	public Jeu() {
		lieux[0] = new Foret();
		lieux[1] = new MaisonHantee();
		lieux[2] = new Volcan();
	}
	
	public void commencer(){
		for(int i = 0; i < this.lieux.length; i++){ 
			if(this.hero.isEnVie()){
				this.hero.entrer(this.lieux[i]);
			}
			else{
				this.perdre();
				break;
			}
		}
		this.gagner();
	}
	
	public void gagner(){
		System.out.println("Jeu términé !");
	}
	
	public void perdre(){
		System.out.println("Game Over !");
	}
}
