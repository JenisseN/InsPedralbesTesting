package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilitatInternacionalPage extends PageBase {

    private String mobilitatInTitle = "Mobilitat";
    private By locatorTitleMobilitatInt= By.className("page-title");

    public MobilitatInternacionalPage(WebDriver driver) {
        super(driver);
    }

    public boolean movilitatInPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleMobilitatInt) && this.getText(locatorTitleMobilitatInt).equals(mobilitatInTitle);
    }
}
