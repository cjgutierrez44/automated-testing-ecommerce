package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Feature;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LoginQuestion;
import questions.NavBarQuestion;
import tasks.CreateAccountTask;
import tasks.LoginTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SuccessfulCreateAccountStepDefinition {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user is in the creation account page")
    public void the_user_is_in_the_creation_account_page() {
        theActorCalled("Usuario").attemptsTo(
                Open.url("http://192.168.1.10:5000/register")
        );
    }
    @When("completes the account creation form with data {string}, {string}, {int}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and clicks the Register button")
    public void completes_the_account_creation_form_with_data_and_clicks_the_register_button(String name, String lastName, Integer phone, String email, String password, String department, String city, String streetType, String street, String addressNumber, String addressEnd, String additionalInfoAddress) {
        theActorCalled("Usuario").attemptsTo(
                CreateAccountTask.createAccount(name, lastName, phone, email, password, department, city, streetType, street, addressNumber, addressEnd, additionalInfoAddress)
        );
    }
    @Then("the account should be created successfully")
    public void the_account_should_be_created_successfully() {
        theActorInTheSpotlight().should(
                seeThat("Is redirected to login page", LoginQuestion.formTitle(), equalTo("Ingresa a tu cuenta"))
        );
    }
    @Then("should have access to the ecommerce with credentials {string} and {string}")
    public void should_have_access_to_the_ecommerce_with_credentials_and(String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                LoginTask.login(email, password)
        );
    }
    @Then("should see his name in the nav bar {string}")
    public void should_see_his_name_in_the_nav_bar(String name) {
        theActorInTheSpotlight().should(
                seeThat("His name is in the nav bar menu", NavBarQuestion.navBarUserName(), equalTo(name))

        );
    }


}
