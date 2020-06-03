package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PFIPage extends PageBase {

    private String pfiPageTitle = "PFI";
    private By locatorTitlePFI = By.className("page-title");

    public PFIPage(WebDriver driver) {
        super(driver);
    }

    public boolean pfiPageisDisplayed() throws Exception {
       return this.isDisplayed(locatorTitlePFI) && this.getText(locatorTitlePFI).equals(pfiPageTitle);
    }

    public void pfiPageClose() {
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
        driver.close();
        driver.switchTo().window(handlesList.get(0));
    }
}
