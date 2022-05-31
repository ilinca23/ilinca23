package decorator;

public class mainDecorator {
    public static void main(String[] args) {
        IImprimanta imprimanta= new ImprimantaDeBilete(5);
        imprimanta.printeaza();
        DecoratorAbstract decorator= new Decorator("pastem fericiti", imprimanta);
        decorator.printeaza();
        decorator.printeazaVerso();
    }
}
