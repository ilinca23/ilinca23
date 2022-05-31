package memento;

public class Program {
    public static void main(String[] args) {
        ManagerMemento manager= new ManagerMemento();
        Autobuz autobuz= new Autobuz("Dorel", 14, "actros", 2006);
        manager.salveazaMemento(autobuz.creeazaMemento());
        System.out.println(autobuz.toString());

        autobuz.setConsumMediu(15);
        autobuz.setNumeSofer("Giani");
        manager.salveazaMemento(autobuz.creeazaMemento());
        System.out.println(autobuz.toString());

        autobuz.restaureazaAutobuz(manager.returneazaMementobyIndex(0));
        System.out.println(autobuz.toString());



    }
}
