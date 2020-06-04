package seleniumGlueCode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestEstudis extends TestBase {

    //Escenario Outup... Se repite en cada prueba
    @Given ( "^Me encuentro en la pagina home de institutpedralbes$" )
    public void meEncuentroEnLaPaginaHomeDeInstitutpedralbes() throws Exception {
        Assert.assertTrue( homePage.homePageisDisplayed());
    }

    //Escenario Outup... Se repite en cada prueba
    @When ( "^Despliego la pestaña Estudis$" )
    public void despliegoLaPestañaEstudis() throws Exception {
        homePage.clickOnTittleEstudis();
    }


    //Escenario 1
    @And ( "^En Estudis hago click sobre el boton Introduccio cicles$" )
    public void enEstudisHagoClickSobreElBotonIntroduccioCicles() throws Exception {
        homePage.clickOnIntroCicles();
    }

    @Then ( "^Accedo a la pantalla Introduccio Cicles$" )
    public void accedoALaPantallaIntroduccioCicles() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina Introduccio de cicles", introduccioCiclesPage.introCiclesisDisplayed());
    }

    //Escenario 2
    @And ( "^En Estudis hago click sobre el boton DAM Desemvolupament d'aplicaciones multiplataforma$" )
    public void enEstudisHagoClickSobreElBotonDAMDesemvolupamentDAplicacionesMultiplataforma() throws Exception {
        homePage.clickOnDAM();
    }

    @Then ( "^Accedo a la pantalla DAM$" )
    public void accedoALaPantallaDAM() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina DAM", damPage.damPageisDisplayed());
    }

    //Escenario 3
    @And ( "^En Estudis hago click sobre el boton DAW Desemvolupament d'aplicaciones web$" )
    public void enEstudisHagoClickSobreElBotonDAWDesemvolupamentDAplicacionesWeb() throws Exception {
        homePage.clickOnDAW();
    }

    @Then ( "^Accedo a la pantalla DAW$" )
    public void accedoALaPantallaDAW() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina DAW", dawPage.dawPageisDisplayed());
    }

    //Escenario 4
    @And ( "^En Estudis hago click sobre el boton SMIX Sistemes microinformatics y xarxes$" )
    public void enEstudisHagoClickSobreElBotonSMIXSistemesMicroinformaticsYXarxes() throws Exception {
        homePage.clickOnSMX();
    }
    @Then ( "^Accedo a la pantalla SMIX$" )
    public void accedoALaPantallaSMIX() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina SMIX", smixPage.smixPageisDisplayed());
    }

    //Escenario 5
    @And ( "^En Estudis hago click sobre el boton DAM Videojocs$" )
    public void enEstudisHagoClickSobreElBotonDAMVideojocs() throws Exception {
        homePage.clickOnDAMVideoJoc();
    }
    @Then ( "^Accedo a la pantalla DAM Videojocs$" )
    public void accedoALaPantallaDAMVideojocs() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina SMIX", damVideoJocPage.damVideoJocsPageisDisplayed());
    }

    //Escenario 6
    @And ( "^En Estudis hago click sobre el boton ASIX Ciberseguretat$" )
    public void enEstudisHagoClickSobreElBotonASIXCiberseguretat() throws Exception {
        homePage.clickOnASIXCiberseguridad();
    }
    @Then ( "^Accedo a la pantalla ASIX Ciberseguretat$" )
    public void accedoALaPantallaASIXCiberseguretat() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina ASIX Ciberseguretat", asixCiberseguretatPage.asixCiberseguretataisDisplayed());
    }

    //Escenario 7
    @And ( "^En Estudis hago click sobre el boton PFI$" )
    public void enEstudisHagoClickSobreElBotonPFI() throws Exception {
        homePage.clickOnPFI();
    }
    @Then ( "^Accedo a la pantalla PFI$" )
    public void accedoALaPantallaPFI() throws Exception {
        Assert.assertTrue(pfiPage.pfiPageisDisplayed());

    }

    //Escenario 8
    @And ( "^En Estudis hace hago sobre el boton Equip Impulsor ESO$" )
    public void enEstudisHaceHagoSobreElBotonEquipImpulsorESO() throws Exception {
        homePage.clickOnEquipImpulsorESO();
    }
    @Then ( "^Accedo a la pagina externa https://sites\\.google\\.com/inspedralbes\\.cat/equipimpulsor/inici$" )
    public void accedoALaPaginaExternaHttpsSitesGoogleComInspedralbesCatEquipimpulsorInici() throws Exception {
          Assert.assertTrue("No se redirecciono correctamente a la pagina Equip Impulsor ESO", equipImpulsorPage.equipImpulsorPageisDisplayed());
    }



}
