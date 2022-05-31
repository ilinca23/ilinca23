package adapterObiecte.main;

import adapterObiecte.adapterClase.AdapterMetrouClasa;
import adapterObiecte.validator.Validator;
import adapterObiecte.validator.ValidatorAutobuz;
import adapterObiecte.validator.ValidatorSubteranAdapter;
import adapterObiecte.validatorulMeu.ValidatorMetrou;

public class Program {
    public static void valideazaBilet(Validator validator){
        validator.v_bilet();
    }
    public static void valideazaAbonament(Validator validator){
        validator.validareAbonament();
    }
    
    public static void main(String[] args) {

        ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);

        ValidatorMetrou validatorMetrou= new ValidatorMetrou();
        ValidatorSubteranAdapter validatorSubteranAdapter= new ValidatorSubteranAdapter(validatorMetrou);
        valideazaAbonament(validatorSubteranAdapter);
        AdapterMetrouClasa adapterMetrouClasa =  new AdapterMetrouClasa();
        valideazaAbonament(adapterMetrouClasa);
    }
    
}
