package rpg;

public class Dragon extends Neutre implements Ecaille, Viande, Os{
    private static final int VIE_DFL = 18;
    private static final int FORCE_DFL = 4;
    private static final int NIVEAU_DFL = 5;
    private static final int GAINEXP_DFL = 5;
    private int gainEcaille = 2;
    private int gainOs = 2;
    private int gainViande = 2;

    public Dragon() {
        super(VIE_DFL, FORCE_DFL, GAINEXP_DFL);
    }

    @Override
    public void recevoirDegats(Personnage attaquant, int degat, String typeDegat) {
        if(typeDegat == "magique"){
            degat /= 2;
            System.out.println("Votre sort n'est pas trés efficace contre les dragons..");
        }
        super.recevoirDegats(attaquant, degat, typeDegat);
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

	@Override
	public void donnerViande(Personnage attaquant) {
		((Hero) attaquant).gagnerViande(this.gainViande);
		
	}
    
    public static int getVieDfl() {
        return VIE_DFL;
    }

    public static int getForceDfl() {
        return FORCE_DFL;
    }

    public static int getNiveauDfl() {
        return NIVEAU_DFL;
    }

    public static int getGainexpDfl() {
        return GAINEXP_DFL;
    }

	public int getGainEcaille() {
		return gainEcaille;
	}

	public void setGainEcaille(int gainEcaille) {
		this.gainEcaille = gainEcaille;
	}

	public int getGainOs() {
		return gainOs;
	}

	public void setGainOs(int gainOs) {
		this.gainOs = gainOs;
	}

	public int getGainViande() {
		return gainViande;
	}

	public void setGainViande(int gainViande) {
		this.gainViande = gainViande;
	}
    
    
}
