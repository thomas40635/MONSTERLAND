package rpg;

import java.util.Arrays;

public class Hero extends Personnage{

	//private static final int TAILLE_SAC = 5;
	private int nbArme = 0;
	private Arme arme;
	private Arme[] armes = new Arme[5];

	/**
	 * 
	 * @param vie
	 * @param force
	 */
	public Hero(int vie, int force) {
		super(vie, force);
		this.arme = new Poing();
	}

	/**
	 * 
	 * @param cible
	 */
	//    protected void attaquer(Personnage cible){
	//        int degat = this.arme.getDegat();
	//        if(cible.isDead()) {
	//            System.out.println(cible.getClass().getSimpleName()+" est déjà  mort.");
	//        }
	//        else {
	//            if (Math.random() * (100) <= arme.getEchec()) {
	//                System.out.println(this.getClass().getSimpleName() + " echoue son attaque...");
	//            } else {
	//                System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName() + " avec son " + this.arme.getClass().getSimpleName() + ".");
	//                if (Math.random() * (100) >= arme.getCritique()) {
	//                    degat = degat * 2;
	//                    System.out.println(this.getClass().getSimpleName() + " effectue un coup critique avec son " + this.arme.getClass().getSimpleName() + " !");
	//                }
	//                cible.recevoirDegats(degat);
	//            }
	//        }
	//        System.out.println("\n");
	//    }
	protected void attaquer(Personnage cible){
		int degat = this.arme.getDegat();
		if(cible.isDead()) {
			System.out.println(cible.getClass().getSimpleName()+" est déjà  mort.");
		}
		else {
			System.out.println(this.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName() + " avec son " + this.arme.getClass().getSimpleName() + ".");
			cible.recevoirDegats(degat);
			// TODO si l'arme est de type physique on appelle la fonction user() qui enleve la durabilité à l'arme
			if (this.arme instanceof Physique){
				System.out.println("je passe dans la boucle");
				((Physique) arme).user();
			}
		}
	}

	/**
	 * 
	 * @param arme
	 */
	protected void equiper(Arme arme){
		this.armes[this.nbArme] = arme;
		this.nbArme++;
		this.arme = arme;
		System.out.println(this.getClass().getSimpleName() + " s'équipe de " + this.arme.getClass().getSimpleName());
		// TODO : Si le nombre d'arme dépasse la limite afficher une erreur
		//        if (nbArme > 5){
		//        	System.out.println("Vous avez atteint le nombre maximal d'arme (5) sur vous");
		//        }

	}

	@Override
	public String toString() {
		return "Caractéristique du Héro : \n" +
				"nb Arme :" + nbArme + "\n" +
				"arme :" + arme + "\n" +
				"Liste Arme :" + Arrays.toString(armes) + "\n" +
				"vie :" + getVie() + "\n" +
				"force :" + getForce();

	}




}