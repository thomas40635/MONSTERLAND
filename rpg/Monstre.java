package rpg;

abstract class Monstre extends Personnage {

    private int gainExp;

    public Monstre(int vie, int force, int gainExp) {
        super(vie, force);
        this.gainExp = gainExp;
    }

    public void attaquer(Personnage cible){
        int degat = this.getForce();
        System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName()+".");
        cible.recevoirDegats(this, degat);
    }

    // TODO : Effectuer les gains d'item, d'exp et d'or du héro à la mort du monstre
    @Override
    public void mourir(Personnage attaquant){
        super.mourir(attaquant);
        if(attaquant instanceof Hero) {
            ((Hero) attaquant).gagnerExp(this.gainExp);
            // TODO : tous les monstres a leur mort ne donne pas tous les differents item
            this.donnerEcaille((Hero) attaquant);
            this.donnerViande((Hero) attaquant);
            this.donnerOs((Hero) attaquant);
        }
    }
    
  //Methodes qui seront réécrites dans les classes Filles (Dragon ...)
    public void donnerOs(Personnage attaquant) {
		
	}

	public void donnerViande(Personnage attaquant) {
		
	}

	public void donnerEcaille(Personnage attaquant) {
	}

	public void debuter(Hero hero){
        System.out.println("Vous tombez face à " + this.getClass().getSimpleName());
    }


}