package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.BasePage;

public class BankHomePage extends BasePage {
    public BankHomePage(WebDriver driver) {
        super(driver);
    }

    //Elements
    By txtUserID = By.xpath("//input[@name='uid']");
    By txtPassword = By.xpath("//input[@name='password']");
    By btnLogin = By.xpath("//input[@name='btnLogin']");
    By btnReset = By.cssSelector("input[name=btnReset']");

    public BankHomePage Login() {
        writeText(txtUserID, 0, "test");
        writeText(txtPassword, 0, "123456");
        click(btnLogin);
        return this;
    }
}
