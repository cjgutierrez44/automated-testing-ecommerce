package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.NavBarQuestion;
import tasks.LoginTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SuccessfulLoginStepDefinition {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("the user is in the login page")
    public void the_user_is_in_the_login_page() {
        theActorCalled("Usuario").attemptsTo(
                Open.url("http://192.168.1.10:5000/login")
        );
    }
    @When("enter his valid credentials {string} and {string} and clicks on enter button")
    public void enter_his_valid_credentials_and_and_clicks_on_enter_button(String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                LoginTask.login(email, password)
        );
    }
    @Then("he should have access to manage his account {string}")
    public void he_should_have_access_to_manage_his_account(String name) {
        theActorInTheSpotlight().should(
                seeThat("His name in the nav bar", NavBarQuestion.navBarUserName(), equalTo(name))
        );
    }
}
