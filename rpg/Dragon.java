package rpg;

public class Dragon extends Neutre implements ResMagique{
    private static final int VIE_DFL = 18;
    private static final int FORCE_DFL = 4;
    private static final int NIVEAU_DFL = 5;

    private int gainExp = 5;

    public Dragon() {
        super(VIE_DFL, FORCE_DFL, NIVEAU_DFL);
    }

    public int getGainExp() {
        return gainExp;
    }
}
