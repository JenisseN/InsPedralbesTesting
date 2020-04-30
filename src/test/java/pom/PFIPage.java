package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PFIPage extends PageBase {

    private String pfiTitle = "PFI – INSTITUT PEDRALBES";
    private By locatorTitlePFI = By.className("page-title");

    public PFIPage(WebDriver driver) {
        super(driver);
    }

    public boolean pfiPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitlePFI) && this.getText(locatorTitlePFI).equals(pfiTitle);
    }
}
