package seleniumGlueCode;

import chekingLinks.ChekingLinksPage;
import org.openqa.selenium.WebDriver;
import pom.*;

public class TestBase {
    protected WebDriver driverInP = Hooks.getDriverInsPedralbes();

    protected ChekingLinksPage checkLinksObj =new ChekingLinksPage(driverInP);
    protected HomePage homePage = new HomePage(driverInP);

    protected IntroduccionCiclesPage introduccioCiclesPage = new IntroduccionCiclesPage(driverInP);
    protected DAMPage damPage = new DAMPage(driverInP);
    protected DAWPage dawPage = new DAWPage(driverInP);
    protected SMIXPage smixPage = new SMIXPage(driverInP);
    protected ASIXCiberseguretatPage asixCiberseguretatPage = new ASIXCiberseguretatPage(driverInP);
    protected DAMVideoJocPage damVideoJocPage = new DAMVideoJocPage(driverInP);
    protected PFIPage pfiPage = new PFIPage(driverInP);

    protected LinksExternPage externosPage= new LinksExternPage(driverInP);

    protected EmpreneduriaPage empreneduriaPage =new EmpreneduriaPage(driverInP);
    protected EscolaEmpresaPage escolaEmpresaPage =new EscolaEmpresaPage(driverInP);
    protected FPDualPage fpDualPage =new FPDualPage(driverInP);
    protected InternacionalPage internacionalPage =new InternacionalPage(driverInP);
    protected MobilitatInternacionalPage mobilitatInternacionalPage =new MobilitatInternacionalPage(driverInP);
    protected QualitatPage quialitatPage =new QualitatPage(driverInP);
    protected RoboticaPage roboticaPage =new RoboticaPage(driverInP);
    protected InnovaFPPage innovaFPPage =new InnovaFPPage(driverInP);

    protected OnSomPage onSomPage = new OnSomPage(driverInP);

}
