package rpg;

import java.util.Scanner;

public class Marchand {

	public void rencontrer(Hero hero){
		System.out.println("Vous rencontrez un marchand");
		System.out.println(hero.getArmes());
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle arme voules-vous acheter ?" + "\n" +
		"1 - Epee contre 2 piece d'or" + "\n" +
		"2 - Dague contre 5 piece d'or" + "\n" +
		"3 - Boule De Feu contre 10 piece d'or" + "\n" +
//		"4 - Eclair contre 10 piece d'or" + "\n" +
		"non - Je ne veux aucune arme");
		String str = sc.nextLine();
		switch(str){
		case "1":
			Epee epee = new Epee();
			hero.equiper(epee);
			break;
		case "2":
			Dague dague = new Dague();
			hero.equiper(dague);
			break;
		case "3":
			BouleDeFeu bouleDeFeu = new BouleDeFeu();
			hero.equiper(bouleDeFeu);
			break;
//		case "4":
//			Eclair eclair = new Eclair();
//			hero.equiper(eclair);
//			break;
		case "non":
			break;
		default:
			System.out.println("Vous devez selectionner un des numéros proposés");
			this.rencontrer(hero);

		}
	}

}
