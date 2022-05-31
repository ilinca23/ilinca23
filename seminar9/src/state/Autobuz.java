package state;

public class Autobuz {
    private int nrAutobuz;
    private Stare stare;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare=new LaCapatDeLinie();
    }

    public void pleacaInCursa(){
        new InCursa().doAction(this);
    }

    public void ajungeLaCapat(){
        new LaCapatDeLinie().doAction(this);
    }

    public void iesireDinService(){
        new LaCapatDeLinie().doAction(this);
    }
    public void intraInService(){
        new LaReparat().doAction(this);
    }

    void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public Stare getStare() {
        return stare;
    }
}
