package chainOfResponsability;

public class mainChain {
    public static void main(String[] args) {
        AutobuzHandler autobuzHandler= new AutobuzHandler(3);
        TramvaiHandler tramvaiHandler= new TramvaiHandler(5);
        MetrouHandler metrouHandler= new MetrouHandler(150); //veriga finala
        autobuzHandler.setNextHandler(tramvaiHandler);
        tramvaiHandler.setNextHandler(metrouHandler);

        autobuzHandler.afiseazaRecomandare(2);
        autobuzHandler.afiseazaRecomandare(4);
        autobuzHandler.afiseazaRecomandare(8);
    }
}
