package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileReader;
import java.util.Properties;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initDriverInstance() {
        try {
            FileReader fileReader = new FileReader("");
            Properties prop = new Properties();
            prop.load(fileReader);
            String browserType =prop.getProperty("browserName");
            if (driver != null) {
                switch (browserType.toLowerCase()) {
                    case "chrome":
                        driver = new ChromeDriver();
                        break;
                    case "firefox":
                        driver = new FirefoxDriver();
                        break;
                    case "ie":
                        driver = new EdgeDriver();
                        break;
                    default:
                        System.out.println("Please provide valid browser: Chrome, firefox, Edge");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return driver;
    }

    public static WebDriver getDriverInstance(){
        return initDriverInstance();
    }
}
