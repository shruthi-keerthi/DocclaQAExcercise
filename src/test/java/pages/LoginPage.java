package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utility.BrowserDriver.driver;

public class LoginPage {

    // Locators for email address, password, login button, and error message
    public static String email_address = "j_username";
    public static String password = "j_password";
    public static String login_button = "#loginForm > fieldset > button";
    public static String error_message = "body > div.page > main > div > div.global-alerts > div";

    // Method to enter a valid username
    public void enter_username(){
        driver.findElement(By.id(email_address)).sendKeys("test.user@gmail.com");
    }

    // Method to enter a valid password
    public void enter_password(){
        driver.findElement(By.id(password)).sendKeys("Password123");
    }

    // Method to enter an invalid password
    public void enter_invalid_password(){
        driver.findElement(By.id(password)).sendKeys("pass");
    }

    // Method to click on the login button
    public void click_on_login_button(){
        driver.findElement(By.cssSelector(login_button)).click();
    }

    // Method to assert that the user failed to log in and sees an error message
    public void user_failed_to_login(){
        WebElement errorMessageElement = driver.findElement(By.cssSelector(error_message));
        String actual_error_message = errorMessageElement.getText();
        String expected_error_message = "Sorry, we couldn't verify your username and password. Please check that you have entered them correctly";
        Assert.assertTrue(actual_error_message.contains(expected_error_message));
    }

}
