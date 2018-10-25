package rpg;

public class Epee extends Physique{
	private static final int DEGAT_DFL = 30;
	private static final int durabilite_DFL = 100;

	public Epee() {
		super(DEGAT_DFL, durabilite_DFL);
	}
}