package PageObjects.Estudis;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        this.closeAndDisplay(locatorTitlePFI);
       return this.read(locatorTitlePFI).equals(pfiPageTitle);
    }


}
