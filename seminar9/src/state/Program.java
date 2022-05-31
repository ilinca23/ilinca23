package state;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz= new Autobuz(101);

        autobuz.intraInService();
        autobuz.ajungeLaCapat();
        autobuz.pleacaInCursa();
        autobuz.intraInService();
        autobuz.ajungeLaCapat();
    }
}
