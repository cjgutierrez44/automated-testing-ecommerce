package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.LoginUI;

public class LoginQuestion {

    public static Question<String> formTitle(){
        return actor -> Text.of(LoginUI.FORMTITLE).answeredBy(actor);
    }

}
