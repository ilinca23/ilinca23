package factory;

public class Factory {

    public MijlocTransport getMijlocTransport (TipTransport tipTRansport, int nrInmatriculare){
        switch(tipTRansport) {
            case AUTOBUZ :
                return new Autobuz(nrInmatriculare);

            case TRAMVAI:
                return new Autobuz(nrInmatriculare);

            case TROOLEIBUZ:
                return new Autobuz(nrInmatriculare);

            default:
                return null;


        }
    }

}
