package command;

public class Program {
    public static void main(String[] args) {
        Autobuz a1= new Autobuz("autobuz1");
        Autobuz a2= new Autobuz("autobuz2");
        Autobuz a3= new Autobuz("autobuz3");

        Comanda c1= new PleacaInCursa(a1,331);
        ManagerComenzi manager= new ManagerComenzi();

        manager.invoke(c1);
        manager.invoke(new PleacaInCursa(a1, 123));
        manager.invoke(new PleacaInCursa(a2, 223));
        manager.invoke(new PleacaInCursa(a3, 334));
        manager.invoke(new PleacaInCursa(a1, 163));
        manager.invoke(new PleacaInCursa(a2, 556));
        manager.invoke(new PleacaInCursa(a3, 900));

        manager.executaComanda();
        manager.executaComanda();
        manager.executaComanda();
        manager.executaComanda();
        manager.executaComanda();
        manager.executaComanda();
        manager.executaComanda();
        manager.executaComanda();



    }
}
