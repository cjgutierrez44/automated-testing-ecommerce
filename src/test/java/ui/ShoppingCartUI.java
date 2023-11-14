package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartUI {
    public static final Target FINALIZEPURCHASEBUTTON = Target.the("Finalize purchase button").located(By.xpath("/html/body/div[1]/div[2]/a"));
}
