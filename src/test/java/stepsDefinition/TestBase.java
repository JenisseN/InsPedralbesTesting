package stepsDefinition;

import PageObjects.Estudis.*;
import PageObjects.Home.HomePage;
import PageObjects.Home.OnSomPage;
import PageObjects.Projectes.*;
import org.openqa.selenium.WebDriver;

public class TestBase {
    protected WebDriver driverInP = Hooks.getDriverInsPedralbes();
    protected HomePage homePage = new HomePage(driverInP);
    protected IntroduccionCiclesPage introduccioCiclesPage = new IntroduccionCiclesPage(driverInP);
    protected DAMPage damPage = new DAMPage(driverInP);
    protected DAWPage dawPage = new DAWPage(driverInP);
    protected SMIXPage smixPage = new SMIXPage(driverInP);
    protected ASIXCiberseguretatPage asixCiberseguretatPage = new ASIXCiberseguretatPage(driverInP);
    protected DAMVideoJocPage damVideoJocPage = new DAMVideoJocPage(driverInP);
    protected PFIPage pfiPage = new PFIPage(driverInP);
    protected EquipImpulsorPage equipImpulsorPage = new EquipImpulsorPage(driverInP);
    protected RoboticaPage roboticaPage =new RoboticaPage(driverInP);
    protected QualitatPage quialitatPage =new QualitatPage(driverInP);
    protected InternacionalPage internacionalPage =new InternacionalPage(driverInP);
    protected MobilitatInternacionalPage mobilitatInternacionalPage =new MobilitatInternacionalPage(driverInP);
    protected InnovaFPPage innovaFPPage =new InnovaFPPage(driverInP);
    protected EmpreneduriaPage empreneduriaPage =new EmpreneduriaPage(driverInP);
    protected EscolaEmpresaPage escolaEmpresaPage =new EscolaEmpresaPage(driverInP);
    protected FPDualPage fpDualPage =new FPDualPage(driverInP);
    protected OnSomPage onSomPage = new OnSomPage(driverInP);
}
