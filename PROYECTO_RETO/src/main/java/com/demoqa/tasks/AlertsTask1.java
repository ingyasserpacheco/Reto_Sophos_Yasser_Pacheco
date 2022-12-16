package com.demoqa.tasks;
import com.demoqa.userinferfaces.BotonesAlertas;
import com.demoqa.userinferfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AlertsTask1 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Home.ALERT_FRAME_WINDOWS),
                Click.on(Home.ALERT_FRAME_WINDOWS),
                Scroll.to(BotonesAlertas.ALERT),
                Click.on(BotonesAlertas.ALERT)
                //Click.on(BotonesAlertas.SEE_ALERT),
                //Click.on(BotonesAlertas.ALERT5S),
                //Click.on(BotonesAlertas.CONFIRM ),
                //Click.on(BotonesAlertas.PROMPT )
        );
    }
    public static AlertsTask1 alertsTask1(){ return Tasks.instrumented(AlertsTask1.class);
    }
}
