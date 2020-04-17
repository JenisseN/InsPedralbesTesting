package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IntroduccionCiclesPage extends BasePage{

    private String introCiclesTitle = "Introducció Cicles";
    private By locatorTitleIntroCicles = By.className("page-title");

    public IntroduccionCiclesPage(WebDriver driver) {
        super(driver);
    }


    //Los metodos son las accciones que vamos a hacer en BasePage
    public boolean introCiclesisDisplayed() throws Exception{
        return this.isDisplayed(locatorTitleIntroCicles) && this.getText(locatorTitleIntroCicles).equals(introCiclesTitle);
    }

}
