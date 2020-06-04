package PageObjects.Projectes;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternacionalPage  extends PageBase {

    private String internacionalTitle = "International";
    private By locatorTitleInternacional= By.className("page-title");

    public InternacionalPage(WebDriver driver) {
        super(driver);
    }

    public boolean internacionalPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleInternacional) && this.read(locatorTitleInternacional).equals(internacionalTitle);
    }
}
