package com.demoqa.tasks;

import com.demoqa.userinferfaces.Date_Picker;
import com.demoqa.userinferfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatesTask implements Task  {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Home.WIDGET),
                Click.on(Home.WIDGET),
                Click.on(Date_Picker.DATE_PICKER),
                Click.on(Date_Picker.SELECTDATE),
                Click.on(Date_Picker.FECHA),
                Click.on(Date_Picker.DATE_AND_TIME),
                Click.on(Date_Picker.FECHA2),
                Click.on(Date_Picker.HORA)

        );
    }
        public static DatesTask datesTask(){ return Tasks.instrumented(DatesTask.class);
        }
    }
