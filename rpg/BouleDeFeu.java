package rpg;

/**
 * La boule de feu est un puissant sort magique
 */
public class BouleDeFeu extends Magique{
    private static final int DEGAT_DFL = 8;
    private static final int MANA_DFL = 6;

    public BouleDeFeu() {
		super(DEGAT_DFL, MANA_DFL);
	}
}