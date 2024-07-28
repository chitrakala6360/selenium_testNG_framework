package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases {
        @Test
        public void testcaseneg1() throws InterruptedException {
            WebDriver d=new EdgeDriver();
            Login_locators L=new Login_locators(d);
           String errorText= L.error_msgg("chitra","chitra@123");
            System.out.println(errorText);
            Assert.assertEquals(errorText,"Your email, password, IP address or location did not match");
        }
    @Test
    public void testcaseneg2() throws InterruptedException {
        WebDriver d=new EdgeDriver();
        Login_locators L=new Login_locators(d);
        String errorText= L.error_msgg("chitra","chitra@1");
        System.out.println(errorText);
        Assert.assertEquals(errorText,"Your email, password, IP address or location did not match");

    }

}
