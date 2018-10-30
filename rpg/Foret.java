package rpg;

import java.util.ArrayList;

public class Foret extends Lieu{
    private String nom = "Fôret mystérieuse";
    private int niveauMinRequis = 1;
    private ArrayList<Object> etapes = new ArrayList<Object>();
    private int etapeActuelle = 0;

    public Foret() {
        etapes.add(new Quête());
        etapes.add(new Dragon());
        etapes.add(new Marchand());
        etapes.add(new Dragon());
        etapes.add(new Dragon());
        etapes.add(new Druide());
        etapes.add(new Dragon());
    }

    @Override
    public void parcourir(Hero hero){
        etapeActuelle++;
        Object etape = this.getEtapes().get(etapeActuelle - 1);
        if(etape instanceof Monstre) {
            ((Monstre) etape).debuter(hero);
        }
        else if(etape instanceof Marchand){
            ((Marchand) etape).debuter(hero);
        }
        else if(etape instanceof Druide){
            ((Druide) etape).debuter(hero);
        }
        else if(etape instanceof Quête){
            ((Quête) etape).debuter(hero);
        }

    }

    public ArrayList<Object> getEtapes() {
        return etapes;
    }
}
