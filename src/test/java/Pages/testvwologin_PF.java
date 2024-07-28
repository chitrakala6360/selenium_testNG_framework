package Pages;

import PageFactory.loginpage_PF;
import base.commontoallpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class testvwologin_PF extends commontoallpage {
    @Test
    public void testloginnegivevwo() throws InterruptedException, IOException {
     WebDriver d=new EdgeDriver();
     d.get("https://app.vwo.com/#/login");
        loginpage_PF loginpage_pf=new loginpage_PF(d);
       String errormsg= loginpage_pf.loginintoinvalidcredentails();
        Assert.assertEquals(errormsg,"Your email, password, IP address or location did not match");

    }


}
