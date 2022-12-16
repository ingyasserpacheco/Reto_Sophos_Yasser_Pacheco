package com.demoqa.tasks;

import com.demoqa.userinferfaces.BotonesAlertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AlertsTask3 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BotonesAlertas.ALERT5S)
        );
    }
    public static AlertsTask3 alertsTask3(){ return Tasks.instrumented(AlertsTask3.class);
    }
}
