package factory;

public class Factory {

    public static MijlocTransport getMijlocTransport (TipTRansport tipTRansport, int nrInmatriculare){
        switch(tipTRansport) {
            case AUTOBUZ :
                return new Autobuz(nrInmatriculare);

            case TRAMVAI:
                return new Tramvai(nrInmatriculare);

            case TROOLEIBUZ:
                return new Troleibuz(nrInmatriculare);

            default:
                return null;


        }
    }

}
