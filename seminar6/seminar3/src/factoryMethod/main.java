package factoryMethod;

public class main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new FacortyAutobuz().getMijlocTransport(1212);
        MijlocTransport tramvai = new FactoryTramvai().getMijlocTransport(23232);
        MijlocTransport troleibuz = new FactoryTroleiubuz().getMijlocTransport(4545);

        System.out.println(autobuz);
        System.out.println(tramvai);
        System.out.println(troleibuz);
    }
}
