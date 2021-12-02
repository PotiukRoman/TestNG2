package ui_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{
    @Test
    public void checkYandexStartPage(){
        driver.get("https://www.yahoo.com/");
    }

    @Test
    public void checkGoogleStartPage() throws InterruptedException {
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//input[@aria-label='Пошук']")).sendKeys("Hi there guy");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
    }
}
