package rpg;

public class PangolinDeLave extends Ordinaire implements Ecaille, Os{

    private static final String NOM = "Pangolin de lave";

    private static final int VIE_DFL = 10;
    private static final int FORCE_DFL = 4;
    private static final int NIVEAU_DFL = 3;
    private static final int GAINEXP_DFL = 5;
    private int gainEcaille = 2;
    private int gainOs = 2;

    public PangolinDeLave() {
        super(NOM, VIE_DFL, FORCE_DFL, GAINEXP_DFL);
    }

    @Override
    public String toString() {
        return  this.NOM + "[getVie()=" + getVie() + ", getForce()=" + getForce()
                + ", isEnVie()=" + isEnVie() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    @Override
    public void donnerEcaille(Personnage attaquant){
        ((Hero) attaquant).gagnerEcaille(this.gainEcaille);
    }
    @Override
    public void donnerOs(Personnage attaquant){
        ((Hero) attaquant).gagnerOs(this.gainOs);
    }

}
