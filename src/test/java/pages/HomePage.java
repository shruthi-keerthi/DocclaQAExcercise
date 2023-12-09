package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import static utility.BrowserDriver.driver;

public class HomePage {

    // URL of the Wilko website
    public static String page = "https://www.wilko.com/en-uk/";

    // Cookie acceptance button locator
    public static String accept_cookies = "onetrust-accept-btn-handler";

    // Account button locator
    public static String account_button = "body > div.page > header > div > div > div.navigation.js-navigation--middle.navigation__container > div > div.nav__right > ul > li:nth-child(2) > div > a.navigation-account-link.nav__link--anonymous.js-nav__links--anonymous.nav__link--action";

    // Method to navigate to Wilko website
    public void navigate_to_wilko_website(){
        driver.get(page);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(accept_cookies)).click();
    }

    // Method to click on the account button
    public void click_on_acc_button(){
        driver.findElement(By.cssSelector(account_button)).click();
    }

    // Method to assert successful login
    public void logged_in_successfully(){
        Assert.assertEquals(driver.getTitle(),"Order History | wilko.com");
    }
}
