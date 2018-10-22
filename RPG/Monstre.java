package RPG;

abstract class Monstre extends Personnage {

    public Monstre(int vie, int force) {
        super(vie, force);
    }

    protected void attaquer(Personnage cible){
        int degat = this.getForce();
        if(cible.isDead()) {
            System.out.println(cible.getClass().getSimpleName()+" est déjà mort.");
        }
        else {
            System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName()+".");
            cible.recevoirDegats(degat);
        }
        System.out.println("\n");
    }
}
