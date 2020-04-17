package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DAWPage extends BasePage {

    private String dawTitle = "DAW";
    private By locatorTitleDAW = By.className("page-title");

    public DAWPage(WebDriver driver) {
        super(driver);
    }

    public boolean dawPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleDAW) && this.getText(locatorTitleDAW).equals(dawTitle);
    }

}
