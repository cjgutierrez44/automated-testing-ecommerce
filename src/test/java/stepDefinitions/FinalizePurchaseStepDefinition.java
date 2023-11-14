package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.FinalizePurchaseQuestion;
import questions.NavBarQuestion;
import tasks.LoginTask;
import ui.NavBarUI;
import ui.ShoppingCartUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class FinalizePurchaseStepDefinition {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user has an active session")
    public void the_user_has_an_active_session() {
        theActorCalled("Usuario").attemptsTo(
                Open.url("http://192.168.1.10:5000/login"),
                LoginTask.login("tig@gmail.com", "asd123")
        );
        theActorInTheSpotlight().should(
                seeThat("his name is in the header", NavBarQuestion.navBarUserName(), equalTo("Tig"))
        );
    }
    @When("clicks on the shopping cart button")
    public void clicks_on_the_shopping_cart_button() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NavBarUI.SHOPPINGCART)
        );
    }
    @When("click the finalize purchase button")
    public void click_the_finalize_purchase_button() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(ShoppingCartUI.FINALIZEPURCHASEBUTTON)
        );
    }
    @Then("is redirected to purchase resume page")
    public void is_redirected_to_purchase_resume_page() {
        theActorInTheSpotlight().should(
                seeThat("The title of the page is", FinalizePurchaseQuestion.formTitle(), equalTo("Finaliza la compra"))
        );
    }
}
