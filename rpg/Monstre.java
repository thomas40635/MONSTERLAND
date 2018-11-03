package rpg;

import java.util.Scanner;

abstract class Monstre extends Personnage {

    private String nom;
    private int gainExp;


    public Monstre(String nom, int vie, int force, int gainExp) {
        super(vie, force);
        this.nom = nom;
        this.gainExp = gainExp;
    }

    public void attaquer(Personnage cible){
        int degat = this.getForce();
        System.out.println(this.nom + " attaque " + cible.getClass().getSimpleName()+".");
        cible.recevoirDegats(degat);
    }

    // TODO : Effectuer les gains d'item, d'exp et d'or du héro à la mort du monstre
    @Override
    public void mourir(Personnage attaquant){
        super.mourir(attaquant);
        if(attaquant instanceof Hero) {
            ((Hero) attaquant).gagnerExp(this.gainExp);
            // TODO : tous les monstres a leur mort ne donne pas tous les differents item
            this.donnerEcaille((Hero) attaquant);
            this.donnerPoil((Hero) attaquant);
            this.donnerOs((Hero) attaquant);
        }
    }
    
  //Methodes qui seront réécrites dans les classes Filles (Dragon ...)
    public void donnerOs(Personnage attaquant) {
		
	}

	public void donnerPoil(Personnage attaquant) {
		
	}

	public void donnerEcaille(Personnage attaquant) {
	}

	public void donnerEsprit(Personnage attaquant) {
	}

	public void combattre(Hero hero){
        System.out.println(this.nom + " vous agresse !");
        Scanner sc = new Scanner(System.in);
        while(hero.isEnVie() && this.isEnVie()){
            System.out.println("Quelle arme utiliser ?");
            for(int i = 0; i < hero.getArmes().length; i++) {
                if(hero.getArmes(i) != null) {
                    System.out.println(i + 1 + " - " + hero.getArmes(i).getClass().getSimpleName() + " (" +hero.getArmes(i).getDegat() + "degat)");
                }
            }
            int arme = sc.nextInt();
            hero.attaquer(this,hero.getArmes(arme - 1));
        }
    }

}