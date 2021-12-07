package pages;

import driver_manager.DriverManager;

import java.time.Duration;

public class LoginAutoRioPage extends BasePage{

    protected String startPage = "https://auto.ria.com/uk/";

    public LoginAutoRioPage goToRioStartPage() {
        DriverManager.getDriver().get(startPage);
        return this;
    }

    public LoginAutoRioPage setMarka(){
        findByXpath("//label[@data-text='Марка']", Duration.ofSeconds(10)).click();
        findByXpath("//ul/li/a[contains(text(),'Nissan')]",Duration.ofSeconds(10)).click();

        //   findByXpath("//input[@id='brandTooltipBrandAutocompleteInput-brand']",Duration.ofSeconds(10)).sendKeys("Nissan");
        //   findByXpath("//ul/li/a[contains(text(),'Nissan')]",Duration.ofSeconds(10)).click();
        return this;
    }


    public LoginAutoRioPage setModel(){
        findByXpath("//label[@data-text='Модель']",Duration.ofSeconds(10)).click();
        findByXpath("//ul/li/a[contains(text(),'Patrol')]",Duration.ofSeconds(10)).click();
        return this;
    }

    public LoginAutoRioPage setYearFrom(){
        findByXpath("//select[@id='yearFrom']",Duration.ofSeconds(10)).sendKeys("1981");
        return this;
    }

    public LoginAutoRioPage setYearTo(){
        findByXpath("//select[@id='yearTo']",Duration.ofSeconds(10)).sendKeys("1989");
        return this;
    }

    public LoginAutoRioPage clickOnRioSubitButton(){
        findByXpath("//button[@type='submit']", Duration.ofSeconds(10)).click();
        return this;

    }

    public String getVinCode(){
        return findByXpath("//span[contains(text(),'JN1WRG160U0883171')]",Duration.ofSeconds(10)).getText();
    }
}
