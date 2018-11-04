package rpg;

/**
 * Le bosse à vaincre du lieu "Maison hantée"
 */
public class Vampire extends Bosse implements Poil, Os, Esprit{

    private static final String NOM = "Vampire";

    private static final int VIE_DFL = 8;
    private static final int FORCE_DFL = 4;
    private static final int NIVEAU_DFL = 3;
    private static final int GAINEXP_DFL = 5;
    private int gainEsprit = 2;
    private int gainOs = 1;
    private int gainPoil = 1;

    public Vampire() {
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
