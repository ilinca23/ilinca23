package memento;

public class Autobuz {
    private String numeSofer;
    private float consumMediu;
    private String model;
    private int anFabricatie;

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    public Autobuz(String numeSofer, float consumMediu, String model, int anFabricatie) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public MementoAutobuz creeazaMemento(){
        return new MementoAutobuz(numeSofer, consumMediu);
    }

    public void restaureazaAutobuz(MementoAutobuz m){
        numeSofer=m.getNumeSofer();
        consumMediu= m.getConsumMediu();
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
