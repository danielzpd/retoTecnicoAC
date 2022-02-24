package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navegacion.NavegarA;
import navegacion.CambiarANuevaVentana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class EstadosFinancierosStepDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("{actor} esta buscando los estados financieros en la pagina de Aeronautica Civil")
    public void buscarBanistmoEmpresas(Actor actor){
        actor.wasAbleTo(NavegarA.AeronauticaCivil());
    }

    @When("{actor} selecciona la opcion de Transparencia")
    public void seleccionarTransparencia(Actor actor){
        actor.attemptsTo(
                NavegarA.seccionTransparencia()
        );
    }

    @And("{actor} selecciona del apartado de Transparencia la opcion Presupuesto")
    public void seleccionarPresupuesto(Actor actor) {
        actor.attemptsTo(
                NavegarA.seccionPresupuesto()
        );
    }

    @And("{actor} cambia de tab para ver los presupuestos")
    public void cambiarDeTabVerPresupuestos(Actor actor){
        actor.attemptsTo(
                Switch.toTheOtherWindow()
        );
    }

    @And("{actor} selecciona del menu izquierdo la opcion Estados financieros")
    public void seleccionarEstadosFinancieros(Actor actor){
        actor.attemptsTo(
                NavegarA.seccionEstadosFinancieros()
        );
    }

    @And("{actor} selecciona la opcion de Balances")
    public void seleccionarBalances(Actor actor){
        actor.attemptsTo(
                NavegarA.seccionBalances()
        );
    }

    @And("{actor} selecciona el Estado de Situacion Financiera a 30 de abril de 2021")
    public void seleccionarAbrirEstadoDeSituacion(Actor actor){
        actor.attemptsTo(
                NavegarA.abrirEstadoDeSituacion()
        );
    }

    @Then("{actor} cambia de tab para ver el documento generado")
    public void cambiarDeTabArchivoGenerado(Actor actor){
        actor.attemptsTo(
                CambiarANuevaVentana.nuevaVentana()
        );

    }

    @And("{actor} verifica que el archivo generado se llame {string}")
    public void verNombreDelArchivoGenerado(Actor actor, String nombreArchivo) throws IOException {
        //Decodificar URL con formato UTF 8 para compararlo
        String urlDecoded = java.net.URLDecoder.decode(getDriver().getCurrentUrl(), StandardCharsets.UTF_8.toString());

        actor.attemptsTo(
                Ensure.that(urlDecoded).contains(nombreArchivo)
        );

    }

}
