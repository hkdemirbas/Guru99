package pages;

import org.junit.Before;
import org.junit.Test;
import util.Driver;

public class TestMain extends Driver {
    BankHomePage bankHome;

    @Before
    public void before() {
        bankHome = new BankHomePage(driver);
    }

    @Test
    public void test(){
        bankHome.Login();
        driver.close();
    }

}
