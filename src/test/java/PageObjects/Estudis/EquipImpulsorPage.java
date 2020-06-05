package PageObjects.Estudis;

import PageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class EquipImpulsorPage extends PageBase {

    protected String equipImESOTitle = "Equip Impulsor";
    protected By locatorTitleEquipImESO = By.id("h.p_QAQz-ooVcZ6z");

    public EquipImpulsorPage(WebDriver driver) {
        super(driver);
    }

    public boolean equipImpulsorPageisDisplayed() throws Exception {
        this.closeAndDisplay(locatorTitleEquipImESO);
        return this.readInTextField(locatorTitleEquipImESO).equals(equipImESOTitle);
    }

}
