package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class TESTVWOLOGIN_POM

{
    @Test
    public void testLoginNegativeVWO(){
        WebDriver driver = new EdgeDriver();
        Loginpage_POM loginPagePom = new Loginpage_POM(driver);
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds("admin@gmail.com","admin");
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Test
    public void testLoginNegativeVWO2(){
        WebDriver driver = new EdgeDriver();
        Loginpage_POM loginPagePom = new Loginpage_POM(driver);
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds("pramod@gmail.com","admin");
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }
}
