package com.youtube;

import com.youtube.utilities.BrowserUtils;
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
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");

        BrowserUtils.waitFor(3);
         driver.findElement(By.xpath("//*[@class='style-scope yt-button-renderer style-text size-small']")).click();
        BrowserUtils.waitFor(3);
        driver.switchTo().frame("iframe");
        BrowserUtils.waitFor(3);
        driver.findElement(By.xpath("//*[@id=\"introAgreeButton\"]/span/span")).click();

     //driver.findElement(By.xpath("//*[@id=\"search-input\"]")).click();

       // String music = "Marshmello";

        //search.sendKeys(music);


    }
}
