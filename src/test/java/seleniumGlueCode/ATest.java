package seleniumGlueCode;

import org.openqa.selenium.WebDriver;

public class ATest extends TestBase {

    private WebDriver driver= Hooks.getDriverInsPedralbes();
    //****pantallas a probar: solo muestra un combox con tree de la web y un jbutton para pasar y actualizar siguientes campos
    //*****pruebas automatizadas: solo muestra los casos de prueba y seleccion de ellos y tiene u jbutton para iniciar la automatizacion
    //****Reportes: solo muestra el reporter y tablas con % de requerimentos.

    //boton "revisien" de pantallas a probar actualiza los combos de escenarios en la siguiente pantalla
    //TesteRunner sera el boton de la pantalla pruebas automatizadas para correr el teste y mostrar el reporter
    //Aqui montar estructura de modod que al hacer flick en la interfaz sobre el combobox home y y dam eje
    //haya un if que determine que  escenarios de prueba hara sobre la pagina se mostrara

    TestHomeAllPestanas homeTest= new TestHomeAllPestanas();
    //todos los metodos
    //DAMPageAutoTest damTest= new DAMPageAutoTest();
    //todos los metodos


}
