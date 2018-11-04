package rpg;

/**
 * Catégorie de monstre puissant, unique et présent à la fin de chaque lieux
 */
abstract class Bosse extends Monstre{
    public Bosse(String nom, int vie, int force, int gainExp) {
        super(nom, vie, force, gainExp);
    }

    /**
     * Les bosses subissent moitié moins de dégâts magiques
     * @param attaquant Le personnage qui attaque le bosse
     * @param degat Les dégâts infligés par le personnage attaquant
     * @param typeDegat Les types de dégats causés par l'attaque (physique/magique)
     */
    @Override
    public void recevoirDegats(Personnage attaquant, int degat, String typeDegat){
        if(typeDegat == "magique"){
            degat /= 2;
        }
        super.recevoirDegats(attaquant,degat,typeDegat);
    }
}
