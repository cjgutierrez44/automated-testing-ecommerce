package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target FORMTITLE = Target.the("Form title").located(By.xpath("/html/body/div/div[1]/h1"));
    public static final Target EMAILINPUT = Target.the("Email input").located(By.id("email"));
    public static final Target PASSWORDINPUT = Target.the("Password input").located(By.id("password"));
    public static final Target ENTERBUTTON = Target.the("Enter button").located(By.xpath("/html/body/div/div[1]/form/button"));
}
