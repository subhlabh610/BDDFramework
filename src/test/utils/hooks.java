package utils;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class hooks {

    private  WebDriver driver;
    PropReader propReader;
    Properties prop;

    @Before(order = 0)
    public void readPropFile() {
        prop=propReader.initProp();
    }

    @Before(order = 1)
    public void launchBrowser(){
        driver=DriverFactory.getDriverInstance();
        driver.get(prop.getProperty("sit.url"));
    }

    @After(order = 0)
    public void quitBrowser(){
        driver.quit();
    }

}
