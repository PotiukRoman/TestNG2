package ui_tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class GoogleTest extends BaseTest{

    @Test(description = "Check message about wrong password/login")
    public void checkIncorrectPasswordMsg(){
        new LoginPage().goToStartPage()
                .clickOnEnterButton()
                .setLogin("qwerty@ukr.net")
                .setPassword("12345")
                .clickOnSubitButton();

    }
}
