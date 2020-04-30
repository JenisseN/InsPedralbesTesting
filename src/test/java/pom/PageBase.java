package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class PageBase {

    protected WebDriver driver;


    public PageBase(WebDriver driver){
        this.driver= driver;
    }



//    public void elementsFluentWait(By locatorElement){
//        //Guardamos en title el elemento por el que le decimos a fluent wait que espere 10 segundos haciendo consultas cada 2 segundos ignoradndo esas excepciones
//        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
//        WebElement elementWait = fwait.until(new Function<WebDriver, WebElement>() {
//
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(locatorElement);//
//            }
//        });
//    }

    public  void click(By element) throws Exception {
        try{
            driver.findElement(element).click();
            System.out.println("Se clicko "+element);
        }catch (Exception e){
            throw new Exception("No se pudo clickear sobre el elemento: " +element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try{
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar sobre el elemento: " +element);
        }
    }

    public  String getText(By element) throws Exception {
        try{
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar sobre el elemento: " +element);
        }
    }

    public  String getTittle() throws Exception {
        try{
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el titulo del driver." );
        }
    }

}
