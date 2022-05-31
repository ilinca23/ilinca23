package command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<Comanda> listaComenzi;

    public ManagerComenzi() {
        this.listaComenzi = new ArrayList<>();
    }

    public void invoke(Comanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if(!listaComenzi.isEmpty()){
        listaComenzi.get(0).executa();
        listaComenzi.remove(0);
    }
    else System.out.println("nu mai exista comenzi de executat");
    }
}
