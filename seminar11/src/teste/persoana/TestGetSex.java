package teste.persoana;

import clase.persoana.Persoana;
import org.junit.Test;
import teste.persoana.CNPIncorect;

import static org.junit.Assert.*;

public class TestGetSex {

    @Test
    public void testRightSex(){
        Persoana persoana = new Persoana("Ion", "3001212123123");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testRightSex2(){
        Persoana persoana = new Persoana("Ion", "2001212123123");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testBoundryInferiorSex(){
        Persoana persoana = new Persoana("Ion", "1991212123123");
        assertEquals("M", persoana.getSex());
        //assertTrue("M" == persoana.getSex());
        
    }

    @Test
    public void testBoundrySuperiorSex(){
        Persoana persoana = new Persoana("Ion", "6051212123123");
        assertEquals("F", persoana.getSex());
    }

    //invers chestie nu putem face

    @Test
    public void testCrossCheck(){
        Persoana persoana = new Persoana("Ion", "5051212123123");
        String expected;
        if(Integer.parseInt(String.valueOf(persoana.CNP.charAt(0)))%2==0){
            expected="F";
        }
        else
            expected="M";
        assertEquals(expected, persoana.getSex());

    }

    @Test (expected = CNPIncorect.class)
    public void testErrorCheck(){
        Persoana persoana = new Persoana("Ion", "0051212123123");
        persoana.getSex();
    }

    @Test (timeout = 100)
    public void testPerformanceGetSex(){
        Persoana persoana = new Persoana("Ion", "5051212123123");
        persoana.getSex();
    }

    //de aici incepe CORRECT
    @Test
    public void testFormatSex(){
        Persoana persoana = new Persoana("Ion", "5051212123123");
        assertEquals(1, persoana.getSex().length());
    }
    //range

    //reference
    //apeleaza charAt in interiorul metodei dar este deja verificata

    //existance
    @Test (expected = NullPointerException.class)
    public void testExistanceSex(){
        Persoana persoana = new Persoana("Ion", null);
        persoana.getSex();
    }






}