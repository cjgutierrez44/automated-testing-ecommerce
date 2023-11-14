package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavBarUI {
    public static final Target USERNAME = Target.the("Email input").located(By.xpath("/html/body/nav/div/div/ul[2]/li[3]/a"));
    public static final Target SHOPPINGCART = Target.the("Shopping cart").located(By.id("prueba"));

}
