package RPG;

abstract class Arme{
    private int degat;
    private int critique;
    private int echec;

    public Arme(int degat,int critique,int echec) {
        this.degat = degat;
        this.critique = critique;
        this.echec = echec;
    }

    public int getDegat() {
        return degat;
    }

    public int getCritique() {
        return critique;
    }

    public int getEchec() {
        return echec;
    }
}