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
        Assert.assertTrue(homePage.homePageisDisplayed());
    }

    @When ( "^Hago click sobre la pestaña Estudis$" )
    public void hagoClickSobreLaPestañaEstudis() throws Exception {
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
        Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", pfiPage.pfiPageisDisplayed());
    }

    //Escenario 8
    @And ( "^En Estudis hace hago sobre el boton Equip Impulsor ESO$" )
    public void enEstudisHaceHagoSobreElBotonEquipImpulsorESO() throws Exception {
        homePage.clickOnEquipImpulsorESO();
    }

    @Then ( "^Accedo a la pagina externa https://sites\\.google\\.com/inspedralbes\\.cat/equipimpulsor/inici$" )
    public void accedoALaPaginaExternaHttpsSitesGoogleComInspedralbesCatEquipimpulsorInici() {
        //  Assert.assertTrue("No se redirecciono correctamente a la pagina Equip Impulsor ESO", externosPage.equipImESOisDisplayed());
    }

    //Escenario 9
    @When ( "^Hago click sobre la pestaña Projectes$" )
    public void hagoClickSobreLaPestañaProjectes() {
        homePage.clickOnTittleProjectes();
    }

    @And ( "^En Projectes hago click sobre el boton Robotica$" )
    public void enProjectesHagoClickSobreElBotonRobotica() {
        homePage.clickOnRobotica();
    }

    //Escenario 10
    @Then ( "^Accedo a la pantalla Robotica$" )
    public void accedoALaPantallaRobotica() {
        //Assert.assertTrue("No se redirecciono correctamente a la pagina PFI", pfiPage.pfiPageisDisplayed());
    }

    @And ( "^En Projectes hago click sobre el boton Qualitat$" )
    public void enProjectesHagoClickSobreElBotonQualitat() {
        homePage.clickOnQualitat();
    }

    //Escenario 11
    @Then ( "^Accedo a la pantalla Qualitat$" )
    public void accedoALaPantallaQualitat() {
    }

    @And ( "^En Projectes hago click sobre el boton Internacional$" )
    public void enProjectesHagoClickSobreElBotonInternacional() {
        homePage.clickOnInternacional();
    }

    //Escenario 12
    @Then ( "^Accedo a la pantalla Internacional$" )
    public void accedoALaPantallaInternacional() {
    }

    @And ( "^En Projectes hago click sobre el boton Internacional y click sobre el boton Movilidad Internacional$" )
    public void enProjectesHagoClickSobreElBotonInternacionalYClickSobreElBotonMovilidadInternacional() {
        homePage.clickOnQMobilitatInteracional();

    }

    //Escenario 13
    @Then ( "^Accedo a la pantalla Movilidad Internacional$" )
    public void accedoALaPantallaMovilidadInternacional() {
    }

    @And ( "^En Projectes hago click sobre el boton InnovaFP$" )
    public void enProjectesHagoClickSobreElBotonInnovaFP() {
        homePage.clickOnInnovaFP();
    }

    //Escenario 14
    @Then ( "^Accedo a la pantalla InnovaFP$" )
    public void accedoALaPantallaInnovaFP() {
    }

    @And ( "^En Projectes hago click sobre el boton Empreneduria$" )
    public void enProjectesHagoClickSobreElBotonEmpreneduria() {
        homePage.clickOnEmpreneduria();
    }

    //Escenario 15
    @Then ( "^Accedo a la pantalla Empreneduria$" )
    public void accedoALaPantallaEmpreneduria() {
    }

    @When ( "^Hago click sobre la pestaña Escola empresa$" )
    public void hagoClickSobreLaPestañaEscolaEmpresa() {
        homePage.clickOnQualitat();
    }

    //Escenario 16
    @And ( "^En Projectes hago click sobre el boton Escola empresa$" )
    public void enProjectesHagoClickSobreElBotonEscolaEmpresa() {
        homePage.clickOnEscolaEmpresa();
    }

    @Then ( "^Accedo a la pantalla Escola empresa$" )
    public void accedoALaPantallaEscolaEmpresa() {
    }

    //Escenario 17

    @And ( "^En Projectes hago click sobre el boton FP Dual$" )
    public void enProjectesHagoClickSobreElBotonFPDual() {
        homePage.clickOnFPDual();
    }

    @Then ( "^Accedo a la pantalla FP Dual$" )
    public void accedoALaPantallaFPDual() {
    }
}
