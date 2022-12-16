package com.demoqa.tasks;

import com.demoqa.userinferfaces.BotonesAlertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Task;

public class AlertsTask2 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BotonesAlertas.SEE_ALERT)
        );
    }
    public static AlertsTask2 alertsTask2(){ return Tasks.instrumented(AlertsTask2.class);
    }
}

