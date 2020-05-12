package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }


    public void write(By element, String data) throws Exception {
        try {
            WebElement eTextBox = driver.findElement(element);
            eTextBox.sendKeys(data);
        } catch (Exception e) {
            throw new Exception("No se pudo escribir sobre el elemento: " + element);
        }
    }

    public String read(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo escribir sobre el elemento: " + element);
        }
    }

    public void moveToMouse(By element) throws Exception {
        try {
            Actions action = new Actions(driver);
            WebElement elem = driver.findElement(element);
            action.moveToElement(elem);
            action.perform();
            System.out.println("Se desplego " + elem);
        } catch (Exception e) {
            throw new Exception("No se pudo clickear sobre el elemento: " + element);
        }
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
            throw new Exception("No se pudo encontrar sobre el elemento: " + element);
        }
    }

    public String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar sobre el elemento: " + element);
        }
    }

    public String getTittle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el titulo del driver.");
        }
    }

}
