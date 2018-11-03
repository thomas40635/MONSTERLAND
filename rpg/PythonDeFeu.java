package rpg;

public class PythonDeFeu extends Ordinaire implements Ecaille{

    private static final String NOM = "PythonDeFeu";

    private static final int VIE_DFL = 7;
    private static final int FORCE_DFL = 3;
    private static final int NIVEAU_DFL = 3;
    private static final int GAINEXP_DFL = 5;
    private int gainEcaille = 2;

    public PythonDeFeu() {
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

}
