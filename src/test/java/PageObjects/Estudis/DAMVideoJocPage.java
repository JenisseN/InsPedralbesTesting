package PageObjects.Estudis;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DAMVideoJocPage extends PageBase {

    private String damVideoJTitle = "DAM Videojocs";
    private By locatorTitleDAMVideoJ = By.className("page-title");

    public DAMVideoJocPage(WebDriver driver) {
        super(driver);
    }

    public boolean damVideoJocsPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleDAMVideoJ) && this.read(locatorTitleDAMVideoJ).equals(damVideoJTitle);
    }

}
