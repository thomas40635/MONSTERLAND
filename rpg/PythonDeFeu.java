package rpg;

/**
 * Le premier monstre rencontré dans le lieu "Volcan du chaos"
 */
public class PythonDeFeu extends Ordinaire implements Ecaille{

    private static final String NOM = "Python De Feu";

    private static final int VIE_DFL = 7;
    private static final int FORCE_DFL = 3;
    private static final int NIVEAU_DFL = 3;
    private static final int GAINEXP_DFL = 5;
    private int gainEcaille = 2;

    public PythonDeFeu() {
        super(NOM, VIE_DFL, FORCE_DFL, GAINEXP_DFL);
    }

    @Override
    public void donnerEcaille(Personnage attaquant){
        ((Hero) attaquant).gagnerEcaille(this.gainEcaille);
    }

}
