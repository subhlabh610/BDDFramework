package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CommonMethods;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    By userNameTxt =By.id("user-name");
    By passwordTxt =By.id("password");
    By loginBtn = By.id("login-button");
    By logoIcon = By.cssSelector(".login_logo");

    public void loginToApplication(String userName, String password){
        try {
            CommonMethods.waitForObject(driver.findElement(logoIcon),20);
            driver.findElement(userNameTxt).sendKeys(userName);
            driver.findElement(passwordTxt).sendKeys(password);
            driver.findElement(loginBtn).click();
            Thread.sleep(10000);
        }catch(Exception e){
            System.out.println("Exception occurred");
        }
    }
}
