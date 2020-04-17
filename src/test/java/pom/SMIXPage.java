package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SMIXPage extends BasePage {

    private String smixTitle = "SMIX";
    private By locatorTitleSMIX = By.className("page-title");

    public SMIXPage(WebDriver driver) {
        super(driver);
    }

    public boolean smixPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleSMIX) && this.getText(locatorTitleSMIX).equals(smixTitle);
    }
}
