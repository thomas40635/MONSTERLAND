package rpg;

import java.util.Scanner;

public class Druide {
	public Druide(){

	}

	public void rencontrer(Hero hero){
		System.out.println("Vous croisez un druide");
		System.out.println("Votre vie : " + hero.getVie() + "/" + hero.getVieMax());
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle potion voulez-vous boire? :" + "\n" +
		"1 - Petite potion de vie (+5) contre 2 piece d'or" + "\n" +
		"2 - Moyenne potion de vie (+10) contre 5 piece d'or" + "\n" +
		"3 - Grande potion de vie (+20) contre 10 piece d'or" + "\n" +
		"non - Ne boire aucune potion");
		String str = sc.nextLine();
		switch(str){
			case "1":
				System.out.println("Vous avez saisi : " + str);
				System.out.println(hero.getVie());
				System.out.println(hero.getVie()+5);
				hero.setVie(hero.getVie() + 5);
				System.out.println(hero.getVie());
				System.out.println("Vous buvez la potion et votre vie est de : " + hero.getVie() + "/" + hero.getVieMax());
				break;
			case "2":
				System.out.println("Vous avez saisi : " + str);
				hero.setVie(hero.getVie() + 5);
				System.out.println("Votre vie : " + hero.getVie() + "/" + hero.getVieMax());
				break;
			case "3":
				System.out.println("Vous avez saisi : " + str);
				hero.setVie(hero.getVie() + 5);
				System.out.println("Votre vie : " + hero.getVie() + "/" + hero.getVieMax());
				break;
			case "non":
				System.out.println("Vous n'achetez aucune potion");
				break;
			default:
				System.out.println("Vous devez selectionner un des numéros proposés");
				this.rencontrer(hero);

		}		
	}
}
