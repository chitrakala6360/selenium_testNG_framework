package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class drivermanager {
    public static WebDriver d;

    public static WebDriver getDriver() {
        return d;
    }

    public static void setDriver(WebDriver d) {
        drivermanager.d = d;
    }
    public static void init(){

        if( d == null){
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--start-maximized");
                    edgeOptions.addArguments("--guest");
                    d = new EdgeDriver(edgeOptions);

            }


        }
        public static void down(){
        if(d!=null){
            d.quit();
            d=null;
        }

        }
    }



