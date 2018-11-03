package rpg;

public class Dragon extends Bosse implements Ecaille, Poil, Os{

    private static final String NOM = "Dragon";

    private static final int VIE_DFL = 16;
    private static final int FORCE_DFL = 4;
    private static final int NIVEAU_DFL = 5;
    private static final int GAINEXP_DFL = 5;
    private int gainEcaille = 2;
    private int gainOs = 2;

    public Dragon() {
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
	public void donnerEcaille(Personnage attaquant){
		((Hero) attaquant).gagnerEcaille(this.gainEcaille);
    }

	@Override
	public void donnerOs(Personnage attaquant) {
		((Hero) attaquant).gagnerOs(this.gainOs);
	}

}
