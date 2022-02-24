package navegacion;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CambiarANuevaVentana implements Task {
    public CambiarANuevaVentana(){}

    public static CambiarANuevaVentana nuevaVentana(){
        return Instrumented.instanceOf(CambiarANuevaVentana.class).withProperties();
    }

    @Step("{0} Cambiar a nueva ventana abierta")
    public <T extends Actor> void performAs(T actor) {
        //Obtener ventana actual
        Set<String> allWindows = getDriver().getWindowHandles();

        String[] windowsId = allWindows.toArray(new String[0]);

        //Obtener ultima ventana
        String lastWindow = windowsId[windowsId.length-1];

        getDriver().switchTo().window(lastWindow);


    }
}