package seleniumGlueCode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestFormularioContacto extends TestBase{

    //Background
    @When ( "^Hago click sobre la pestaña On Som y deslizar hacia abajo$" )
    public void hagoClickSobreLaPestañaOnSomydeslizarhaciaabajo() throws Exception {
        homePage.clickOnOnSom();
        Assert.assertTrue( onSomPage.onSomisDisplayed() );
        onSomPage.downOnOnSom();
    }


    @And ( "^Hago click sobre el boton ENVIAR$" )
    public void hagoClickSobreElBotonENVIAR() throws Exception {
        onSomPage.clickSendButton();
    }

    @Then ( "^Deben aparecer los siguientes mensajes \"([^\"]*)\" y \"([^\"]*)\"$" )
    public void debenAparecerLosSiguientesMensajesY(String msg1, String msg2) throws Throwable {
        Assert.assertTrue( onSomPage.msgCampRequiredisDisplayed( msg1 ));
        Assert.assertTrue( onSomPage.msgCheckCampsisDisplayed( msg2 ));
    }

    @And ( "^Introduzco el siguiente texto en el campo El teu Nom: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoElTeuNom(String name) throws Throwable {
        onSomPage.writeInCampName(name);
    }

    @And ( "^Introduzco el siguiente texto en el campo Correu: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoCorreu(String email) throws Throwable {
        onSomPage.writeInCampEmail(email);
    }

    @And ( "^Introduzco el siguiente texto en el campo Assumpte: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoAssumpte(String topic) throws Throwable {
        onSomPage.writeInCampAssumpte(topic);
    }

    @And ( "^Introduzco el siguiente texto en el campo Missatge: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoMissatge(String message) throws Throwable {
        onSomPage.writeInCampMessage(message);
    }

    @Then ( "^Leo los campos, cuento los caracteres introducidos y debe haber \"([^\"]*)\" caracteres en el campo Nom, Correu, Assumpte y \"([^\"]*)\" en el campo Missatge\\.$" )
    public void leoLosCamposCuentoLosCaracteresIntroducidosYDebeHaberCaracteresEnElCampoNomCorreuAssumpteYEnElCampoMissatge(String maximCHAR30, String maximCHAR500) throws Throwable {
        Assert.assertEquals ( Integer.parseInt(maximCHAR30) , onSomPage.readCampName().length());
        Assert.assertEquals ( Integer.parseInt(maximCHAR30)  , onSomPage.readCampEmail().length());
        Assert.assertEquals ( Integer.parseInt(maximCHAR30)  , onSomPage.readCampAssumpte().length());
        Assert.assertEquals ( Integer.parseInt(maximCHAR500)  , onSomPage.readCampMessage().length());

        boolean nombre=false, email=false, topic=false, message=false;

        if (Integer.parseInt(maximCHAR30)  == onSomPage.readCampName().length())
            nombre= true;
        else if (Integer.parseInt(maximCHAR30)  == onSomPage.readCampEmail().length())
            email= true;
        else if (Integer.parseInt(maximCHAR30)  == onSomPage.readCampAssumpte().length())
              topic= true;
        else if ( Integer.parseInt(maximCHAR500)  == onSomPage.readCampMessage().length())
            message= true;
        Assert.assertTrue(nombre && email && topic && message);

    }
}
