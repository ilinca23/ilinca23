package factory;

public class main {

    public static void main (String[] args){
        Factory fabrica= new Factory();
        MijlocTransport autobuz= Factory.getMijlocTransport(TipTRansport.AUTOBUZ, 1234);
        MijlocTransport troleibuz= fabrica.getMijlocTransport(TipTRansport.TROOLEIBUZ, 3456);
        MijlocTransport tramvai= fabrica.getMijlocTransport(TipTRansport.TRAMVAI, 9090);

        System.out.println(autobuz);
        System.out.println(troleibuz);
        System.out.println(tramvai);
    }
}
