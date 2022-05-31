package clase.readers;

import clase.Aplicant;
import clase.Elev;
import clase.interfete.IReader;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class EleviReader extends IReader {

    public EleviReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti()  {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (super.scanner.hasNext()) {
            Elev elev = new Elev();
            super.citireAplicant(scanner, elev);

            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);

            elevi.add(elev);
        }

        scanner.close();
        return elevi;
    }
}
