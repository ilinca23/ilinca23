package state;

public class LaReparat implements Stare{
    @Override
    public void doAction(Autobuz a) {
        if(a.getStare() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul cu nr "+a.getNrAutobuz()+" intra in service pentru ca este la capat de linie");
            a.setStare(new LaReparat());
        }
        else System.out.println("nu poate fi trimis la reparat pentru ca nu este la capat de linie");
    }
}
