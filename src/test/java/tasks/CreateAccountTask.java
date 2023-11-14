package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SetCheckbox;
import ui.AccountCreationUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateAccountTask implements Task {

    private final String name;
    private final String lastName;
    private final int phone;
    private final String email;
    private final String password;
    private final String department;
    private final String city;
    private final String streetType;
    private final String street;
    private final String addressNumber;
    private final String addressEnd;
    private final String additionalInfoAddress;

    public CreateAccountTask(String name, String lastName, int phone, String email, String password, String department, String city, String streetType, String street, String addressNumber, String addressEnd, String additionalInfoAddress) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.department = department;
        this.city = city;
        this.streetType = streetType;
        this.street = street;
        this.addressNumber = addressNumber;
        this.addressEnd = addressEnd;
        this.additionalInfoAddress = additionalInfoAddress;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.name).into(AccountCreationUI.NAMEINPUT));
        actor.attemptsTo(Enter.theValue(this.lastName).into(AccountCreationUI.LASTNAMEINPUT));
        actor.attemptsTo(Enter.theValue(this.phone + "").into(AccountCreationUI.PHONEINPUT));
        actor.attemptsTo(Enter.theValue(this.email).into(AccountCreationUI.EMAILINPUT));
        actor.attemptsTo(Enter.theValue(this.email).into(AccountCreationUI.CONFIRMEMAILINPUT));
        actor.attemptsTo(Enter.theValue(this.password).into(AccountCreationUI.PASSWORDINPUT));
        actor.attemptsTo(Enter.theValue(this.password).into(AccountCreationUI.CONFIRMPASSWORDINPUT));
        actor.attemptsTo(SelectFromOptions.byVisibleText(this.department).from(AccountCreationUI.DEPARTMENTSELECT));
        actor.attemptsTo(SelectFromOptions.byVisibleText(this.city).from(AccountCreationUI.CITYSELECT));
        actor.attemptsTo(SelectFromOptions.byVisibleText(this.streetType).from(AccountCreationUI.STREETTYPEINPUT));
        actor.attemptsTo(Enter.theValue(this.street).into(AccountCreationUI.STREETINPUT));
        actor.attemptsTo(Enter.theValue(this.addressNumber).into(AccountCreationUI.ADDRESSNUMBERINPUT));
        actor.attemptsTo(Enter.theValue(this.addressEnd).into(AccountCreationUI.ADDRESSENDINPUT));
        actor.attemptsTo(Enter.theValue(this.additionalInfoAddress).into(AccountCreationUI.ADDITIONALINFOADDRESSINPUT));
        actor.attemptsTo(SetCheckbox.of(AccountCreationUI.TERMSCHECK).toTrue());
        actor.attemptsTo(Click.on(AccountCreationUI.REGISTERBUTTON));
    }

    public static Performable createAccount(String name, String lastName, int phone, String email, String password, String department, String city, String streetType, String street, String addressNumber, String addressEnd, String additionalInfoAddress){
        return instrumented(CreateAccountTask.class, name, lastName, phone, email, password, department, city, streetType, street, addressNumber, addressEnd, additionalInfoAddress);
    }
}
