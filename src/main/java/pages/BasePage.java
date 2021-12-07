package pages;

import driver_manager.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BasePage {

    protected String startPage = "https://auto.ria.com/uk/";

    protected WebDriver driver;

    public BasePage() {
        System.out.println("Init driver before Login, Start page object is created, DriverManager.getDriver()");
        this.driver = DriverManager.getDriver();

    }

    public WebElement findByXpath(String xpath, Duration duration) {
        System.out.println("findByXpath method is invoked");
        System.out.println("Duration xpath = "+ duration.getSeconds());
        return driver.findElement( waitForElementVisible( By.xpath(xpath), duration.getSeconds() ) );

    }

    public WebElement findByCss(String css, Duration duration) {
        System.out.println("findByCss method is invoked");
        System.out.println("Duration css = "+ duration.getSeconds());
        return driver.findElement( waitForElementVisible( By.cssSelector(css), duration.getSeconds() ) );

    }

    //settings  fluent wait  public class WebDriverWait extends FluentWait<WebDriver>
    private WebDriverWait getWaiter(long timeOutInSecond) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutInSecond);
        webDriverWait.ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class);
        return webDriverWait;
    }

    // the method will work with explicit expectations
    public By waitForElementVisible(By findStrategy, long timeOutInSecond) {
        getWaiter(timeOutInSecond).until(visibilityOfElementLocated(findStrategy));
        return findStrategy;
    }

    public StartPage goToStartPage() {
        DriverManager.getDriver().get(startPage);
        return new StartPage();
    }


}
