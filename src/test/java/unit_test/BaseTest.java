package unit_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test method was started");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test method was started");
    }
}
