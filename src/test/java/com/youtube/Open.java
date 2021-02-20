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

        driver.get("https://www.youtube.com/watch?v=dlFs2y4c3Mo");

        BrowserUtils.waitFor(3);
         driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/paper-dialog/yt-upsell-dialog-renderer/div/div[3]/div[1]/yt-button-renderer/a/paper-button")).click();
        BrowserUtils.waitFor(3);
        driver.switchTo().frame("iframe");
        BrowserUtils.waitFor(3);
        driver.findElement(By.xpath("/html/body/div/c-wiz/div[2]/div/div/div/div/div[2]/form/div/span/span")).click();


    }
}
