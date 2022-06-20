package util;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    protected static WebDriver driver;
    public static WebDriver driver() {
        return driver;
    }
    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "geckoDriver/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");
        driver = new FirefoxDriver(options);
        driver.navigate().to("https://www.demo.guru99.com/V4");
    }

    public void tearDown(){
        driver.quit();
    }

}