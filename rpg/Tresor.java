package rpg;

public class Tresor {
	public Tresor(){
		
	}
	
	public void recuperer(Hero hero){
        System.out.println("Vous trouvez un trésor");
        hero.gagnerOr(5);
	}
}
