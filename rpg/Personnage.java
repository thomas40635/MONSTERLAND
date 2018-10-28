package rpg;

abstract class Personnage {
	private int vie;
	private int force;
	private boolean enVie = true;
	private int niveau;

	public Personnage(int vie, int force, int niveau) {
		this.vie = vie;
		this.force = force;
		this.niveau = niveau;
	}

	public void recevoirDegats(Personnage attaquant, int degat){
        this.vie -= degat;
        System.out.println(this.getClass().getSimpleName() + " reçoit " + degat + " degats.");

        if (this.vie <= 0) {
            this.mourir(attaquant);
            this.vie = 0;
        } else {
            System.out.println(this.getClass().getSimpleName() + " lui reste " + this.vie + " points de vie.");
        }
	}

	public int getVie() {
		return vie;
	}

	public int getForce() {
		return force;
	}


    public void setForce(int force) {
        this.force = force;
    }

    public boolean isEnVie() {
        return enVie;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "vie=" + vie +
                ", force=" + force +
                ", enVie=" + enVie +
                '}';
    }

    public void mourir(Personnage attaquant){
        System.out.println(this.getClass().getSimpleName()+" est mort !");
        this.enVie = false;
	}
}