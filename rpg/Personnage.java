package rpg;

abstract class Personnage {
	private int vie;
	private int force;
	private boolean enVie = true;

	public Personnage(int vie, int force) {
		this.vie = vie;
		this.force = force;
	}

	public void recevoirDegats(int degat){
        this.vie -= degat;
        System.out.println(this.getClass().getSimpleName() + " reçoit " + degat + " degats.");

        if (this.vie <= 0) {
            this.mourir();
            this.vie = 0;
        } else {
            System.out.println(this.getClass().getSimpleName() + " lui reste " + this.vie + " points de vie.");
        }
	}

	public void recevoirDegats(Personnage attaquant, int degat, String typeDegat){
        this.vie -= degat;
        System.out.println(this.getClass().getSimpleName() + " reçoit " + degat + " degats.");

        if (this.vie <= 0) {
            this.mourir(attaquant);
            this.vie = 0;
        } else {
            System.out.println(this.getClass().getSimpleName() + " lui reste " + this.vie + " points de vie.");
        }
	}

    public void mourir(Personnage attaquant){
        System.out.println(this.getClass().getSimpleName()+" est mort !");
        this.setEnVie(false);
    }

    public void mourir(){
        System.out.println("Votre héro est mort !");
        System.out.println("___--- GAME OVER ---___");
        this.setEnVie(false);
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public boolean isEnVie() {
        return enVie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setEnVie(boolean enVie) {
        this.enVie = enVie;
    }
}