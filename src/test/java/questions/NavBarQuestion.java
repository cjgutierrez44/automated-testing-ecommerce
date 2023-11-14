package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.LoginUI;
import ui.NavBarUI;

public class NavBarQuestion {
    public static Question<String> navBarUserName(){
        return actor -> Text.of(NavBarUI.USERNAME).answeredBy(actor);
    }
}
