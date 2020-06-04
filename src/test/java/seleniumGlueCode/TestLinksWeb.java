package seleniumGlueCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestLinksWeb extends TestBase{

    @Given ( "^Verifico todos los links de la web$" )
    public void verificoTodosLosLinksDeLaWeb() {
        checkLinksObj.chekingLinksPagLinks();
    }

    @Then ( "^Debo listar links rotos y validos$" )
    public void deboListarLinksRotosYValidos() {
        checkLinksObj.brokenLinks();
    }
}
