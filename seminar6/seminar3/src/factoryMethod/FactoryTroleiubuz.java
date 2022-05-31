package factoryMethod;

public class FactoryTroleiubuz implements FactoryMijlocTransport{
    @Override
    public MijlocTransport getMijlocTransport(int nrInamtriculare) {
        return new Troleibuz(nrInamtriculare);
    }
}
