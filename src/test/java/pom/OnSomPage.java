package pom;

import freemarker.ext.servlet.FreemarkerServlet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.xml.ws.WebEndpoint;
import java.util.List;

public class OnSomPage  extends PageBase {

    //Tituto On som, localizador, boton enviar
    private  String onSomTitle = "On som";
    private By locatorTitleOnSom = By.className("page-title");
    private By locatorEnviarB =By.cssSelector("input[type='submit'][value='Enviar']");

    //Localizadores de mensajes de alerta del formulario
    private By locatormsgObligarotio= By.xpath("//*[@id='customSelect_3']/div[1]/span)");
    private By locatormsgCheckCamps= By.xpath("//*[@id='customSelect_3']/div[1]/span)");

    //Localizadores de campos del formulario de contacto
    private By locatorcampNom= By.className("wpcf7-form-control wpcf7-text wpcf7-validates-as-required");
    private By locatorcampCorreu= By.className("wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email");
    private By locatorcampAssumpte = By.partialLinkText("Assumpte");
    private By locatorcampMissatge = By.className("wpcf7-form-control wpcf7-textarea");


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

    public boolean msgCampRequiredisDisplayed(String msgRequired) throws Exception {
        return this.getText(locatormsgObligarotio).equals(msgRequired);
    }

    public boolean msgCheckCampsisDisplayed(String msgCheck) throws Exception {
        return this.getText(locatormsgCheckCamps).equals(msgCheck);
    }


    public void writeInCampName(String msgNom) throws Exception {
        this.click(locatorcampNom);
        this.write(locatorcampNom , msgNom);
    }

    public void writeInCampEmail(String msgEmail) throws Exception {
        this.click(locatorcampCorreu);
        this.write(locatorcampCorreu , msgEmail);
    }

    public void writeInCampAssumpte(String msgAssumpte) throws Exception {
        this.click(locatorcampAssumpte);
        this.write(locatorcampAssumpte , msgAssumpte);
    }

    public void writeInCampMessage(String msgMissatge) throws Exception {
        this.click(locatorcampMissatge);
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

    public void downOnOnSom() throws Exception {
        //ScrollDown
        //There are many ways to scroll up and down in Selenium Webdriver I always use Java Script to do the same.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,850)");
        //js.executeScript("javascript:window.scrollBy(250,850)");

    }

}
