package Pages;

import PageFactory.loginpage_PF;
import base.commontoallpage;
import base.commontoalltests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static driver.drivermanager.d;

public class testvwologin_PF_DM extends commontoalltests {
    @Test
    public void testloginnegivevwo() throws InterruptedException, IOException {

        loginpage_PF loginpage_pf=new loginpage_PF(d);
        loginpage_pf.openvwologinurl();
       String errormsg= loginpage_pf.loginintoinvalidcredentails();
        Assert.assertEquals(errormsg,"Your email, password, IP address or location did not match");

    }


}
