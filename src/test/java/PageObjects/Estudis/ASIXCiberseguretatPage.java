package PageObjects.Estudis;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ASIXCiberseguretatPage extends PageBase {

    private String asixCiberTitle = "ASIX Ciberseguretat";
    private By locatorTitleASIXCiber = By.className("page-title");

    public ASIXCiberseguretatPage(WebDriver driver) {
        super(driver);
    }

    public boolean asixCiberseguretataisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleASIXCiber) && this.readInTextField(locatorTitleASIXCiber).equals(asixCiberTitle);
    }
}
