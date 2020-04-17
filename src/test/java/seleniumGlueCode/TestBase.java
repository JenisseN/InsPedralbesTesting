package seleniumGlueCode;

import chekingLinnks.ChekingLinksPage;
import org.openqa.selenium.WebDriver;
import pom.*;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();

    protected HomePage homePage = new HomePage(driver);
    //Estudis-->Cicles
    protected IntroduccionCiclesPage introduccioCiclesPage = new IntroduccionCiclesPage(driver);
    protected DAMPage damPage = new DAMPage(driver);
    protected DAWPage dawPage = new DAWPage(driver);
    protected SMIXPage smixPage = new SMIXPage(driver);
    protected ASIXCiberseguretat asixCiberseguretatPage = new ASIXCiberseguretat(driver);
    protected DAMVideoJoc damVideoJocPage = new DAMVideoJoc(driver);
    protected ChekingLinksPage checkLinksObj =new ChekingLinksPage(driver);


}
