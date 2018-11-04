package rpg;

/**
 * Le premier monstre rencontré dans le lieu "Maison hantée"
 */
public class Fantome extends Ordinaire implements Esprit{

    private static final String NOM = "Fantôme";

    private static final int VIE_DFL = 6;
    private static final int FORCE_DFL = 2;
    private static final int NIVEAU_DFL = 3;
    private static final int GAINEXP_DFL = 5;
    private int gainEsprit = 1;

    public Fantome() {
        super(NOM, VIE_DFL, FORCE_DFL, GAINEXP_DFL);
    }

    @Override
    public String toString() {
        return "Dragon [getVie()=" + getVie() + ", getForce()=" + getForce()
                + ", isEnVie()=" + isEnVie() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    @Override
    public void donnerEsprit(Personnage attaquant){
        ((Hero) attaquant).gagnerEsprit(this.gainEsprit);
    }

}
