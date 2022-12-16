package com.demoqa.tasks;

import com.demoqa.userinferfaces.Elements;
import com.demoqa.userinferfaces.Home;
import com.demoqa.userinferfaces.Registration_Form;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import org.springframework.scheduling.TaskScheduler;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class registroTask implements Task  {

    private String firstname;

    private String lastname;

    private String email;

    private String age;

    private String salary;

    private String department;

    private Target fieldfirstname;

    private Target fieldlastname;

    private Target fieldemail;

    private Target fieldage;

    private Target fieldsalary;

    private Target fielddepartment;

    public registroTask (String firstname,String lastname,String email,String age, String salary, String department,Target...targets) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.fieldfirstname = Registration_Form.FIRSTNAME;
        this.fieldlastname = Registration_Form.LASTNAME;
        this.fieldemail = Registration_Form.EMAIL;
        this.fieldage = Registration_Form.AGE;
        this.fieldsalary = Registration_Form.SALARY;
        this.fielddepartment = Registration_Form.DEPARTMENT;
    }
        public static registroTask en(String firstname, String lastname,String email, String age, String salary, String department,Target...targets) {
            return Tasks.instrumented(registroTask.class, firstname,lastname,email,age,salary,department,targets);
        }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Home.Elements),
                Click.on(Home.Elements ),
                Click.on(Elements.WEBTABLE ),
                Click.on(Elements.Add ),
                Enter.theValue(firstname).into(fieldfirstname),
                Enter.theValue(lastname).into(fieldlastname),
                Enter.theValue(email).into(fieldemail),
                Enter.theValue(age).into(fieldage),
                Enter.theValue(salary).into(fieldsalary),
                Enter.theValue(department).into(fielddepartment),
                //SendKeys.of("Yasser").into(Registration_Form.FIRSTNAME),
                //SendKeys.of("Pacheco").into(Registration_Form.LASTNAME),
                //SendKeys.of("ingyasserpacheco@gmail.com").into(Registration_Form.EMAIL),
                //SendKeys.of("24").into(Registration_Form.AGE ),
                //SendKeys.of("1200000").into(Registration_Form.SALARY),
                //SendKeys.of("Ingenieria").into(Registration_Form.DEPARTMENT),
                Click.on(Registration_Form.SUBMIT),
                Click.on(Elements.BORRAR1),
                Click.on(Elements.BORRAR2),
                Click.on(Elements.BORRAR3),
                Click.on(Elements.BORRAR4)
                );
    }

}
