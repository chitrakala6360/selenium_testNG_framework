package PageFactory;

import base.commontoallpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.PropertyReader;

import java.io.IOException;

public class loginpage_PF extends commontoallpage {

    public loginpage_PF(WebDriver d) {
        PageFactory.initElements(d,this);
    }
    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private WebElement error_message;

    public String loginintoinvalidcredentails() throws InterruptedException, IOException {
      enterInput(username, PropertyReader.readkey("invalid_username"));
      enterInput(password,PropertyReader.readkey("invalid_password"));
      clickelement(signButton);
        signButton.click();
        Thread.sleep(1000);

        return error_message.getText();
}}
