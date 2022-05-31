package template;

public class mainTempleate {
    public static void main(String[] args) {
        MijlocTrasnportPeSine tramvai1 = new Tramvai("B1");
        MijlocTrasnportPeSine tramvai2 = new Tramvai("B2");

        tramvai1.parcurgeTraseul();
        System.out.println("******************");
        tramvai1.parcurgeTraseuInvers();

    }
}
