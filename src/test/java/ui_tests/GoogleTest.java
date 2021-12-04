package ui_tests;

import Calculator.Calculator;
import org.testng.annotations.Test;
import pages.LoginPage;

public class GoogleTest extends BaseTest{

    @Test(description = "Check message about wrong password/login")
    public void checkIncorrectPasswordMsg(){
        new LoginPage().goToStartPage()
                  .clickOnEnterButton()
                .setLogin("kuznecov55@ukr.net")
                .setPassword("kuznecov551803")
                .clickOnSubitButton();

    }
}
