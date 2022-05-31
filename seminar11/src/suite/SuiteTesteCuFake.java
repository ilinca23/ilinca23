package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.agentie.AgentieTurismTest;
import teste.agentie.PachetTuristicTest;
import teste.categorii.ITesteCuFakeuri;
import teste.categorii.ITestePoateRezerva;
import teste.categorii.TesteBoundry;

@RunWith(Categories.class)
@Categories.IncludeCategory(ITesteCuFakeuri.class)
@Categories.ExcludeCategory({TesteBoundry.class, ITestePoateRezerva.class})
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
public class SuiteTesteCuFake {


}
