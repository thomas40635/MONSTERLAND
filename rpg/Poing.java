package rpg;

public class Poing extends Physique{
	private static final int DEGAT_DFL = 5;
	private static int durabilite = 100;

	public Poing() {
		super(DEGAT_DFL, durabilite);
	}

	@Override
	public String toString() {
		return "Poing [getDurabilite()=" + getDurabilite() + ", getDegat()="
				+ getDegat() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getDurabilite() {
		return durabilite;
	}

	public void setDurabilite(int durabilite) {
		Poing.durabilite = durabilite;
	}

	public static int getDegatDfl() {
		return DEGAT_DFL;
	}


}