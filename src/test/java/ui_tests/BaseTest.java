package ui_tests;

import driver_manager.DriverManager;
import org.testng.annotations.AfterTest;

public class BaseTest {
  //  protected WebDriver driver = DriverManager.getDriver();

    @AfterTest
    public void kill(){
        DriverManager.closeDriver();
        System.out.println("AfterTest method kill() in BaseTest class in ui_tests package is run");

    }
}
