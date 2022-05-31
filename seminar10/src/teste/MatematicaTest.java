package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import java.util.AbstractMap;
import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica mate;

    @Before
    public void setUp(){
        mate= Matematica.getInstance();
        //System.out.println("apelat");
    }

    @Test
    public void testSumaCorecta(){
        int rezultat= mate.suma(7,5);
        assertEquals(12, rezultat);
    }

    @Test
    public void testRaport(){
        double rezultat= mate.raport(24,6);
        assertEquals(4, rezultat, 0.001);
    }

    @Test
    public void testRaport2(){
        double rezultat= mate.raport(25,8);
        assertEquals(3.125, rezultat, 0.001);
    }

    @Test
    public void testRaport3(){
        double rezultat= mate.raport(-25,8);
        assertEquals(-3.125, rezultat, 0.001);
    }

    @Test
    public void testRaport4(){
        double rezultat= mate.raport(12,12);
        assertEquals(1, rezultat, 0.001);
    }


    @Test
    public void testRaportShouldThrowException(){
        try{
            mate.raport(10, 0);
            fail("nu treuia sa ajunga aici");
        }catch(IllegalArgumentException err){

        }
    }
    @Test (expected = IllegalArgumentException.class)
    public void TestRaportShouldThrowException2(){
        mate.raport(10,0);

    }

    @Test
    public void testParitate(){
        boolean rezultat= mate.estePar(12);
        assertTrue(rezultat);
        assertFalse(mate.estePar(5));
    }

    @Test
    public void TestListaNumerePare(){
        List rezultat=mate.nNumerePare(5);
        assertEquals(4, mate.nNumerePare(4).size());
        assertEquals(5, mate.nNumerePare(5).size());
    }

    @Test
    public void TestListaNumerePare2(){
       assertNull(mate.nNumerePare(0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestListaNumerePareShouldThrowException(){
        mate.nNumerePare(-12);
    }

    @Test
    public void TestSingleToneMatematica(){
        Matematica matematica2= Matematica.getInstance();
        assertSame(matematica2, mate);
    }

}