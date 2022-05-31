package clase.readers;

import clase.Angajat;
import clase.Aplicant;
import clase.interfete.IReader;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class AngajatReader extends IReader {
    public AngajatReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti()  {

        super.scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajat= new Angajat();
            super.citireAplicant(scanner, angajat);

            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
