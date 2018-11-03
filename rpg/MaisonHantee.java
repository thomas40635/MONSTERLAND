package rpg;

import java.util.ArrayList;

public class MaisonHantee extends Lieu{
    private static final String NOM = "Maison hantée";
    private int niveauMinRequis = 5;
    private static final ArrayList<Object> etapes = new ArrayList<Object>();

    public MaisonHantee() {
        super(NOM, etapes);

        etapes.add(new Fantome());
        etapes.add(new Marchand());
        etapes.add(new Fantome());
        etapes.add(new Quête());
        etapes.add(new Zombie());
        etapes.add(new Druide());
        etapes.add(new Vampire());
        etapes.add(new Tresor());
        this.setEtapes(etapes);
    }

    public ArrayList<Object> getEtapes() {
        return etapes;
    }
}
