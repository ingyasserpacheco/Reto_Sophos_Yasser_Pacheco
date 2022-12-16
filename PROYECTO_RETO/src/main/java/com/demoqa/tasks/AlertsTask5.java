package com.demoqa.tasks;

import com.demoqa.userinferfaces.BotonesAlertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AlertsTask5 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BotonesAlertas.PROMPT )
        );
    }
    public static AlertsTask5 alertsTask5(){ return Tasks.instrumented(AlertsTask5.class);
    }
}
