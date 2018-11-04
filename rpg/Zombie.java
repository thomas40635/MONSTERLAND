package rpg;

/**
 * Le second monstre rencontré dans le lieu "Maison hantée"
 */
public class Zombie extends Ordinaire implements Esprit, Os{

    private static final String NOM = "Zombie";

    private static final int VIE_DFL = 5;
    private static final int FORCE_DFL = 3;
    private static final int NIVEAU_DFL = 3;
    private static final int GAINEXP_DFL = 5;
    private int gainEsprit = 1;

    public Zombie() {
        super(NOM, VIE_DFL, FORCE_DFL, GAINEXP_DFL);
    }

    @Override
    public void donnerEsprit(Personnage attaquant){
        ((Hero) attaquant).gagnerEsprit(this.gainEsprit);
    }

}
