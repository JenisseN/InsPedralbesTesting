package PageObjects.Estudis;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DAMPage extends PageBase {

    private String damTitle = "DAM";
    private By locatorTitleDAM = By.className("page-title");


    public DAMPage(WebDriver driver) {
        super(driver);
    }

    public boolean damPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleDAM) && this.read(locatorTitleDAM).equals(damTitle);
    }


}
