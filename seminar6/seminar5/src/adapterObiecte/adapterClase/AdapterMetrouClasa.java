package adapterObiecte.adapterClase;

import adapterObiecte.validator.Validator;
import adapterObiecte.validatorulMeu.ValidatorMetrou;

public class AdapterMetrouClasa extends ValidatorMetrou implements Validator {
    @Override
    public void v_bilet() {
        super.validareCalatorie();
    }
}
