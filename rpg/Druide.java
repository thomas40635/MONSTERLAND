package rpg;

import java.util.Scanner;

public class Druide {
	public Druide(){

	}

	public void rencontrer(Hero hero){
		System.out.println("Vous croisez un druide");
		this.acheter(hero);
	}

	public void acheter(Hero hero){
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle potion voulez-vous boire ? :" + "\n" +
				"1 - Potion de vie (+5 vie) : 3 or" + "\n" +
				"2 - Potion de mana (+5 mana) : 3 or" + "\n" +
				"3 - Potion de chance (+2 chance) : 3 os, 3 écailles, 3 poils" + "\n" +
				"4 - Partir");
		String str = sc.nextLine();
		switch(str){
			case "1":
				if(hero.getOr() >= 3) {
					System.out.println("Vous buvez la potion de vie");
					hero.setOr(hero.getOr() - 3);
					hero.soigner(4);
				}
				else{
					System.out.println("Vous n'avez pas assez d'or...");
				}
				this.acheter(hero);
				break;
			case "2":
				if(hero.getOr() >= 5) {
					System.out.println("Vous buvez la potion de mana");
					hero.setOr(hero.getOr() - 3);
					hero.rendreMana(5);
				}
				else{
					System.out.println("Vous n'avez pas assez d'or...");
				}
				this.acheter(hero);
				break;
			case "3":
				if(hero.getOs() >= 2 && hero.getEcaille() >= 2 && hero.getPoil() >= 2) {
					hero.setOs(hero.getOs() - 2);
					hero.setEcaille(hero.getEcaille() - 2);
					hero.setPoil(hero.getPoil() - 2);
					System.out.println("Vous buvez la potion de chance");
					hero.setChance(hero.getChance() + 2);
				}
				else{
					System.out.println("Vous n'avez pas assez de ressources...");
				}
				this.acheter(hero);
				break;
			case "4":
				System.out.println("Vous remercier le druide et continuez votre route.");
				break;
			default:
				System.out.println("Vous devez selectionner un des numéros proposés.");
				this.acheter(hero);
		}
	}
}
