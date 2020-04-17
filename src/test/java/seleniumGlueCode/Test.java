package seleniumGlueCode;

import chekingLinnks.ChekingLinksPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class Test extends TestBase{

    private WebDriver driver= Hooks.getDriver();


    //Escenario REPETICION HOME
    @Given ("^El usuario se encuenta en la pagina home de institutpedralbes$")
    public void el_usuario_se_encuenta_en_la_pagina_home_de_institutpedralbes() throws Throwable {
        Assert.assertTrue(homePage.homePageisDisplayed());
    }
    @When ("^Hace click sobre la pestaña Estudis$")
    public void hace_click_sobre_la_pestaña_Estudis() throws Throwable {
        homePage.clickOnTittleEstudis();
    }

    //Escenario 1
    @When("^En Estudis hace click sobre el boton Introduccio cicles$")
    public void en_Estudis_hace_click_sobre_el_boton_Introduccio_cicles() throws Throwable {
        homePage.clickOnIntroCicles();
    }
    @Then ("^Se debe redirigir a la pantalla Introduccio Cicles$")
    public void se_debe_redirigir_a_la_pantalla_Introduccio_Cicles() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a la pagina Introduccio de cicles", introduccioCiclesPage.introCiclesisDisplayed());
    }

    //Escenario 2
    @When("^En Estudis hace click sobre el boton DAM Desemvolupament d'aplicaciones multiplataforma$")
    public void en_Estudis_hace_click_sobre_el_boton_DAM() throws Throwable {
        homePage.clickOnDAM();
    }
    @Then ("^Se debe redirigir a la pantalla DAM$")
    public void se_debe_redirigir_a_la_pantalla_DAM() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a la pagina DAM", damPage.damPageisDisplayed());
    }

    //Escenario 3
    @When("^En Estudis hace click sobre el boton DAW Desemvolupament d'aplicaciones web$")
    public void en_Estudis_hace_click_sobre_el_boton_DAW() throws Throwable {
        homePage.clickOnDAW();
    }
    @Then ("^Se debe redirigir a la pantalla DAW$")
    public void se_debe_redirigir_a_la_pantalla_DAW() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a la pagina DAW", dawPage.dawPageisDisplayed());
    }

    //Escenario 4
    @When("^En Estudis hace click sobre el boton SMIX Sistemes microinformatics y xarxes$")
    public void en_Estudis_hace_click_sobre_el_boton_SMIX() throws Throwable {
        homePage.clickOnSMX();
    }
    @Then ("^Se debe redirigir a la pantalla SMIX$")
    public void se_debe_redirigir_a_la_pantalla_SMIX() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a la pagina SMIX", smixPage.smixPageisDisplayed());
    }
    //Escenario 5
    @When("^En Estudis hace click sobre el boton DAM Videojocs$")
    public void en_Estudis_hace_click_sobre_el_boton_DAMVideojocs() throws Throwable {
        homePage.clickOnDAMVideoJoc();
    }
    @Then ("^Se debe redirigir a la pantalla DAM Videojocs$")
    public void se_debe_redirigir_a_la_pantalla_DAMVideojocs() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a la pagina SMIX", damVideoJocPage.damVideoJocsPageisDisplayed());
    }
    //Escenario 6
    @When("^En Estudis hace click sobre el boton ASIX Ciberseguretat$")
    public void en_Estudis_hace_click_sobre_el_boton_ASIXCiberseguretat() throws Throwable {
        homePage.clickOnASIXCiberseguridad();
    }
    @Then ("^Se debe redirigir a la pantalla ASIX Ciberseguretat$")
    public void se_debe_redirigir_a_la_pantalla_ASIXCiberseguretat() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a la pagina ASIX Ciberseguretat", asixCiberseguretatPage.asixCiberseguretataisDisplayed());
    }



}
