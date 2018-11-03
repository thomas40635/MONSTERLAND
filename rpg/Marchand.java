package rpg;

import java.util.Scanner;

public class Marchand {

	public void rencontrer(Hero hero){
		System.out.println("Vous rencontrez un marchand");
		this.acheter(hero);
	}

	public void acheter(Hero hero){
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle arme voules-vous acheter ?" + "\n" +
		"1 - Epee : 8 or" + "\n" +
		"2 - Dague : 5 or" + "\n" +
		"3 - Eclair : 2 or " + "\n" +
		"4 - Boule De Feu : 12 or" + "\n" +
		"5 - Partir");
		String str = sc.nextLine();
		switch(str){
		case "1":
			Epee epee = new Epee();
			hero.equiper(epee);
			this.acheter(hero);
			break;
		case "2":
			Dague dague = new Dague();
			hero.equiper(dague);
			this.acheter(hero);
			break;
		case "3":
			Eclair eclair = new Eclair();
			hero.equiper(eclair);
			this.acheter(hero);
			break;
		case "4":
			BouleDeFeu bouleDeFeu = new BouleDeFeu();
			hero.equiper(bouleDeFeu);
			this.acheter(hero);
			break;
		case "5":
			System.out.println("Vous remercier le marchand et continuez votre route.");
			break;
		default:
			System.out.println("Vous devez selectionner un des numéros proposés");
			this.rencontrer(hero);
		}
	}

}
