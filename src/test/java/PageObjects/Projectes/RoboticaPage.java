package PageObjects.Projectes;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoboticaPage  extends PageBase {

    private String roboticaTitle = "Robòtica";
    private By locatorTitleRobotica= By.className("page-title");

    public RoboticaPage(WebDriver driver) {
        super(driver);
    }

    public boolean roboticaPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleRobotica) && this.readInTextField(locatorTitleRobotica).equals(roboticaTitle);
    }


}
