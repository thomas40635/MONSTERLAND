package rpg;

abstract class Personnage {
    private int vie;
    private int force;

    public Personnage(int vie, int force) {
        this.vie = vie;
        this.force = force;
    }

    public void recevoirDegats(int degat){
        System.out.println(this.getClass().getSimpleName()+" reçoit "+degat+" degats.");
        this.vie -= degat;
        if(this.vie <= 0){
            System.out.println(this.getClass().getSimpleName()+" est mort !");
            this.vie = 0;
        }
        else{
            System.out.println(this.getClass().getSimpleName()+" lui reste "+this.vie+" points de vie.");
        }
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "vie=" + vie +
                ", force=" + force +
                '}';
    }

    public boolean isDead(){
        if(this.vie <= 0){
            return true;
        }
        else{
            return false;
        }
    }
}
