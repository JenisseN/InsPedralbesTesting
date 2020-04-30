package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksExternPage extends PageBase {

    protected String equipImESOTitle = "Equip Impulsor";
    protected By locatorTitleEquipImESO = By.id("h.p_QAQz-ooVcZ6z");

    public LinksExternPage(WebDriver driver) { super(driver); }

    public boolean equipImpulsorPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleEquipImESO) && this.getText(locatorTitleEquipImESO).equals(equipImESOTitle);
    }

}
