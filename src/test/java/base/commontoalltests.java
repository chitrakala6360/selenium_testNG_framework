package base;

import driver.drivermanager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class commontoalltests {
    @BeforeMethod
    public void setup(){
        drivermanager.init();
    }

    @AfterMethod
    public void tearDown(){
        drivermanager.down();
    }
}
