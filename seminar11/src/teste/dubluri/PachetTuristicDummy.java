package teste.dubluri;

import clase.agentie.IPachetTuristic;
//nu vom folosi niciodata nicio metoda
public class PachetTuristicDummy implements IPachetTuristic {


    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return null;
    }
}
