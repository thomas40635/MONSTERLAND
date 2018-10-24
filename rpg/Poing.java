package rpg;

public class Poing extends Physique{
    private static final int DEGAT_DFL = 5;
    private static final int CRITIQUE_DFL = 10;
    private static final int ECHEC_DFL = 25;

    public Poing() {
        super(DEGAT_DFL, CRITIQUE_DFL, ECHEC_DFL);
    }
}