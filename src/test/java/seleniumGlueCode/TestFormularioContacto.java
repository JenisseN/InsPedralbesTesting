package seleniumGlueCode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestFormularioContacto extends TestBase{


    @When ( "^Hago click sobre la pestaña On Som y deslizo hacia abajo$" )
    public void hagoClickSobreLaPestañaOnSomydeslizohaciaabajo() throws Exception {
        homePage.clickOnOnSom();
        Assert.assertTrue( onSomPage.onSomisDisplayed() );
        onSomPage.scrollDownToBottonPage();
    }
    
    @And ( "^Hago click sobre el boton ENVIAR$" )
    public void hagoClickSobreElBotonENVIAR() throws Exception {
        onSomPage.clickSendButton();
    }

    @Then ( "^Deben aparecer los siguientes mensajes \"([^\"]*)\" y \"([^\"]*)\"$" )
    public void debenAparecerLosSiguientesMensajesY(String msg1, String msg2) throws Throwable {
        Assert.assertTrue( onSomPage.msgFieldRequiredisDisplayed( msg1 ));
        Assert.assertTrue( onSomPage.msgCheckCampsisDisplayed( msg2 ));// No encuentra el elemento
    }


    @And ( "^Introduzco el siguiente texto en el campo El teu Nom: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoElTeuNom(String msgFieldName) throws Throwable {
        onSomPage.writeInCampName(msgFieldName);
    }

    @And ( "^Introduzco el siguiente texto en el campo Correu: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoCorreu(String msgFieldEmail) throws Throwable {
        onSomPage.writeInCampEmail(msgFieldEmail);
    }

    @And ( "^Introduzco el siguiente texto en el campo Assumpte: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoAssumpte(String msgFieldTopic) throws Throwable {
        onSomPage.writeInCampAssumpte(msgFieldTopic);
    }

    @And ( "^Introduzco el siguiente texto en el campo Missatge: \"([^\"]*)\"$" )
    public void introduzcoElSiguienteTextoEnElCampoMissatge(String msgFieldMessage) throws Throwable {
        onSomPage.writeInCampMessage(msgFieldMessage);
    }


    @Then ( "^Deben aparecer los siguientes mensajes de error \"([^\"]*)\" y \"([^\"]*)\"$" )
    public void debenAparecerLosSiguientesMensajesDeErrorY(String msg1, String msg2) throws Throwable {
        Assert.assertTrue( onSomPage.msgNotValidDisplayed( msg1 ));
        Assert.assertTrue( onSomPage.msgCheckCampsisDisplayed( msg2 ));
    }

    @Then ( "^Leo los campos, cuento los caracteres introducidos y debe haber \"([^\"]*)\" caracteres en el campo Nom, Correu, Assumpte y \"([^\"]*)\" en el campo Missatge\\.$" )
    public void leoLosCamposCuentoLosCaracteresIntroducidosYDebeHaberCaracteresEnElCampoNomCorreuAssumpteYEnElCampoMissatge(String maximCHAR30, String maximCHAR500) throws Throwable {
        Assert.assertEquals ( Integer.parseInt(maximCHAR30) , onSomPage.readFieldName().length());
        Assert.assertEquals ( Integer.parseInt(maximCHAR30)  , onSomPage.readFieldEmail().length());
        Assert.assertEquals ( Integer.parseInt(maximCHAR30)  , onSomPage.readFieldTopic().length());
        Assert.assertEquals ( Integer.parseInt(maximCHAR500)  , onSomPage.readFieldMessage().length());

        boolean name=false, email=false, topic=false, message=false;

        if (Integer.parseInt(maximCHAR30)  == onSomPage.readFieldName().length())
            name= true;
        else if (Integer.parseInt(maximCHAR30)  == onSomPage.readFieldEmail().length())
            email= true;
        else if (Integer.parseInt(maximCHAR30)  == onSomPage.readFieldTopic().length())
              topic= true;
        else if ( Integer.parseInt(maximCHAR500)  == onSomPage.readFieldMessage().length())
            message= true;
        Assert.assertTrue(name && email && topic && message);

    }


}

