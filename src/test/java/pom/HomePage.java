package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage{

    private String homePageTitle = "INSTITUT PEDRALBES";
    private By ButtonEstudisLocator = By.linkText("Estudis");
    private By ButtonIntroCiclesLocator = By.linkText("Introducció Cicles");
    private By ButtonDAMLocator = By.linkText("DAM (Desenvolupament d'aplicacions multiplataforma)");
    private By ButtonSMXLocator = By.linkText("SMX (Sistemes microinformàtics i xarxes)");
    private By ButtonDAWLocator = By.linkText("DAW (Desenvolupament d'aplicacions web)");
    private By ButtonASIXciberLocator = By.linkText("ASIX Ciberseguretat");
    private By ButtonDAMVideoJLocator = By.linkText("DAM Videojocs");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    //Los metodos son las accciones que vamos a hacer en BasePage
    public boolean homePageisDisplayed() throws Exception{
        return this.getTittle().equals(homePageTitle);
    }

    public void clickOnTittleEstudis() throws Exception{
        this.click(ButtonEstudisLocator);
    }

    //Botones en Estudis
    public void clickOnIntroCicles() throws Exception{
        this.click(ButtonIntroCiclesLocator);
    }
    public void clickOnDAM() throws Exception {
        this.click(ButtonDAMLocator);
    }
    public void clickOnDAW() throws Exception {
        this.click(ButtonDAWLocator);
    }
    public void clickOnSMX() throws Exception {
        this.click(ButtonSMXLocator);
    }
    public void clickOnDAMVideoJoc() throws Exception {
        this.click(ButtonDAMVideoJLocator);
    }
    public void clickOnASIXCiberseguridad() throws Exception {
        this.click(ButtonASIXciberLocator);
    }
}
