package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriver {
    public static WebDriver driver;

    // Initialization method to set up the ChromeDriver
    @Before
    public static void init() {
//        System.setProperty("webdriver.http.factory", "jdk-http-client");
//        //In Windows System - System.setProperty("webdriver.chrome.driver","./src/main/java/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();

        WebDriverManager.chromedriver().setup();
        // Set the Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // Create a new instance of ChromeDriver with the provided options
        driver = new ChromeDriver(options);
    }


    // Cleanup method to close the driver after each scenario
    @After
    public void close(){
        this.driver.close();
    }
}