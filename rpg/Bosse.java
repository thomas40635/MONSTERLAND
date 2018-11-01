package rpg;

abstract class Bosse extends Monstre{
    public Bosse(String nom, int vie, int force, int gainExp) {
        super(nom, vie, force, gainExp);
    }

    @Override
    public void recevoirDegats(Personnage attaquant, int degat, String typeDegat){
        if(typeDegat == "magique"){
            degat /= 2;
        }
        super.recevoirDegats(attaquant,degat,typeDegat);
    }
}
