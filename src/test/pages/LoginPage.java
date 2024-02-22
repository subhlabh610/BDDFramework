package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    By userNameTxt =By.id("user-name");
    By passwordTxt =By.id("password");
    By loginBtn = By.id("login-button");

    public void loginToApplication(String userName, String password){
        driver.findElement(userNameTxt).sendKeys(userName);
        driver.findElement(passwordTxt).sendKeys(password);
        driver.findElement(loginBtn).click();
    }
}
