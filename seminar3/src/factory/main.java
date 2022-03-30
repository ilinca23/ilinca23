package factory;

public class main {

    public static void main (String[] args){
        Factory fabrica= new Factory();
        MijlocTransport autobuz= fabrica.getMijlocTransport(TipTransport.AUTOBUZ, 1234);
        MijlocTransport troleibuz= fabrica.getMijlocTransport(TipTransport.TROOLEIBUZ, 3456);
        MijlocTransport tramvai= fabrica.getMijlocTransport(TipTransport.TRAMVAI, 9090);

        System.out.println(autobuz);
        System.out.println(troleibuz);
        System.out.println(tramvai);
    }
}
