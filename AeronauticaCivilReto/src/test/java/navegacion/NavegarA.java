package navegacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import objetosNegocios.EstadosFinancieros;
import objetosNegocios.Inicio;
import objetosNegocios.Presupuesto;
import objetosNegocios.Transparencia;


public class NavegarA {
    public static Performable AeronauticaCivil() {
        return Task.where("{0} abre la pagina de Aeronautica Civil",
                Open.browserOn().the(AeronauticaCivil.class));
    }

    public static Performable seccionTransparencia() {
        return Task.where("{0} selecciona del menu la Transparencia",
                Click.on(Inicio.TRANSPARENCIA));
    }

    public static Performable seccionPresupuesto() {
        return Task.where("{0} selecciona de la redireccion la opcion Presupuesto",
                Click.on(Transparencia.PRESUPUESTO));
    }

    public static Performable seccionEstadosFinancieros() {
        return Task.where("{0} selecciona del menu izquierdo la opcion Estados financieros",
                Click.on(Presupuesto.ESTADOS_FINANCIEROS));
    }

    public static Performable seccionBalances() {
        return Task.where("{0} selecciona balances",
                Click.on(EstadosFinancieros.BALANCES));
    }

    public static Performable abrirEstadoDeSituacion() {
        return Task.where("{0} selecciona del menu izquierdo la opcion Estados financieros",
                Click.on(EstadosFinancieros.ESTADO_SITUACION));
    }

}
