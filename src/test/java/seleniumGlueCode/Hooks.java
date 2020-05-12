package seleniumGlueCode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browserManager.DriverManager;
import runner.browserManager.DriverManagerFactory;
import runner.browserManager.DriverType;

import java.util.concurrent.TimeUnit;


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
        driver.manage().window().maximize();
        driver.get("http://www.institutpedralbes.cat/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        System.out.println("El escenario nro: "+numberOfCase+ " se ejecuto correctamente");
        driverManager.quitDriver();
    }

    //metodo estatico que devuelve la instancia del navegador
    public static WebDriver getDriverInsPedralbes(){
        return driver;
    }


    //ESTO ES NUEVO
    @Before(order=1)
    public void beforeScenario(){
        System.out.println("Inicio el browser y limpio cookies");
    }
    @Before(order=0)
    public void beforeScenarioStart(){
        System.out.println("-----------------Inicio del escenario-----------------");
    }


    @After(order=0)
    public void afterScenarioFinish(){
        System.out.println("-----------------Fin del escenario-----------------");
    }
    @After(order=1)
    public void afterScenario(){
        System.out.println("El usuario salio y cerro el bowser");
    }

}
