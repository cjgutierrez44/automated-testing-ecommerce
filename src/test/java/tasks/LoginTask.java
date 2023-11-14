package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final String email;
    private final String password;

    public LoginTask(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.email).into(LoginUI.EMAILINPUT));
        actor.attemptsTo(Enter.theValue(this.password).into(LoginUI.PASSWORDINPUT));
        actor.attemptsTo(Click.on(LoginUI.ENTERBUTTON));
    }

    public static Performable login(String name, String password){
        return instrumented(LoginTask.class, name, password );
    }
}
