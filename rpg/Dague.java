package rpg;

public class Dague extends Physique{
    private static final int DEGAT_DFL = 15;
	private static final int durabilite_DFL = 50;

    public Dague() {
    	super(DEGAT_DFL, durabilite_DFL);
    }
}