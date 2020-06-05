package PageObjects.Home;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class OnSomPage extends PageBase {

    private By locatormsgCheckErrors = By.xpath("//form[@class='wpcf7-form invalid']//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']");
    private By locatormsgObligatoryName = By.xpath("//form[@class='wpcf7-form invalid']//div[@class='vc_row make-an-appointment-form']//div[@class='vc_col-sm-6']//span[@class='wpcf7-form-control-wrap your-name']//span[@class='wpcf7-not-valid-tip']");
    private By locatormsgObligatoryEmail = By.xpath("//form[@class='wpcf7-form invalid']//div[@class='vc_row make-an-appointment-form']//div[@class='vc_col-sm-6']//span[@class='wpcf7-form-control-wrap your-email']//span[@class='wpcf7-not-valid-tip']");
    private By locatormsgInvalid = By.xpath("//form[@class='wpcf7-form invalid']//div[@class='vc_row make-an-appointment-form']//div[@class='vc_col-sm-6']//span[@class='wpcf7-form-control-wrap your-email']//span[@class='wpcf7-not-valid-tip']");
    private By locatorFieldName = By.name("your-name");
    private By locatorFieldEmail = By.name("your-email");
    private By locatorFieldTopic = By.name("your-subject");
    private By locatorFieldMessage = By.name("your-message");
    private String onSomTitle = "On som";
    private By locatorTitleOnSom = By.className("page-title");
    private By locatorEnviarB = By.cssSelector("input[type='submit'][value='Enviar']");

    public OnSomPage(WebDriver driver) {
        super(driver);
    }

    public void clickSendButton() throws Exception {
        if (this.isDisplayed(locatorEnviarB)) {
            this.click(locatorEnviarB);
        } else {
            System.out.println("El boton " + locatorEnviarB + " no se encontro ni se pudo clickar.");
        }
    }

    public boolean onSomisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleOnSom) && this.readInTextField(locatorTitleOnSom).equals(onSomTitle);
    }

    public boolean msgFieldObligatoryisDisplayedName(String msgNotValidName) throws Exception {
        return this.readInTextField(locatormsgObligatoryName).equals(msgNotValidName);
    }

    public void writeInCampName(String msgFieldName) throws Exception {
        this.writeInTextField(locatorFieldName, msgFieldName);
    }

    public boolean msgFieldObligatoryisDisplayedEmail(String msgObligatoryEmail) throws Exception {
        return this.readInTextField(locatormsgObligatoryEmail).equals(msgObligatoryEmail);
    }

    public boolean msgCheckErrorsDisplayed(String msgErrors) throws Exception {
        return this.readInTextField(locatormsgCheckErrors).equals(msgErrors);
    }

    public boolean msgInvalidIsDisplayed(String msgInvalid) throws Exception {
        return this.readInTextField(locatormsgInvalid).equals(msgInvalid);
    }

    public void writeInCampEmail(String msgEmail) throws Exception {
        this.writeInTextField(locatorFieldEmail, msgEmail);
    }

    public void writeInCampAssumpte(String msgFieldTopic) throws Exception {
        this.writeInTextField(locatorFieldTopic, msgFieldTopic);
    }

    public void writeInCampMessage(String msgFieldMessage) throws Exception {
        this.writeInTextField(locatorFieldMessage, msgFieldMessage);
    }

    public String readFieldName() throws Exception {
        return this.readInTextField(locatorFieldName);
    }

    public String readFieldEmail() throws Exception {
        return this.readInTextField(locatorFieldEmail);
    }

    public String readFieldTopic() throws Exception {
        return this.readInTextField(locatorFieldTopic);
    }

    public String readFieldMessage() throws Exception {
        return this.readInTextField(locatorFieldMessage);
    }

    public void scrollDownToBottonPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public boolean formluariIsDisplayed() throws Exception {
        return isDisplayed(locatorFieldName) && isDisplayed(locatorFieldEmail) && isDisplayed(locatorFieldTopic) && isDisplayed(locatorFieldMessage)
                && isDisplayed(locatorEnviarB);
    }


}
