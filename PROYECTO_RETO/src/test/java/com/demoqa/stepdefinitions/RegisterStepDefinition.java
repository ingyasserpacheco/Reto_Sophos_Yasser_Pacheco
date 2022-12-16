package com.demoqa.stepdefinitions;

import com.demoqa.tasks.registroTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class RegisterStepDefinition {
    //@Managed(driver= "chrome")
    //WebDriver driver;

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
        //OnStage.theActorCalled("Yasser");
    }
    @Given("^Yasser quiere ir a la pagina de \"([^\"]*)\"$")
    public void quiereIrALaPaginaDe(String url)   {
        //theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));
        //theActorCalled("Yasser").attemptsTo(Open.browserOn(new Home()));
        theActorCalled("Yasser").wasAbleTo(Open.url(url));
    }

    @When("^Agregar un nuevo registro ingresando \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void agregarUnNuevoRegistroConDatosDeUsuarioYUsuarioNuevo(String firstname,String lastname,String email, String age, String salary, String department) {
        theActorInTheSpotlight().attemptsTo(registroTask.en(firstname,lastname,email,age,salary,department));
    }

    @Then("^Se valida que el usuario se cree exitosamente y se elimina$")
    public void seValidaQueElUsuarioSeCreeExitosamenteYSeElimina() {
    }
}
