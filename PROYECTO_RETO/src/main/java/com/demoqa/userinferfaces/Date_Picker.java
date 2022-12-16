package com.demoqa.userinferfaces;
import net.serenitybdd.screenplay.targets.Target;

public class Date_Picker {

    public static final Target DATE_PICKER=Target.the("boton seccion date picker").
            locatedBy("    //span[contains(text(),'Date Picker')]");
    public static final Target SELECTDATE=Target.the("campo select date").
            locatedBy("    #datePickerMonthYearInput");

    public static final Target FECHA=Target.the("eleccion fecha").
            locatedBy("    //div[contains(text(),'14')]");
    public static final Target DATE_AND_TIME=Target.the("campo date and time").
            locatedBy("    #dateAndTimePickerInput");

    public static final Target FECHA2=Target.the("eleccion fecha ").
            locatedBy("    //div[contains(text(),'14')]");

    public static final Target HORA=Target.the("eleccion hora").
            locatedBy("    //li[contains(text(),'17:00')]");

}
