package teste.persoana;

import clase.persoana.Persoana;
import org.junit.Test;
import teste.persoana.CNPIncorect;

import static org.junit.Assert.*;

public class testGetVarsta {

    @Test
    public void testRightGetVarsta(){
        Persoana persoana = new Persoana("John", "5000924123123");
        assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void testBoundryInferiorGetVarsta() {
        Persoana persoana = new Persoana("John", "3000924123123");
        assertEquals(221, persoana.getVarsta());
    }
    @Test
    public void testBoundrySuperiorGetVarsta() {
        Persoana persoana = new Persoana("John", "5220324123123");
        assertEquals(0, persoana.getVarsta());
    }

    //cross check nu avem cum
    @Test (expected = CNPIncorect.class)
    public void testErrorCheckGetVarsta(){
        Persoana persoana = new Persoana("John", "5230324123123");
        persoana.getVarsta();
    }

    //performace
    @Test(timeout = 100)
    public void testPerformanceGetVarsta(){
        Persoana persoana = new Persoana("John", "5210324123123");
        persoana.getVarsta();
    }

    //CORRECT
    //
    @Test
    public void testOrderGetVarsta(){
        Persoana persoana = new Persoana("John", "5000324123123");
        Persoana persoana2 = new Persoana("Jhnut", "1990324123123");
        assertTrue(persoana.getVarsta()<persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testExistanceGetVarsta(){
        Persoana persoana = new Persoana("John", null);
        persoana.getVarsta();

    }




}
