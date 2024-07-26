package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_locators {
    WebDriver d;
    Login_locators(WebDriver d)
    {
        this.d=d;
    }
    private By username= By.id("login-username");
    private By password= By.id("login-password");
    private By login_button=By.id("js-login-btn");
    public String error_msgg(String username1,String paswword1) throws InterruptedException {
        WebDriver d=new EdgeDriver();
        d.get("https://app.vwo.com/#/login");
        d.findElement(username).sendKeys(username1);
        d.findElement(password).sendKeys(paswword1);
        d.findElement(login_button).click();
        Thread.sleep(1000);
       String error_msg= d.findElement(By.id("js-notification-box-msg")).getText();
        return error_msg;
    }
}
