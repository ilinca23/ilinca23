package clase;

import clase.interfete.IReader;
import clase.readers.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;

        try {
            IReader reader = new AngajatReader("angajati.txt");
            listaAngajati = reader.readAplicanti();
            Aplicant.setPragPunctaj(80);
            for (Aplicant angajat : listaAngajati) {
                System.out.println(angajat.toString());
                angajat.afisareRezultat();
                angajat.afisareSumaBani(2000);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
