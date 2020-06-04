package PageObjects.Projectes;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FPDualPage  extends PageBase {

    private String fpDualTitle = "FP Dual";
    private By locatorTitleFPDual= By.className("page-title");

    public FPDualPage(WebDriver driver) {
        super(driver);
    }

    public boolean fpDualPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleFPDual) && this.read(locatorTitleFPDual).equals(fpDualTitle);
    }
}
