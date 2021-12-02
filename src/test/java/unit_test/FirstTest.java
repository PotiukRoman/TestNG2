package unit_test;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest{

    @Test(groups = "mult test")
    public void checkSomething(){
        System.out.println("Hi");

    }

    @Test(description = "Check some")
    public void checkSome(){
        System.out.println("I am the test method");

    }
}
