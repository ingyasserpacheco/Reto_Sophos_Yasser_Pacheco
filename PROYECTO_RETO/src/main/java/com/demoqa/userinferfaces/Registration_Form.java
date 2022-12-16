package com.demoqa.userinferfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Registration_Form {
    public static final Target FIRSTNAME = Target.the("Campo first name").
            locatedBy("//input[@id='firstName']");

    public static final Target LASTNAME = Target.the("Campo last name").
            locatedBy("//input[@id='lastName']");

    public static final Target EMAIL = Target.the("Campo email").
            locatedBy("//input[@id='userEmail']");

    public static final Target AGE = Target.the("Campo age").
            locatedBy("//input[@id='age']");

    public static final Target SALARY = Target.the("Campo salary").
            locatedBy("//input[@id='salary']");

    public static final Target DEPARTMENT = Target.the("Campo department").
            locatedBy("//input[@id='department']");

    public static final Target SUBMIT=Target.the("Campo submit").
            locatedBy("    //button[@id='submit']");

}
