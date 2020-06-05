package PageObjects.Projectes;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EscolaEmpresaPage  extends PageBase {

    private String escolaEmInTitle = "Escola empresa";
    private By locatorTitleEscolaemp= By.className("page-title");

    public EscolaEmpresaPage(WebDriver driver) {
        super(driver);
    }

    public boolean escolaEmpresaPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleEscolaemp) && this.readInTextField(locatorTitleEscolaemp).equals(escolaEmInTitle);
    }
}
