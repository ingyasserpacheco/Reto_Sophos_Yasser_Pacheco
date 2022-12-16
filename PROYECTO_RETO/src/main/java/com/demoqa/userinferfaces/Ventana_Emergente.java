package com.demoqa.userinferfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Ventana_Emergente extends PageObject {

    public static Performable accept(){
        return Task.where("Se hace clic en un boton",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept());
    }

    public static Performable cancel(){
        return Task.where("Confirmas la accion?",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss());
    }

    public static Performable Text(){
        return Task.where("Porfavor ingresa tu nombre",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys("Yasser Pacheco"));
    }
}
