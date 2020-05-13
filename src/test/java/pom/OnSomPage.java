package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnSomPage  extends PageBase {

    //Tituto, localizador, boton enviar
    private  String onSomTitle = "On som";
    private By locatorTitleOnSom = By.className("page-title");
    private By locatorEnviarB = By.className("wpcf7-form-control wpcf7-submit");

    //Localizadores de mensajes de alerta del formulario de contacto
    private By locatormsgObligarotio= By.className("wpcf7-not-valid-tip");
    private By locatormsgCheckCamps= By.className("wpcf7-response-output wpcf7-display-none wpcf7-validation-errors");
    private By locatormsgemailError= By.className("wpcf7-not-valid-tip");
    private By locatormsgSuccesfulySend= By.className("wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok");

    //Localizadores de campos del formulario de contacto
    private By locatorcampNom= By.className("wpcf7-form-control wpcf7-text wpcf7-validates-as-required");
    private By locatorcampCorreu= By.className("wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email");
    private By locatorcampAssumpte = By.partialLinkText("Assumpte");
    private By locatorcampMissatge = By.className("wpcf7-form-control wpcf7-textarea");


    public OnSomPage(WebDriver driver) {
        super(driver);
    }

    public void clickSendButton() throws Exception {
        this.click(locatorEnviarB);
    }

    public boolean onSomisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleOnSom) && this.getText(locatorTitleOnSom).equals(onSomTitle);
    }

    public boolean msgCampRequiredisDisplayed(String msgRequired) throws Exception {
        return this.isDisplayed(locatormsgObligarotio) && this.getText(locatormsgObligarotio).equals(msgRequired);
    }

    public boolean msgCheckCampsisDisplayed(String msgCheck) throws Exception {
        return this.isDisplayed(locatormsgCheckCamps) && this.getText(locatormsgCheckCamps).equals(msgCheck);
    }

    public boolean msgEmailErrordisDisplayed(String msgEmailError) throws Exception {
        return this.isDisplayed(locatormsgemailError) && this.getText(locatormsgemailError).equals(msgEmailError);
    }

    public boolean msgSendSuccesfulyisDisplayed(String msgSuccesfully) throws Exception {
        return this.isDisplayed(locatormsgSuccesfulySend) && this.getText(locatormsgSuccesfulySend).equals(msgSuccesfully);
    }

    public void writeInCampName(String msgNom) throws Exception {
        this.write(locatorcampNom , msgNom);
    }

    public void writeInCampEmail(String msgEmail) throws Exception {
        this.write(locatorcampCorreu , msgEmail);
    }

    public void writeInCampAssumpte(String msgAssumpte) throws Exception {
        this.write(locatorcampAssumpte , msgAssumpte);
    }

    public void writeInCampMessage(String msgMissatge) throws Exception {
        this.write(locatorcampMissatge , msgMissatge);
    }

    public String readCampName() throws Exception {
        return this.read(locatorcampNom);
    }

    public String readCampEmail() throws Exception {
        return this.read(locatorcampCorreu);
    }

    public String readCampAssumpte() throws Exception {
        return this.read(locatorcampAssumpte);
    }

    public String readCampMessage() throws Exception {
        return this.read(locatorcampMissatge);
    }





}
