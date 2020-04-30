package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmpreneduriaPage extends PageBase {

    private String empreneduriaTitle = "Emprenedoria";
    private By locatorTitleEmpreneduria= By.className("page-title");

    public EmpreneduriaPage(WebDriver driver) {
        super(driver);
    }

    public boolean empreneduriaPageisDisplayed() throws Exception {
        return this.isDisplayed(locatorTitleEmpreneduria) && this.getText(locatorTitleEmpreneduria).equals(empreneduriaTitle);
    }
}
