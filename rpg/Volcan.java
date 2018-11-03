package rpg;

import java.util.ArrayList;

public class Volcan extends Lieu{
    private static final String NOM = "Volcan du chaos";
    private int niveauMinRequis = 5;
    private static final ArrayList<Object> etapes = new ArrayList<Object>();

    public Volcan() {
        super(NOM, etapes);

        etapes.add(new PythonDeFeu());
        etapes.add(new Marchand());
        etapes.add(new PythonDeFeu());
        etapes.add(new Quête());
        etapes.add(new PangolinDeLave());
        etapes.add(new Druide());
        etapes.add(new Dragon());
        this.setEtapes(etapes);
    }

    public ArrayList<Object> getEtapes() {
        return etapes;
    }
}
