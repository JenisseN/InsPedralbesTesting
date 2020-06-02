package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OnSomPage  extends PageBase {

    //Tituto On som, localizador, boton enviar
    private  String onSomTitle = "On som";
    private By locatorTitleOnSom = By.className("page-title");
    private By locatorEnviarB =By.cssSelector("input[type='submit'][value='Enviar']");

    //Localizadores de mensajes de alerta del formulario
    private By locatormsgObligaroty= By.partialLinkText("El campo es obligatorio.");
    private By locatormsgCheckCamps= By.className("wpcf7-response-output wpcf7-display-none wpcf7-validation-errors");///no se encontro el locatorr
    private By locatormsgNotValid= By.partialLinkText("La dirección de correo electrónico");

    //Localizadores de campos input en el formulario de contacto
    private By locatorFieldName = By.name("your-name");
    private By locatorFieldEmail =  By.name ("your-email");
    private By locatorFieldTopic =  By.name("your-subject");
    private By locatorFieldMessage = By.name("your-message");


    public OnSomPage(WebDriver driver) {
        super(driver);
    }

    public void clickSendButton() throws Exception {
        if (this.isDisplayed(locatorEnviarB)) {
            this.click(locatorEnviarB);
        }else {
            System.out.println("El boton "+ locatorEnviarB +" no se encontro ni se pudo clickar.");
        }
    }

    public boolean onSomisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleOnSom) && this.getText(locatorTitleOnSom).equals(onSomTitle);
    }

    public boolean msgFieldRequiredisDisplayed(String msgRequired) throws Exception {
        return this.getText(locatormsgObligaroty).equals(msgRequired);
    }

    public boolean msgNotValidDisplayed(String msgNotValid) throws Exception {
        return this.getText(locatormsgNotValid).equals(msgNotValid);
    }

    public boolean msgCheckCampsisDisplayed(String msgCheck) throws Exception {
        return this.getText(locatormsgCheckCamps).equals(msgCheck);
    }

    public void writeInCampName(String msgFieldName) throws Exception {
        this.clickAndWrite(locatorFieldName, msgFieldName);
    }

    public void writeInCampEmail(String msgEmail) throws Exception {
        this.clickAndWrite(locatorFieldEmail, msgEmail);
    }

    public void writeInCampAssumpte(String msgFieldTopic) throws Exception {
        this.clickAndWrite(locatorFieldTopic, msgFieldTopic);
    }

    public void writeInCampMessage(String msgFieldMessage) throws Exception {
        this.clickAndWrite(locatorFieldMessage, msgFieldMessage);
    }

    public String readFieldName() throws Exception {
        return this.read(locatorFieldName);
    }

    public String readFieldEmail() throws Exception {
        return this.read(locatorFieldEmail);
    }

    public String readFieldTopic() throws Exception {
        return this.read(locatorFieldTopic);
    }

    public String readFieldMessage() throws Exception {
        return this.read(locatorFieldMessage);
    }

    public void scrollDownToBottonPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

}
