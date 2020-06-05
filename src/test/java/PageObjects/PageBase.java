package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
            System.out.println("Se clicko " + element);
        } catch (Exception e) {
            throw new Exception("No se pudo clickear sobre el elemento: " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el elemento: " + element);
        }
    }

    public String read(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo leer el elemento: " + element);
        }
    }

    public String getTittle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el titulo del driver.");
        }
    }

    public void moveToMouse(By element) throws Exception {
        try {
            Actions action = new Actions(driver);
            WebElement elem = driver.findElement(element);
            action.moveToElement(elem);
            action.perform();
            System.out.println("Se desplego " + elem.getText());
        } catch (Exception e) {
            throw new Exception("No se pudo mover sobre el elemento: " + element);
        }
    }


    public void clickAndWrite(By element, String data) throws Exception {
        try {
            WebElement eTextBox = driver.findElement(element);
            eTextBox.click();
            System.out.println("Se clicko " + element);
            eTextBox.clear();
            eTextBox.sendKeys(data);
            System.out.println("Y se introdujo: " + data);
        } catch (Exception e) {
            throw new Exception("No se pudo clickear ni escribir en el elemento: " + element);
        }
    }

    public void closeAndDisplay(By element) throws Exception {
        try {
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(0));
            driver.close();
            driver.switchTo().window(tabs2.get(1));
            WebElement elem = driver.findElement(element);
            elem.isDisplayed();
            System.out.println("Se encontro " + elem.getText());
        } catch (Exception e) {
            throw new Exception("No se pudo clickear sobre el elemento: " + element);
        }
    }

}























