package stepsDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browserManager.DriverManager;
import runner.browserManager.DriverManagerFactory;
import runner.browserManager.DriverType;

import java.util.concurrent.TimeUnit;


public class Hooks {

    private static DriverManager driverManager;
    private static WebDriver driver;
    private static int numberOfCase = 0;

    @Before
    public void setUp() {
        numberOfCase++;
        System.out.println("Se esta ejecutando el escenario nro: " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("http://www.institutpedralbes.cat/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        System.out.println("El escenario nro: " + numberOfCase + " se ejecuto");
        driverManager.quitDriver();
        System.out.println("Se ha cerrado el navegador");
        System.out.println("***************************************************");
    }

    public static WebDriver getDriverInsPedralbes() {
        return driver;
    }

}
