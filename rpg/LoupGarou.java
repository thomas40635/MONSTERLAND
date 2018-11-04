package rpg;

/**
 * Le loup-Garou est le bosse à vaincre dans le lieu "Fôret mystérieuse"
 */
public class LoupGarou extends Bosse implements Poil, Os{

    private static final String NOM = "Loup garou";

    private static final int VIE_DFL = 8;
    private static final int FORCE_DFL = 4;
    private static final int NIVEAU_DFL = 3;
    private static final int GAINEXP_DFL = 5;
    private int gainOs = 2;
    private int gainPoil = 2;

    public LoupGarou() {
        super(NOM, VIE_DFL, FORCE_DFL, GAINEXP_DFL);
    }

    @Override
    public void donnerPoil(Personnage attaquant){
        ((Hero) attaquant).gagnerPoil(this.gainPoil);
    }

    @Override
    public void donnerOs(Personnage attaquant) {
        ((Hero) attaquant).gagnerOs(this.gainOs);
    }
}
