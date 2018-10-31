package rpg;

import java.util.ArrayList;

public class Foret extends Lieu{
    private static final String NOM = "Fôret mystérieuse";
    private int niveauMinRequis = 1;
    private ArrayList<Object> etapes = new ArrayList<Object>();
    private int etapeActuelle = 0;

    public Foret() {
        super(NOM);
        etapes.add(new Druide());
        etapes.add(new Dragon());
        etapes.add(new Dragon());
        etapes.add(new Dragon());
        etapes.add(new Marchand());
        etapes.add(new Dragon());
    }

    @Override
    public void entrer(){
        this.etapeActuelle = 0;
    }

    @Override
    public void avancer(Hero hero){
        etapeActuelle++;
        Object etape = this.getEtapes().get(etapeActuelle - 1);
        if(etape instanceof Monstre) {
            ((Monstre) etape).combattre(hero);
        }
        else if(etape instanceof Marchand){
            ((Marchand) etape).rencontrer(hero);
        }
        else if(etape instanceof Druide){
            ((Druide) etape).rencontrer(hero);
        }
        else if(etape instanceof Quête){
            ((Quête) etape).debuter(hero);
        }

    }

    public ArrayList<Object> getEtapes() {
        return etapes;
    }
}
