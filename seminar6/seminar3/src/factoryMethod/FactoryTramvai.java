package factoryMethod;

import factoryMethod.Tramvai;

public class FactoryTramvai implements FactoryMijlocTransport{
    @Override
    public MijlocTransport getMijlocTransport(int nrInamtriculare) {
        return new Tramvai(nrInamtriculare);
    }
}
