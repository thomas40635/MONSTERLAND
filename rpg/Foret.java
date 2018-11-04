package rpg;

import java.util.ArrayList;

/**
 * Le premier lieu que le héro parcours
 */
public class Foret extends Lieu{
    private static final String NOM = "Fôret mystérieuse";
    private int niveauMinRequis = 1;
    private static final ArrayList<Object> etapes = new ArrayList<Object>();

    public Foret() {
        super(NOM, etapes);

        etapes.add(new Gobelin());
        etapes.add(new Marchand());
        etapes.add(new Gobelin());
        etapes.add(new Quête());
        etapes.add(new Ogre());
        etapes.add(new Druide());
        etapes.add(new LoupGarou());
        etapes.add(new Tresor());
        this.setEtapes(etapes);
    }

    public ArrayList<Object> getEtapes() {
        return etapes;
    }
}
