package RPG;

public class Dragon extends Neutre implements ResMagique{
    private static final int VIE_DFL = 800;
    private static final int FORCE_DFL = 45;

    public Dragon() {
        super(VIE_DFL, FORCE_DFL);
    }

    public void resisterMagie(){
        System.out.println("Je résiste à la magie");
    };
}
