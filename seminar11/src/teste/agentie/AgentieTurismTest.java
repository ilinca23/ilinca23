package teste.agentie;

import clase.agentie.AgentieTurism;
import clase.agentie.IPachetTuristic;
import clase.agentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.categorii.ITesteAdaugaPachet;
import teste.categorii.ITesteCalculareSumaTotalaPachete;
import teste.categorii.ITesteCuFakeuri;
import teste.categorii.ITestePoateRezerva;
import teste.dubluri.PachetTuristicDummy;
import teste.dubluri.PachetTuristicFake;
import teste.dubluri.PachetTuristicStub;

import static org.junit.Assert.*;
public class AgentieTurismTest {
    //folosim dummy, nu trebuie sa apelam nimic din pachetul adaugat, daor il folosim

    @Test
    @Category({ITesteAdaugaPachet.class})
    public void testAdaugaPachetTuristic(){
        IPachetTuristic dummy= new PachetTuristicDummy();
        AgentieTurism agentie= new AgentieTurism();
        agentie.adaugaPachet(dummy);
        assertEquals(1, agentie.getNrPachete());
    }

    @Test
    @Category(ITesteCalculareSumaTotalaPachete.class)
    public void testCalculareSumaTotalaPacheteStub(){
        AgentieTurism agentie= new AgentieTurism();
        agentie.adaugaPachet(new PachetTuristicStub());
        agentie.adaugaPachet(new PachetTuristicStub());
        assertEquals(200.0, agentie.calculareSumaTotalaPachete(), 0.1);
    }

    @Test
    @Category({ITesteCuFakeuri.class, ITesteCalculareSumaTotalaPachete.class})
    public void testCalculareSumaTotalaPacheteFake(){
        AgentieTurism agentie= new AgentieTurism();
        PachetTuristicFake pachet= new PachetTuristicFake();
        pachet.setValoareGetPret(100);
        agentie.adaugaPachet(pachet);
        PachetTuristicFake pachet2= new PachetTuristicFake();
        pachet2.setValoareGetPret(60);
        agentie.adaugaPachet(pachet2);
        assertEquals(160.0, agentie.calculareSumaTotalaPachete(), 0.1);
    }




}