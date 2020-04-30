package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends PageBase {

    private String homePageTitle = "INSTITUT PEDRALBES";

    //Locators de Pestaña Estudis
    private By ButtonEstudisLocator = By.linkText("Estudis");
    private By ButtonIntroCiclesLocator = By.linkText("Introducció Cicles");
    private By ButtonDAMLocator = By.linkText("DAM (Desenvolupament d'aplicacions multiplataforma)");
    private By ButtonSMXLocator = By.linkText("SMX (Sistemes microinformàtics i xarxes)");
    private By ButtonDAWLocator = By.linkText("DAW (Desenvolupament d'aplicacions web)");
    private By ButtonASIXciberLocator = By.linkText("ASIX Ciberseguretat");
    private By ButtonDAMVideoJLocator = By.linkText("DAM Videojocs");
    private By ButtonPFILocator = By.linkText("PFI");
    private By ButtonEquipImESOLocator = By.partialLinkText("Equip Impulsor ESO");
    //locators Pestaña Projectes
    private By ButtonProjectesLocator = By.linkText("Projectes");
    private By ButtonQualitatsLocator = By.linkText("Projectes");
    private By ButtonRoboticaLocator = By.linkText("Projectes");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean homePageisDisplayed() throws Exception{
        return this.getTittle().equals(homePageTitle);
    }

    //Click de Botones en Estudis
    public void clickOnTittleEstudis() throws Exception{
        this.click(ButtonEstudisLocator);
    }
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
    public void clickOnPFI() throws Exception {
        this.click(ButtonPFILocator);
    }
    public void clickOnEquipImpulsorESO() throws Exception {
        this.click(ButtonEquipImESOLocator);
    }

    public void clickOnTittleProjectes() {
        this.click(ButtonProjectesLocator);
    }

    public void clickOnRobotica() {
        this.click(ButtonRoboticaLocator);
    }

    public void clickOnQualitat() {
        this.click(ButtonQualitatsLocator);
    }
}
