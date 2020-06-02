package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

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
    private By ButtonEquipImESOLocator = By.linkText("Equip Impulsor ESO");
    //Locators Pestaña Projectes
    private By ButtonProjectesLocator = By.linkText("Projectes");
    private By ButtonQualitatsLocator = By.linkText("Qualitat");
    private By ButtonRoboticaLocator = By.linkText("Robòtica");
    private By ButtonEscolaEmpresaLocator = By.linkText("Escola empresa");
    private By ButtonFPDualLocator = By.linkText("FP Dual");
    private By ButtonEmpreneduriaLocator = By.linkText("Emprenedoria");
    private By ButtonInnovaFPLocator = By.linkText("InnovaFP");
    private By ButtonMovilidadInternacionalLocator = By.linkText("Mobilitat internacional");
    private By ButtonInternacionalLocator = By.linkText("International");
    //Locators pestaña On Som
    private By ButtonOnSom = By.linkText("On som");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean homePageisDisplayed() throws Exception {
        return this.getTittle().equals(homePageTitle);
    }

    //Acesso a titulos de la pestaña estudis
    public void clickOnTittleEstudis() throws Exception {
        this.click(ButtonEstudisLocator);
    }

    public void clickOnIntroCicles() throws Exception {
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

    //Acesso a titulos de la pestaña Projectes
    public void clickOnPFI() throws Exception {
        this.click(ButtonPFILocator);
    }

    public void clickOnEquipImpulsorESO() throws Exception {
        this.click(ButtonEquipImESOLocator);
    }

    public void toMoveMouseOnTittleProjectes() throws Exception {
        this.moveToMouse(ButtonProjectesLocator);
    }

    public void clickOnRobotica() throws Exception {
        this.click(ButtonRoboticaLocator);
    }

    public void clickOnQualitat() throws Exception {
        this.click(ButtonQualitatsLocator);
    }

    public void clickOnEscolaEmpresa() throws Exception {
        this.click(ButtonEscolaEmpresaLocator);
    }

    public void clickOnFPDual() throws Exception {
        this.click(ButtonFPDualLocator);
    }

    public void clickOnEmpreneduria() throws Exception {
        this.click(ButtonEmpreneduriaLocator);
    }

    public void clickOnInnovaFP() throws Exception {
        this.click(ButtonInnovaFPLocator);
    }

    public void clickOnInternacional() throws Exception {
        this.click(ButtonInternacionalLocator);
    }

    public void toMoveMouseOnTitleInternacional() throws Exception {
        this.moveToMouse(ButtonInternacionalLocator);
    }

    public void clickOnMobilitatInternacional() throws Exception {
        this.click(ButtonMovilidadInternacionalLocator);
    }

    public void clickOnOnSom() throws Exception {
        this.click(ButtonOnSom);
    }

}
