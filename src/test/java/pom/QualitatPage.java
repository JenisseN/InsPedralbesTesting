package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QualitatPage extends PageBase {

    private String qualitatTitle = "Qualitat";
    private By locatorTitleQualitat= By.className("page-title");

    public QualitatPage(WebDriver driver) {
        super(driver);
    }

    public boolean qualitatPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleQualitat) && this.getText(locatorTitleQualitat).equals(qualitatTitle);
    }
}
