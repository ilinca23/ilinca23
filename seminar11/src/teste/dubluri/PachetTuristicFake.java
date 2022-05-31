package teste.dubluri;

import clase.agentie.IPachetTuristic;

public class PachetTuristicFake implements IPachetTuristic {
    private boolean valoarePoateRezerva;
    private double valoareGetPret;

    public void setValoarePoateRezerva(boolean valoarePoateRezerva) {
        this.valoarePoateRezerva = valoarePoateRezerva;
    }

    public void setValoareGetPret(double valoareGetPret) {
        this.valoareGetPret = valoareGetPret;
    }

    @Override
    public boolean poateRezerva() {
        return valoarePoateRezerva;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return valoareGetPret;
    }
}
