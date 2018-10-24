package rpg;

import java.util.Arrays;

public class Hero extends Personnage{

    private static final int TAILLE_SAC = 5;
    private int nbArme = 0;
    private Arme arme;
    private Arme[] armes = new Arme[5];

    public Hero(int vie, int force) {
        super(vie, force);
        this.arme = new Poing();
    }

    protected void attaquer(Personnage cible){
        int degat = this.arme.getDegat();
        if(cible.isDead()) {
            System.out.println(cible.getClass().getSimpleName()+" est déjà mort.");
        }
        else {
            if (Math.random() * (100) <= arme.getEchec()) {
                System.out.println(this.getClass().getSimpleName() + " echoue son attaque...");
            } else {
                System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName() + " avec son " + this.arme.getClass().getSimpleName() + ".");
                if (Math.random() * (100) >= arme.getCritique()) {
                    degat = degat * 2;
                    System.out.println(this.getClass().getSimpleName() + " effectue un coup critique avec son " + this.arme.getClass().getSimpleName() + " !");
                }
                cible.recevoirDegats(degat);
            }
        }
        System.out.println("\n");
    }

    protected void equiper(Arme arme){
        this.armes[this.nbArme] = arme;
        this.nbArme++;
        this.arme = arme;
        System.out.println(this.getClass().getSimpleName() + " s'équipe de " + this.arme.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Hero{" +
                "armes=" + Arrays.toString(armes) +
                '}';
    }
}