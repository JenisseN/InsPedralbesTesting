package PageObjects.Estudis;


import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DAWPage extends PageBase {

    private String dawTitle = "DAW";
    private By locatorTitleDAW = By.className("page-title");

    public DAWPage(WebDriver driver) {
        super(driver);
    }

    public boolean dawPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleDAW) && this.readInTextField(locatorTitleDAW).equals(dawTitle);
    }

}
