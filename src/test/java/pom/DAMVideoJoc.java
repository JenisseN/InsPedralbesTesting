package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DAMVideoJoc extends BasePage {

    private String damVideoJTitle = "DAM Videojocs";
    private By locatorTitleDAMVideoJ = By.className("page-title");

    public DAMVideoJoc(WebDriver driver) {
        super(driver);
    }

    public boolean damVideoJocsPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleDAMVideoJ) && this.getText(locatorTitleDAMVideoJ).equals(damVideoJTitle);
    }

}
