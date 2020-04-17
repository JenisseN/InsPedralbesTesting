package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ASIXCiberseguretat extends BasePage {

    private String asixCiberTitle = "ASIX Ciberseguretat";
    private By locatorTitleASIXCiber = By.className("page-title");

    public ASIXCiberseguretat(WebDriver driver) {
        super(driver);
    }
    public boolean asixCiberseguretataisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleASIXCiber) && this.getText(locatorTitleASIXCiber).equals(asixCiberTitle);
    }
}
