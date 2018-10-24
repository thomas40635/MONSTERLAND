package rpg;

abstract class Arme{
    private int degat;
    private int critique;
    private int echec;

    public Arme(int degat) {
        this.degat = degat;
    }

    public int getDegat() { return degat; }

    public int getCritique() {
        return critique;
    }

    public int getEchec() {
        return echec;
    }
}