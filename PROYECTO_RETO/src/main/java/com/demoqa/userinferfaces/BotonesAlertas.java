package com.demoqa.userinferfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BotonesAlertas extends PageObject {

    public static final Target ALERT=Target.the("boton seccion alert").
            locatedBy("    //span[contains(text(),'Alerts')]");

    public static final Target SEE_ALERT=Target.the("boton see alert").
            locatedBy("    //button[@id='alertButton']");

    public static final Target ALERT5S=Target.the("boton alert 5 seconds").
            locatedBy("    //button[@id='timerAlertButton']");

    public static final Target CONFIRM=Target.the("boton alert confirm").
            locatedBy("    //button[@id='confirmButton']");

    public static final Target PROMPT=Target.the("boton prompt").
            locatedBy("    //button[@id='promtButton']");

}
