package com.demoqa.userinferfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class Home extends PageObject {
    public static final Target Elements=Target.the("Seccion elements").
            locatedBy("//h5[contains(text(),'Elements')]");

    public static final Target WIDGET=Target.the("Seccion widget").
            locatedBy("    //h5[contains(text(),'Widgets')]");

    public static final Target ALERT_FRAME_WINDOWS=Target.the("Seccion alert, frame & windows").
            locatedBy("    //h5[contains(text(),'Alerts, Frame & Windows')]");

}
