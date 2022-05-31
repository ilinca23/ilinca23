package state;

public class LaCapatDeLinie implements Stare {

    @Override
    public void doAction(Autobuz a) {
        if(!(a.getStare() instanceof LaCapatDeLinie) ){
        System.out.println("Autobuzul cu nr "+a.getNrAutobuz()+" este la capat de linie ");
        a.setStare(new LaCapatDeLinie());}
        else System.out.println("este deja la capat de linie");
    }

}
