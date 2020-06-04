package PageObjects.Estudis;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class IntroduccionCiclesPage extends PageBase {

    private String introCiclesTitle = "Introducció Cicles";
    private By locatorTitleIntroCicles = By.className("page-title");

    public IntroduccionCiclesPage(WebDriver driver) {
        super(driver);
    }

    //Se heredan los metodos de pagebase
    public boolean introCiclesisDisplayed() throws Exception{
        return this.isDisplayed(locatorTitleIntroCicles) && this.read(locatorTitleIntroCicles).equals(introCiclesTitle);
    }


}
