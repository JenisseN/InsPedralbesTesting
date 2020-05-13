package seleniumGlueCode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestFormulario extends TestBase{

    int maximCHAR30 =30;
    int maximCHAR500 =500;


    //Background
    @When ( "^Hago click sobre la pestaña On Som$" )
    public void hagoClickSobreLaPestañaOnSom() throws Exception {
        homePage.clickOnOnSom();
    }

    //Escenario 1
    @And ( "^En On Som hago click sobre el boton ENVIAR$" )
    public void enOnSomHagoClickSobreElBotonENVIAR() throws Exception {
        Assert.assertTrue( onSomPage.onSomisDisplayed() );
        onSomPage.clickSendButton();
    }
    @Then ( "^Aparece mensaje \"([^\"]*)\" debajo de todos los campos y \"([^\"]*)\"\\.$" )
    public void apareceMensajeDebajoDeTodosLosCamposY(String msg1, String msg2) throws Throwable {
        Assert.assertTrue( onSomPage.msgCampRequiredisDisplayed( msg1 ));
        Assert.assertTrue( onSomPage.msgCheckCampsisDisplayed( msg2 ));
    }

    //Escenario 2
    @Then ( "^Introduzco el siguiente texto en el campo El teu Nom: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoElTeuNom(String name) throws Exception {
        onSomPage.writeInCampName(name);
    }
    @And ( "^Introduzco el siguiente texto en el campo Correu: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoCorreu(String email) throws Throwable {
        onSomPage.writeInCampEmail(email);
    }
    @Then ( "^Introduzco el siguiente texto en el campo Assumpte: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoAssumpte(String topic) throws Throwable {
        onSomPage.writeInCampAssumpte(topic);
    }
    @And ( "^Introduzco el siguiente texto en el campo Missatge: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoMissatge(String message) throws Throwable {
        onSomPage.writeInCampMessage(message);
    }
    @Then ( "^Leo los campos para contar los caracteres introducidos Debe haber treinta caracteres, en el campo Nom, Correu, Assumpte y quinientas caracteres en el campo Missatge\\.$" )
    public void leoLosCamposParaContarLosCaracteresIntroducidosDebeHaberTreintaCaracteresEnElCampoNomCorreuAssumpteYQuinientasCaracteresEnElCampoMissatge() throws Exception {
        Assert.assertEquals ( maximCHAR30 , onSomPage.readCampName().length());
        Assert.assertEquals ( maximCHAR30 , onSomPage.readCampEmail().length());
        Assert.assertEquals ( maximCHAR30 , onSomPage.readCampAssumpte().length());
        Assert.assertEquals ( maximCHAR500 , onSomPage.readCampMessage().length());
    }


    //Escenario 3
    @When ( "^Hago click sobre el boton ENVIAR$" )
    public void hagoClickSobreElBotonENVIAR() throws Exception {
        onSomPage.clickSendButton();
    }
    @Then ( "^Debe aparecer el siguiente mensaje: \"([^\"]*)\" y \"([^\"]*)\"$" )
    public void debeAparecerElSiguienteMensajeY(String msg1, String msg2) throws Throwable {
        Assert.assertTrue( onSomPage.msgEmailErrordisDisplayed(msg1) );
        Assert.assertTrue( onSomPage.msgCheckCampsisDisplayed(msg2) );
    }


    //Escenario 4
    @Then ( "^Debe aparecer el siguiente mensaje \"([^\"]*)\" \\.$" )
    public void debeAparecerElSiguienteMensaje(String msg) throws Throwable {
        Assert.assertTrue( onSomPage.msgSendSuccesfulyisDisplayed(msg) );
    }
}
