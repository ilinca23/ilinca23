package command;

public class Autobuz {
    private String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pleacaInCursa(int i) {
        System.out.println("Autobuzul "+model+" a plecat in cursa pe linia "+i);
    }
}
