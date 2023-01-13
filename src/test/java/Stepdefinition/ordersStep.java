package Stepdefinition;

import Question.orderFailedQuestion;
import Question.orderQuestion;
import Task.dashboardOrderTask;
import Task.fomularioOrdersTask;
import Task.orderFailedTask;
import Task.orderModuloTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;


public class ordersStep {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("^el usuario visualiza el Dashboard y hace clic en mas info$")
    public void el_usuario_visualiza_el_dashboard_y_hace_clic_en_mas_info(){
        theActorInTheSpotlight().attemptsTo(dashboardOrderTask.dashboardOrder());
    }

    @And("^el usuario visualiza el modulo de ordenes y hace clic en el botón nueva orden$")
    public void el_usuario_visualiza_el_modulo_de_ordenes_y_hace_clic_en_el_botn_nueva_orden() {
        theActorInTheSpotlight().attemptsTo(orderModuloTask.orderModulo());
    }

    @And("^el usuario llena los campos obligatorios del formulario y hace clic en grabar$")
    public void el_usuario_llena_los_campos_obligatorios_del_formulario_y_hace_clic_en_grabar() {
        theActorInTheSpotlight().attemptsTo(fomularioOrdersTask.fomularioOrders());
    }

    @Then("^el usuario visualiza mensaje exitoso (.+)$")
    public void el_usuario_visualiza_mensaje_exitoso(String mensajeexitoso) {
        theActorInTheSpotlight().should(seeThat(orderQuestion.orderQuestion(mensajeexitoso), is(true)));
    }
    @And("^el usuario hace clic en grabar$")
    public void el_usuario_hace_clic_en_grabar() {
        theActorInTheSpotlight().attemptsTo(orderFailedTask.orderFailed());
    }

    @Then("^el usuario visualiza mensaje fallido (.+)$")
    public void el_usuario_visualiza_mensaje_fallido(String mensajefallido) {
        theActorInTheSpotlight().should(seeThat(orderFailedQuestion.orderFailedQuestion(mensajefallido), is(true)));
    }

}
