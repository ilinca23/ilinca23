package teste.dubluri;

import clase.agentie.IPachetTuristic;
//returneaza o valoare hardcodata
public class PachetTuristicStub implements IPachetTuristic {
    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return 100.0;
    }
}
