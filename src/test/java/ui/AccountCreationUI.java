package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountCreationUI {
    public static final Target NAMEINPUT = Target.the("Name input").located(By.id("name"));

    public static final Target LASTNAMEINPUT = Target.the("Last name input").located(By.id("lastName"));

    public static final Target PHONEINPUT = Target.the("Phone input").located(By.id("phone"));

    public static final Target EMAILINPUT = Target.the("Email input").located(By.id("email"));
    public static final Target CONFIRMEMAILINPUT = Target.the("Confirm email input").located(By.id("emailC"));

    public static final Target PASSWORDINPUT = Target.the("Password input").located(By.id("password"));
    public static final Target CONFIRMPASSWORDINPUT = Target.the("Confirm password input").located(By.id("passwordC"));

    public static final Target DEPARTMENTSELECT = Target.the("Department select").located(By.id("department"));

    public static final Target CITYSELECT = Target.the("City select").located(By.id("city"));

    public static final Target STREETTYPEINPUT = Target.the("Street type input").located(By.id("streetType"));

    public static final Target STREETINPUT = Target.the("Street input").located(By.id("street"));

    public static final Target ADDRESSNUMBERINPUT = Target.the("Address number input").located(By.id("number"));

    public static final Target ADDRESSENDINPUT = Target.the("Arrdress end input").located(By.id("house"));

    public static final Target ADDITIONALINFOADDRESSINPUT = Target.the("Additional address info input").located(By.id("infoAddress"));
    public static final Target TERMSCHECK = Target.the("Terms and conditions check").located(By.id("terms"));
    public static final Target REGISTERBUTTON = Target.the("Register button").located(By.xpath("/html/body/div/div[1]/form/div[10]/div/button"));

}
