package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepdef extends LoginPage {

    // Step definition for entering valid login credentials
    @When("User enters valid login credentials")
    public void user_enters_valid_login_credentials() {
        enter_username();
        enter_password();
    }

    // Step definition for clicking on the login button
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        click_on_login_button();
    }

    // Step definition for entering invalid login credentials
    @When("User enters invalid login credentials")
    public void user_enters_invalid_login_credentials() {
        enter_username();
        enter_invalid_password();
    }

    // Step definition for asserting the presence of an error message
    @Then("User should be able to see error message")
    public void user_should_be_able_to_see_error_message() {
        user_failed_to_login();
    }
}
