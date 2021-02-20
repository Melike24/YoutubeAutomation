package com.youtube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        Thread.sleep(3000);

         WebElement a =driver.findElement(By.xpath("//*[@id=\"introAgreeButton\"]/span/span"));
         a.click();

    }
}
