package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.FinalizePurchaseUI;
import ui.LoginUI;

public class FinalizePurchaseQuestion {
    public static Question<String> formTitle(){
        return actor -> Text.of(FinalizePurchaseUI.FORMTITLE).answeredBy(actor);
    }
}
