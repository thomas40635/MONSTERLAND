package rpg;

import java.util.Scanner;
import java.util.Random;

/**
 * Une quête que le héro peut trouver et décider d'accomplir ou non
 */
public class Quête {
    public Quête(){

    }

    public void debuter(Hero hero){
        System.out.println("Une quête s'offre à vous");

        Scanner sc = new Scanner(System.in);
        System.out.println("Acceptez-vous la quête ? (oui/non)");
        String str = sc.nextLine();
        if(str.equals("oui")){
            // Chance du héro
            int chance = hero.getChance();
            // Chance nécessaire pour réussir la quête (aléatoire entre 1 et 10)
            int test = new Random().nextInt(10);
            test++;
            // Test de réussite
            if(test > chance){
                System.out.println("Vous avez terminé la quête avec succés !");
                hero.gagnerOr(4);
            }
            else if(test == chance){
                System.out.println("Malgré quelques bobos, vous avez terminé la quête.");
                hero.recevoirDegats(2);
                hero.gagnerOr(2);
            }
            else{
                System.out.println("La quête s'est mal déroulée... Votre héro a échoué...");
                hero.recevoirDegats(4);
            }
        }
        else if(str.equals("non")){
        	System.out.println("Vous continuez votre chemin");
        }
        else{
        	System.out.println("Veuillez taper oui ou non");
        	this.debuter(hero);
        }
    }
}
