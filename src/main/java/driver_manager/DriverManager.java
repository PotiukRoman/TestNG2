package driver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;

    private static void setDriver(){
        driver = new ChromeDriver(WebDriverConfig.configChrome());
        System.out.println("driver is set as ChromeDriver");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// використ неявне очікування погана практика
    }

    public static WebDriver getDriver() {
        System.out.println("Driver before set = " + driver);
        if(driver == null){
            setDriver();
            System.out.println("Driver after set = " + driver);
        }
        return driver;
    }

    public static void closeDriver(){
      //  driver.close();
      //  driver.quit();
    }
}
