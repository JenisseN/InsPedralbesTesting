package runner.browserManager;


import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {
        DriverManager driverManager = null;
        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case EXPLORER:
                driverManager = new IExplorerDriverManager();
                break;
            default:
                System.out.print("El navegador seleccionado es invalido");
                break;
        }
        return driverManager;
    }
}








