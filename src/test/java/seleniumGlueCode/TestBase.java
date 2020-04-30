package seleniumGlueCode;

import chekingLinnks.ChekingLinksPage;
import org.openqa.selenium.WebDriver;
import pom.*;

public class TestBase {
    protected WebDriver driverInP = Hooks.getDriverInsPedralbes();

    protected HomePage homePage = new HomePage(driverInP);
    //Estudis-->Cicles
    protected IntroduccionCiclesPage introduccioCiclesPage = new IntroduccionCiclesPage(driverInP);
    protected DAMPage damPage = new DAMPage(driverInP);
    protected DAWPage dawPage = new DAWPage(driverInP);
    protected SMIXPage smixPage = new SMIXPage(driverInP);
    protected ASIXCiberseguretatPage asixCiberseguretatPage = new ASIXCiberseguretatPage(driverInP);
    protected DAMVideoJocPage damVideoJocPage = new DAMVideoJocPage(driverInP);
    //Estudis-->PFI
    protected PFIPage pfiPage = new PFIPage(driverInP);

    //LINKS EXTERNOS
    //Estudis-->Equip Impulsor ESO
    protected LinksExternPage externosPage= new LinksExternPage(driverInP);
    protected ChekingLinksPage checkLinksObj =new ChekingLinksPage(driverInP);


}
