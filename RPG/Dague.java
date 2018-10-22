package RPG;

public class Dague extends Physique{
    private static final int DEGAT_DFL = 15;
    private static final int CRITIQUE_DFL = 20;
    private static final int ECHEC_DFL = 5;

    public Dague() {
        super(DEGAT_DFL, CRITIQUE_DFL, ECHEC_DFL);
    }
}