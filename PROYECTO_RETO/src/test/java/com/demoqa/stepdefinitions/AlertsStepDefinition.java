package com.demoqa.stepdefinitions;

import com.demoqa.tasks.*;
import com.demoqa.userinferfaces.Ventana_Emergente;
import com.demoqa.userinferfaces.Home;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AlertsStepDefinition {
    //@Managed(driver= "chrome")
    //WebDriver driver;

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
        //OnStage.theActorCalled("Yasser");
    }
    @Given("^Yasser ingresa a la opcion Alerts,Frame & Windows$")
    public void yasserIngresaALaOpcionAlertsFrameWindows() {
        //theActorInTheSpotlight() .wasAbleTo(Open.url("https://demoqa.com/"));
        theActorCalled("Yasser").attemptsTo(Open.browserOn(new Home()));
    }
    @When("^Interactua con cuatro ventanas emergentes$")
    public void interactuaConCuatroVentanasEmergentes() {
        theActorInTheSpotlight().attemptsTo(AlertsTask1.alertsTask1());
    }
    @Then("^Las activa y cierra segun sus condiciones$")
    public void lasActivaYCierraSegunSusCondiciones()throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(AlertsTask2.alertsTask2());
        theActorInTheSpotlight().attemptsTo(Ventana_Emergente.accept());
        theActorInTheSpotlight().attemptsTo(AlertsTask3.alertsTask3());
        Thread.sleep(8000);
        theActorInTheSpotlight().attemptsTo(Ventana_Emergente.accept());
        theActorInTheSpotlight().attemptsTo(AlertsTask4.alertsTask4());
        theActorInTheSpotlight().attemptsTo(Ventana_Emergente.cancel());
        theActorInTheSpotlight().attemptsTo(AlertsTask5.alertsTask5());
        theActorInTheSpotlight().attemptsTo(Ventana_Emergente.Text());
        theActorInTheSpotlight().attemptsTo(Ventana_Emergente.accept());
        Thread.sleep(5000);
    }
}
