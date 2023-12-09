package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomePageStepdef extends HomePage {

    // Step definition for navigating to the Wilko website
    @Given("User navigates to the Wilko website")
    public void user_navigates_to_the_wilko_website() {
        navigate_to_wilko_website();
    }

    // Step definition for clicking on the account button
    @Given("User clicks on account button")
    public void user_clicks_on_account_button() {
        click_on_acc_button();
    }

    // Step definition for asserting successful login
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        logged_in_successfully();
    }
}