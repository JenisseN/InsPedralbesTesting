package seleniumGlueCode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestHomeAllPestanas extends TestBase {

    //Escenario REPETICION HOME
    @Given ( "^Me encuentro en la pagina home de institutpedralbes$" )
    public void meEncuentroEnLaPaginaHomeDeInstitutpedralbes() throws Exception {
        Assert.assertTrue( homePage.homePageisDisplayed());
    }
    //Repeticion en pestaña estudis
    @When ( "^Hago click sobre la pestaña Estudis$" )
    public void hagoClickSobreLaPestañaEstudis() throws Exception {
        homePage.clickOnTittleEstudis();
    }
    //Repeticion en pestaña projectes
    @When ( "^Despliego la pestaña Projectes$" )
    public void despliegoLaPestañaProjectes()  throws Exception {
        homePage.toMoveMouseOnTittleProjectes();
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
        //pfiPage.pfiPageClose();
    }

    //Escenario 8
    @And ( "^En Estudis hace hago sobre el boton Equip Impulsor ESO$" )
    public void enEstudisHaceHagoSobreElBotonEquipImpulsorESO() throws Exception {
        homePage.clickOnEquipImpulsorESO();
    }
    @Then ( "^Accedo a la pagina externa https://sites\\.google\\.com/inspedralbes\\.cat/equipimpulsor/inici$" )
    public void accedoALaPaginaExternaHttpsSitesGoogleComInspedralbesCatEquipimpulsorInici() throws Exception {
        //  Assert.assertTrue("No se redirecciono correctamente a la pagina Equip Impulsor ESO", externosPage.equipImESOisDisplayed());
    }

    //Escenario 9
    @And ( "^En Projectes hago click sobre el boton Robotica$" )
    public void enProjectesHagoClickSobreElBotonRobotica() throws Exception {
        homePage.clickOnRobotica();
    }
    @Then ( "^Accedo a la pantalla Robotica$" )
    public void accedoALaPantallaRobotica()throws Exception  {
        Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", roboticaPage.roboticaPageisDisplayed());
    }

    //Escenario 10
    @And ( "^En Projectes hago click sobre el boton Qualitat$" )
    public void enProjectesHagoClickSobreElBotonQualitat()throws Exception  {
        homePage.clickOnQualitat();
    }
    @Then ( "^Accedo a la pantalla Qualitat$" )
    public void accedoALaPantallaQualitat() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", quialitatPage.qualitatPageisDisplayed());
    }

    //Escenario 11
    @And ( "^En Projectes hago click sobre el boton Internacional$" )
    public void enProjectesHagoClickSobreElBotonInternacional() throws Exception {
        homePage.clickOnInternacional();
    }
    @Then ( "^Accedo a la pantalla Internacional$" )
    public void accedoALaPantallaInternacional() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", internacionalPage.internacionalPageisDisplayed());
    }

    //Escenario 12
    @And ( "^Despliego la pestaña Internacional y click sobre el boton Movilidad Internacional$" )
    public void despliegoLaPestañaInternacionalYClickSobreElBotonMovilidadInternacional() throws Exception {
        homePage.toMoveMouseOnTitleInternacional();
        homePage.clickOnMobilitatInternacional();
    }

    @Then ( "^Accedo a la pantalla Movilidad Internacional$" )
    public void accedoALaPantallaMovilidadInternacional() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", mobilitatInternacionalPage.movilitatInPageisDisplayed());
    }
    //Escenario 13

    @And ( "^En Projectes hago click sobre el boton InnovaFP$" )
    public void enProjectesHagoClickSobreElBotonInnovaFP() throws Exception {
        homePage.clickOnInnovaFP();
    }
    @Then ( "^Accedo a la pantalla InnovaFP$" )
    public void accedoALaPantallaInnovaFP() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", innovaFPPage.innovaFPPageisDisplayed());
    }

    //Escenario 14
    @And ( "^En Projectes hago click sobre el boton Empreneduria$" )
    public void enProjectesHagoClickSobreElBotonEmpreneduria() throws Exception {
        homePage.clickOnEmpreneduria();
    }
    @Then ( "^Accedo a la pantalla Empreneduria$" )
    public void accedoALaPantallaEmpreneduria() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", empreneduriaPage.empreneduriaPageisDisplayed());
    }

    //Escenario 15
    @And ( "^En Projectes hago click sobre el boton Escola empresa$" )
    public void enProjectesHagoClickSobreElBotonEscolaEmpresa() throws Exception {
        homePage.clickOnEscolaEmpresa();
    }
    @Then ( "^Accedo a la pantalla Escola empresa$" )
    public void accedoALaPantallaEscolaEmpresa() throws Exception{
        Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", escolaEmpresaPage.escolaEmpresaPageisDisplayed());
    }

    //Escenario 16
    @And ( "^En Projectes hago click sobre el boton FP Dual$" )
    public void enProjectesHagoClickSobreElBotonFPDual() throws Exception {
        homePage.clickOnFPDual();
    }
    @Then ( "^Accedo a la pantalla FP Dual$" )
    public void accedoALaPantallaFPDual() throws Exception{
        Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", fpDualPage.fpDualPageisDisplayed());
    }


    @When ( "^Verifico todos los links de la web$" )
    public void verificoTodosLosLinksDeLaWeb() {
        checkLinksObj.chekingLinksPagLinks();
    }

    @Then ( "^Debo listar links rotos y validos$" )
    public void deboListarLinksRotosYValidos() {
        checkLinksObj.brokenLinks();
    }
}
