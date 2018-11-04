package rpg;

/**
 * Arme de base du héro. Peu puissante, mais trés durable.
 */
public class Poing extends Physique{
	private static final int DEGAT_DFL = 1;
	private static int durabilite = 1000;

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