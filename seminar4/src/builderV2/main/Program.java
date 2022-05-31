package builderV2.main;

import builderV2.Autobuz;
import builderV2.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder builder= new AutobuzBuilder();

        builder.setOraIncepereProgram(5).setNumeSofer("Dorel").setLinie(10);
        Autobuz autobuz1= builder.build();
        System.out.println(autobuz1.toString());

        builder.setNumeSofer("Giani"). setTextDerulat("eu <3 bere"). setPauzaSofer(true);
        Autobuz autobuz2= builder.build();
        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
    }
}
