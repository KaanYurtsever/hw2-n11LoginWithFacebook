package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.navigation.login.LoginWithFacebook;
import starter.n11.navigation.tasks.NavigateTo;
import starter.n11.navigation.user_interface.n11HomePageElements;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class N11LoginStepDefinitions {

    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;

    @Given("user launch browser and open the main page")
    public void user_launch_browser_and_open_the_main_page() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11HomePage());

    }
    @When("user logged in with facebook")
    public void user_logged_in_with_facebook() {
        actor.attemptsTo(LoginWithFacebook.loginThePage("lespazalte@vusra.com","user1234"));
    }
    @Then("user logged in successfully")
    public void user_logged_in_successfully() {


        actor.should(
                GivenWhenThen.seeThat(the(n11HomePageElements.USERNAME_LINK)
                        ,containsText("Lespazalte")));

    }


}
