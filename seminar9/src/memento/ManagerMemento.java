package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<MementoAutobuz> listaMemento;

    public ManagerMemento() {
        this.listaMemento = new ArrayList<>();
    }

    public void salveazaMemento(MementoAutobuz m){
        listaMemento.add(m);
    }

    public MementoAutobuz returneazaMementobyIndex(int index){
        return listaMemento.get(index);
    }
}
