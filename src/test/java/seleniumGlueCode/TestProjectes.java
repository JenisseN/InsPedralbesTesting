package seleniumGlueCode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestProjectes extends TestBase {

    @Given ( "^Me encuentro en la pagina home del institutpedralbes$" )
    public void meEncuentroEnLaPaginaHomeDelInstitutpedralbes() throws Exception {
        Assert.assertTrue(homePage.homePageisDisplayed());
    }

    @When ( "^Despliego la pestaña Projectes$" )
    public void despliegoLaPestañaProjectes() throws Exception {
        homePage.toMoveMouseOnTittleProjectes();
    }

    @And ( "^En Projectes hago click sobre el boton Robotica$" )
    public void enProjectesHagoClickSobreElBotonRobotica() throws Exception {
        homePage.clickOnRobotica();
    }

    @Then ( "^Accedo a la pantalla Robotica$" )
    public void accedoALaPantallaRobotica() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina Robotica", roboticaPage.roboticaPageisDisplayed());
    }

    @And ( "^En Projectes hago click sobre el boton Qualitat$" )
    public void enProjectesHagoClickSobreElBotonQualitat() throws Exception {
        homePage.clickOnQualitat();
    }

    @Then ( "^Accedo a la pantalla Qualitat$" )
    public void accedoALaPantallaQualitat() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina Qualitat", quialitatPage.qualitatPageisDisplayed());
    }

    @And ( "^En Projectes hago click sobre el boton Internacional$" )
    public void enProjectesHagoClickSobreElBotonInternacional() throws Exception {
        homePage.clickOnInternacional();
    }

    @Then ( "^Accedo a la pantalla Internacional$" )
    public void accedoALaPantallaInternacional() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina Internacional", internacionalPage.internacionalPageisDisplayed());
    }


    @And ( "^Despliego la pestaña Internacional y click sobre el boton Movilidad Internacional$" )
    public void despliegoLaPestañaInternacionalYClickSobreElBotonMovilidadInternacional() throws Exception {
        homePage.toMoveMouseOnTitleInternacional();
        homePage.clickOnMobilitatInternacional();
    }

    @Then ( "^Accedo a la pantalla Movilidad Internacional$" )
    public void accedoALaPantallaMovilidadInternacional() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina Movilitat Internacional", mobilitatInternacionalPage.movilitatInPageisDisplayed());
    }


    @And ( "^En Projectes hago click sobre el boton InnovaFP$" )
    public void enProjectesHagoClickSobreElBotonInnovaFP() throws Exception {
        homePage.clickOnInnovaFP();
    }

    @Then ( "^Accedo a la pantalla InnovaFP$" )
    public void accedoALaPantallaInnovaFP() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina Innova FP", innovaFPPage.innovaFPPageisDisplayed());
    }


    @And ( "^En Projectes hago click sobre el boton Empreneduria$" )
    public void enProjectesHagoClickSobreElBotonEmpreneduria() throws Exception {
        homePage.clickOnEmpreneduria();
    }

    @Then ( "^Accedo a la pantalla Empreneduria$" )
    public void accedoALaPantallaEmpreneduria() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina Emprenedoria", empreneduriaPage.empreneduriaPageisDisplayed());
    }


    @And ( "^En Projectes hago click sobre el boton Escola empresa$" )
    public void enProjectesHagoClickSobreElBotonEscolaEmpresa() throws Exception {
        homePage.clickOnEscolaEmpresa();
    }

    @Then ( "^Accedo a la pantalla Escola empresa$" )
    public void accedoALaPantallaEscolaEmpresa() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina Escola Empresa", escolaEmpresaPage.escolaEmpresaPageisDisplayed());
    }


    @And ( "^En Projectes hago click sobre el boton FP Dual$" )
    public void enProjectesHagoClickSobreElBotonFPDual() throws Exception {
        homePage.clickOnFPDual();
    }

    @Then ( "^Accedo a la pantalla FP Dual$" )
    public void accedoALaPantallaFPDual() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina FP Dual", fpDualPage.fpDualPageisDisplayed());
    }

}
