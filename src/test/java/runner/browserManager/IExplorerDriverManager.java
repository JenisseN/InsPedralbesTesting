package runner.browserManager;


import org.openqa.selenium.ie.InternetExplorerDriver;

public class IExplorerDriverManager extends DriverManager{
    @Override
    protected void createDriver() {
        System.setProperty("webdriver.ie.driver", ".src/test/resources/internetExplorerDriver/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }
}



