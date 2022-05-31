package teste.agentie;

import clase.agentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.categorii.ITesteAplicaDiscount;
import teste.categorii.ITesteCuFakeuri;
import teste.categorii.ITestePoateRezerva;
import teste.categorii.TesteBoundry;
import teste.dubluri.PachetTuristicFake;
import teste.dubluri.PersoanaFake;

import static junit.framework.TestCase.*;

public class PachetTuristicTest {
    @Test
    @Category({ITestePoateRezerva.class, ITesteCuFakeuri.class})
    public void testPoateRezervaPersoanaFake1(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setValoareGetVarsta(20);
        PachetTuristic pachet= new PachetTuristic(persoanaFake, "bucuresti", 100.0);
        assertTrue(pachet.poateRezerva());
    }

    @Test
    @Category({ITestePoateRezerva.class, ITesteCuFakeuri.class})
    public void testPoateRezervaPersoanaFake2(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setValoareGetVarsta(16);
        PachetTuristic pachet= new PachetTuristic(persoanaFake, "bucuresti", 100.0);
        assertFalse(pachet.poateRezerva());
    }

    @Test
    @Category({ITesteCuFakeuri.class, ITestePoateRezerva.class, TesteBoundry.class})
    public void testBoundryPoateRezerva(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setValoareGetVarsta(18);
        PachetTuristic pachet= new PachetTuristic(persoanaFake, "arad", 90.2);
        assertTrue(pachet.poateRezerva());
    }

    @Test
    @Category({ITesteCuFakeuri.class})
    public void testRightAplicaDiscount(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setValoareGetVarsta(80);
        PachetTuristic pachet= new PachetTuristic(persoanaFake, "Cluj", 100.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(90.0, pachet.getPret(), 0.1);
    }

    @Test
    @Category({ITesteCuFakeuri.class, ITesteAplicaDiscount.class})
    public void testRightAplicaDiscountTanar(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setValoareGetVarsta(35);
        PachetTuristic pachet= new PachetTuristic(persoanaFake, "Cluj", 100.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(100.0, pachet.getPret(), 0.1);
    }
}
