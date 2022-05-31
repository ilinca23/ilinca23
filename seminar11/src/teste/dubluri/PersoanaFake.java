package teste.dubluri;

import clase.persoana.IPersoana;

public class PersoanaFake implements IPersoana {
    private int valoareGetVarsta;
    private boolean valoarecheckCNP;
    private String valoareGetSex;

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoarecheckCNP(boolean valoarecheckCNP) {
        this.valoarecheckCNP = valoarecheckCNP;
    }

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoarecheckCNP;
    }
}
