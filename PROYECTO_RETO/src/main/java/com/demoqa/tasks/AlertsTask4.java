package com.demoqa.tasks;

import com.demoqa.userinferfaces.BotonesAlertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AlertsTask4 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BotonesAlertas.CONFIRM )
        );
    }
    public static AlertsTask4 alertsTask4(){ return Tasks.instrumented(AlertsTask4.class);
    }
}
