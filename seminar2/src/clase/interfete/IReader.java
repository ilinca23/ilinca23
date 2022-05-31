package clase.interfete;

import clase.Aplicant;
import clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class IReader {

    protected Scanner scanner;

    public IReader(String numeFisier) throws FileNotFoundException {
        this.scanner = new Scanner( new File(numeFisier));
    }

    public abstract List<Aplicant> readAplicanti() ;

    public void citireAplicant(Scanner input, Aplicant aplicant){
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nrProiecte = input.nextInt();
        String[] vect = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++) {
            vect[i] = input.next();
        }
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nrProiecte, vect);


    }

}
