package rpg;

public class Gobelin extends Ordinaire implements Poil, Os{

    private static final String NOM = "Gobelin";

    private static final int VIE_DFL = 6;
    private static final int FORCE_DFL = 1;
    private static final int NIVEAU_DFL = 5;
    private static final int GAINEXP_DFL = 5;
    private int gainOs = 1;
    private int gainPoil = 1;

    public Gobelin() {
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
    public void donnerPoil(Personnage attaquant){
        ((Hero) attaquant).gagnerPoil(this.gainPoil);
    }

    @Override
    public void donnerOs(Personnage attaquant) {
        ((Hero) attaquant).gagnerOs(this.gainOs);
    }

}
