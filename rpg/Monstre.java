package rpg;

abstract class Monstre extends Personnage {

    public Monstre(int vie, int force, int niveau) {
        super(vie, force, niveau);
    }

    protected void attaquer(Personnage cible){
        int degat = this.getForce();
        System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName()+".");
        cible.recevoirDegats(this, degat);
    }

    // TODO : Effectuer les gains d'item, d'exp et d'or du héro à la mort du monstre
    @Override
    public void mourir(Hero attaquant){
        super.mourir(attaquant);
        attaquant.gagneExp(this.getGainExp());
    }
}