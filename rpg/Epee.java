package rpg;

public class Epee extends Physique{
    private static final int DEGAT_DFL = 30;
    private static final int CRITIQUE_DFL = 30;
    private static final int ECHEC_DFL = 15;

    public Epee() {
        super(DEGAT_DFL, CRITIQUE_DFL, ECHEC_DFL);
    }
}