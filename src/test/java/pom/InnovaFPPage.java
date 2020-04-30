package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InnovaFPPage extends PageBase {

    private String innovaFPTitle = "InnovaFP";
    private By locatorTitleInnovaFP= By.className("page-title");

    public InnovaFPPage(WebDriver driver) {
        super(driver);
    }

    public boolean innovaFPPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleInnovaFP) && this.getText(locatorTitleInnovaFP).equals(innovaFPTitle);
    }
}
