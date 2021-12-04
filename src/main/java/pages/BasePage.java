package pages;

import driver_manager.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BasePage {

    protected String startPage = "https://mega.nz/";

    protected WebDriver driver;

    public BasePage() {
        System.out.println("Init driver before Login, Start page object is created, DriverManager.getDriver()");
        this.driver = DriverManager.getDriver();

    }

    public WebElement findByXpath(String xpath, Duration duration) {
        System.out.println("findByXpath method is invoked");
        return driver.findElement(waitForElementVisible(By.xpath(xpath), duration.getSeconds()));

    }

    public WebElement findByCss(String css, Duration duration) {
        System.out.println("findByCss method is invoked");
        return driver.findElement(waitForElementVisible(By.cssSelector(css), duration.getSeconds()));

    }

    //налаштування Побіжне оочікування
    private WebDriverWait getWaiter(long timeOutInSecond) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutInSecond);
        webDriverWait.ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
        return webDriverWait;
    }

    // метод буде працювати з явним очікуванням
    public By waitForElementVisible(By findStrategy, long timeOutInSecond) {
        getWaiter(timeOutInSecond).until(visibilityOfElementLocated(findStrategy));
        return findStrategy;
    }

    public StartPage goToStartPage() {
        DriverManager.getDriver().get(startPage);
        return new StartPage();
    }
}
