package seleniumGlueCode;

import chekingLinnks.ChekingLinksPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browserManager.DriverManager;
import runner.browserManager.DriverManagerFactory;
import runner.browserManager.DriverType;


public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase  = 0;
    private static DriverManager driverManager;


    @Before
    public void setUp(){
        numberOfCase++;
        System.out.println("Se esta ejecutando el escenario nro: "+ numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver= driverManager.getDriver();
        driver.get("http://www.institutpedralbes.cat/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("El escenario nro: "+numberOfCase+ " se ejecuto correctamente");
        driverManager.quitDriver();
    }

    //metodo estatico que devuelve la instancia del navegador
    public static WebDriver getDriver(){
        return driver;
    }

}
