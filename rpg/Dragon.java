package rpg;

public class Dragon extends Neutre {
    private static final int VIE_DFL = 18;
    private static final int FORCE_DFL = 4;
    private static final int NIVEAU_DFL = 5;
    private static final int GAINEXP_DFL = 5;

    public Dragon() {
        super(VIE_DFL, FORCE_DFL, GAINEXP_DFL);
    }

    @Override
    public void recevoirDegats(Personnage attaquant, int degat, String typeDegat) {
        if(typeDegat == "magique"){
            degat /= 2;
            System.out.println("Votre sort n'est pas trés efficace contre les dragons..");
        }
        super.recevoirDegats(attaquant, degat, typeDegat);
    }

    public static int getVieDfl() {
        return VIE_DFL;
    }

    public static int getForceDfl() {
        return FORCE_DFL;
    }

    public static int getNiveauDfl() {
        return NIVEAU_DFL;
    }

    public static int getGainexpDfl() {
        return GAINEXP_DFL;
    }
}
