package rpg;

/**
 * La dague est une petite arme physique
 */
public class Dague extends Physique{
    private static final int DEGAT_DFL = 3;
	private static final int DURABILITE_DFL = 5;

    public Dague() {
    	super(DEGAT_DFL, DURABILITE_DFL);
    }
}