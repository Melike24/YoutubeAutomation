package com.youtube;

import com.youtube.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }
    @Test
    public void test1(){
        driver.get("https://www.youtube.com/watch?v=0piQkIDFds0&list=PL9ahnwCAh4IBGyuvfU2Hl-LU3Ilc534Yt&index=20");



        driver.findElement(By.xpath("text")).click();
    }
}
