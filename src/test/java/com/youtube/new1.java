package com.youtube;

import com.youtube.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class new1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");

        BrowserUtils.waitFor(5);

        ((JavascriptExecutor) driver).executeScript("window.open()");
        BrowserUtils.waitFor(5);

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        driver.navigate().to("https://www.amazon.com/");
        BrowserUtils.waitFor(5);

        driver.switchTo().window((String) tabs.get(0));
        BrowserUtils.waitFor(5);
        driver.quit();
    }
}
