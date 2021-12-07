package pages;

import java.time.Duration;

public class LoginPage extends BasePage{

    public LoginPage setLogin(String login){
        findByCss("#login-name2", Duration.ofSeconds(10)).sendKeys(login);
        return this;

    }

    public LoginPage setPassword(String password){
        findByCss("#login-password2", Duration.ofSeconds(10)).sendKeys(password);
        return this;

    }

    public LoginPage clickOnSubitButton(){
        findByCss("form .mega-button", Duration.ofSeconds(10)).click();
        return this;

    }

    public String getTextFromElement(){
        return findByXpath("//h3[contains(text(),'Invalid email and/or password. Please try again.')]",Duration.ofSeconds(10)).getText();
    }















// //input[@id='brandTooltipBrandAutocompleteInput-brand']

    // //ul/li/a[contains(text(),'Nissan')]

    // //label[@data-text='Марка']

    // //label[@data-text='Модель']

    //  Patrol

    // //option[@value='1981']

    // //select[@id='yearFrom']
    // id='yearTo'
    // //button[@type='submit']
    // JN1WRG160U0883171    //span[contains(text(),'JN1WRG160U0883171')]
}
