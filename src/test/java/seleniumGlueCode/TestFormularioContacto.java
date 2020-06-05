package seleniumGlueCode;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestFormularioContacto extends TestBase {

    @When("^Accedo a On Som y deslizo hacia abajo$")
    public void accedoAOnSomydeslizohaciaabajo() throws Exception {
        homePage.clickOnOnSom();
        Assert.assertTrue(onSomPage.onSomisDisplayed());
        onSomPage.scrollDownToBottonPage();
    }

    @When("^Hago click sobre el boton ENVIAR$")
    public void hagoClickSobreElBotonENVIAR() throws Exception {
        onSomPage.clickSendButton();
    }

    @Then("^Deben aparecer los siguientes mensajes \"([^\"]*)\" y \"([^\"]*)\"$")
    public void debenAparecerLosSiguientesMensajesY(String msgObligatory, String msgCheckErrors) throws Throwable {
        Assert.assertTrue(onSomPage.msgFieldObligatoryisDisplayedName(msgObligatory));
        Assert.assertTrue(onSomPage.msgFieldObligatoryisDisplayedEmail(msgObligatory));
        Assert.assertTrue(onSomPage.msgCheckErrorsDisplayed(msgCheckErrors));
    }


    @When("^Introduzco el siguiente texto en el campo El teu Nom: \"([^\"]*)\"$")
    public void introduzcoElSiguienteTextoEnElCampoElTeuNom(String msgFieldName) throws Throwable {
        onSomPage.writeInCampName(msgFieldName);
    }

    @And("^Introduzco el siguiente texto en el campo Correu: \"([^\"]*)\"$")
    public void introduzcoElSiguienteTextoEnElCampoCorreu(String msgFieldEmail) throws Throwable {
        onSomPage.writeInCampEmail(msgFieldEmail);
    }

    @And("^Introduzco el siguiente texto en el campo Assumpte: \"([^\"]*)\"$")
    public void introduzcoElSiguienteTextoEnElCampoAssumpte(String msgFieldTopic) throws Throwable {
        onSomPage.writeInCampAssumpte(msgFieldTopic);
    }

    @And("^Introduzco el siguiente texto en el campo Missatge: \"([^\"]*)\"$")
    public void introduzcoElSiguienteTextoEnElCampoMissatge(String msgFieldMessage) throws Throwable {
        onSomPage.writeInCampMessage(msgFieldMessage);
    }


    @Then("^Deben aparecer los siguientes mensajes de error \"([^\"]*)\" y \"([^\"]*)\"$")
    public void debenAparecerLosSiguientesMensajesDeErrorY(String msgInvalid, String msgError) throws Throwable {
        Assert.assertTrue(onSomPage.msgInvalidIsDisplayed(msgInvalid));
        Assert.assertTrue(onSomPage.msgCheckErrorsDisplayed(msgError));
    }

    @Then("^Los campos El teu Nom, Correu y Assumpte no pueden superar la cantidad de caracteres \"([^\"]*)\" y \"([^\"]*)\", el campo Missatge")
    public void losCamposElTeuNomCorreuYAssumpteNoPuedenSuperarLaCantidadDeCaracteresYElCampoMissatge(String maxTextLength30, String maxTextLength500) throws Throwable {
//        System.out.println(onSomPage.readFieldName().length());
//        System.out.println(onSomPage.readFieldEmail().length());
//        System.out.println(onSomPage.readFieldTopic());
//        System.out.println(onSomPage.readFieldMessage());

        Assert.assertEquals(Integer.parseInt(maxTextLength30), onSomPage.readFieldName().length());
        Assert.assertEquals(Integer.parseInt(maxTextLength30), onSomPage.readFieldEmail().length());
        Assert.assertEquals(Integer.parseInt(maxTextLength30), onSomPage.readFieldTopic().length());
        Assert.assertEquals(Integer.parseInt(maxTextLength500), onSomPage.readFieldMessage().length());


//        boolean name = false, email = false, topic = false, message = false;
//
//        if (Integer.parseInt(maxTextLength30) == onSomPage.readFieldName().length())
//            name = true;
//        else if (Integer.parseInt(maxTextLength30) == onSomPage.readFieldEmail().length())
//            email = true;
//        else if (Integer.parseInt(maxTextLength30) == onSomPage.readFieldTopic().length())
//            topic = true;
//        else if (Integer.parseInt(maxTextLength500) == onSomPage.readFieldMessage().length())
//            message = true;
       // Assert.assertTrue(name && email && topic && message);
    }

    @Given("^Aparace el Formulari de Contacte$")
    public void aparaceElFormulariDeContacte() throws Throwable {
        Assert.assertTrue(onSomPage.formluariIsDisplayed());
    }
}

