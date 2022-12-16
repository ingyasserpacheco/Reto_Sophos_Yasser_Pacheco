package com.demoqa.stepdefinitions;

import com.demoqa.tasks.DatesTask;
import com.demoqa.userinferfaces.Home;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DatesStepDefinition {
    //@Managed(driver= "chrome")
    //WebDriver driver;

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
        //OnStage.theActorCalled("Yasser");
    }
    @Given("^Yasser quiere ir a la opcion Widgets en Date picker$")
    public void yasserQuiereIrALaOpcionWidgetsEnDatePicker() {
        //theActorInTheSpotlight() .wasAbleTo(Open.url("https://demoqa.com/"));
    theActorCalled("Yasser").attemptsTo(Open.browserOn(new Home()));
}

    @When("^Seleccionar una fecha y fecha y hora al azar$")
    public void seleccionarUnaFechaYFechaYHora() {
        theActorInTheSpotlight().attemptsTo(DatesTask.datesTask());
    }

    @Then("^Se definen las fechas$")
    public void seDefinenLasFechas() {
    }

}
