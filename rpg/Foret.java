package rpg;

import java.util.ArrayList;

public class Foret extends Lieu{
    private String nom = "Fôret mystérieuse";
    private int niveauMinRequis = 1;
    private ArrayList<Object> etapes = new ArrayList<Object>();
    private int etapeActuelle = 0;

    public Foret() {
        etapes.add(new Dragon());
        etapes.add(new Marchand());
        etapes.add(new Dragon());
        etapes.add(new Dragon());
        etapes.add(new Druide());
        etapes.add(new Quête());
        etapes.add(new Dragon());
    }

    @Override
    public void parcourir(Hero hero){
        etapeActuelle++;
        Object etape = this.getEtapes().get(etapeActuelle - 1);
        if(etape instanceof Dragon) {
            System.out.println("Vous tombez face à " + etape.getClass().getSimpleName());
        }
        else if(etape instanceof Marchand){
            System.out.println("Vous rencontrez un marchand");
        }
        else if(etape instanceof Druide){
            System.out.println("Vous croisez un druide");
        }
        else if(etape instanceof Quête){
            System.out.println("Une quête s'offre à vous");
        }
    }

    public ArrayList<Object> getEtapes() {
        return etapes;
    }
}
