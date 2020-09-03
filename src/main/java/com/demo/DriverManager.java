package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

/**
 * @Author Subhradip sinha
 * @start Date: 07-01-2020
 *
 */
public class DriverManager extends ConfigarationManager {

    public static WebDriver driver;


    public static void browser() throws Exception {

        ConfigarationManager.conficfile();
        String Url = ConfigarationManager.config.getProperty("URLTest");
        String browsername = ConfigarationManager.config.getProperty("browser");
        if (browsername.equalsIgnoreCase("Chrome")) {

            System.setProperty("webdriver.chrome.driver", "E:\\sw\\Homework1\\amazone-master\\Driver3\\chromedriver.exe");
            System.out.println("hit Chrome Driver");
            driver = new ChromeDriver();
            Thread.sleep(5000);
            System.out.println("Chrome Driver open");
            driver.manage().window().maximize();

        }
        driver.get(Url);
        System.out.println("URL HIT");
        Thread.sleep(5000);

//        WebDriverWait wait = new WebDriverWait(driver,120);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter User Name']")));
//        System.out.println("URL Open");

    }
}