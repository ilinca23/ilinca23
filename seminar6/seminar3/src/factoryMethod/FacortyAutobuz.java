package factoryMethod;

public class FacortyAutobuz implements FactoryMijlocTransport{

    @Override
    public MijlocTransport getMijlocTransport(int nrInamtriculare) {
        return new Autobuz(nrInamtriculare);
    }
}
