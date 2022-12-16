package com.demoqa.userinferfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Elements {
    public static final Target WEBTABLE=Target.the("Seccion Web table").
            locatedBy("     //span[contains(text(),'Web Tables')]");

    public static final Target Add=Target.the("Boton Add").
            locatedBy("    //button[@id=\"addNewRecordButton\"]");

    public static final Target BORRAR1=Target.the("Boton borrar1").
            locatedBy("   //span[@id='delete-record-1']");

    public static final Target BORRAR2=Target.the("Boton borrar2").
            locatedBy("   //span[@id='delete-record-2']");
    public static final Target BORRAR3=Target.the("Boton borrar3").
            locatedBy("   //span[@id='delete-record-3']");
    public static final Target BORRAR4=Target.the("Boton borrar4").
            locatedBy("   //span[@id='delete-record-4']");
}
