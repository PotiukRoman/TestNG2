package ui_tests;

import Calculator.Calculator;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class GoogleTest extends BaseTest{

    @Test(description = "Check message about wrong password/login")
    public void checkIncorrectPasswordMsg(){
        String expectedMsg = "Invalid email and/or password. Please try again.";

        LoginPage errorMsgWindow = new LoginPage()
                .goToStartPage()
                .clickOnEnterButton()
                .setLogin("qwert@eee.www")
                .setPassword("qwwerrtty")
                .clickOnSubitButton();

        String actualMsg = errorMsgWindow.getTextFromElement();

        Assert.assertEquals(actualMsg,expectedMsg,"Incorrect message about wrong password/login");
    }
}


// #msgDialog-title
// //h3[contains(text(),'Invalid email and/or password. Please try again.')]