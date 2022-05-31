package state;

public class InCursa implements Stare{
    @Override
    public void doAction(Autobuz a) {
        if (a.getStare() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul cu nr "+a.getNrAutobuz()+" poate pleca in cursa fiind la capat de linie");
            a.setStare(new InCursa());
        }
        else System.out.println("nu poate pleca in cursa deoarece nu este la capat de cursa");
    }
}
