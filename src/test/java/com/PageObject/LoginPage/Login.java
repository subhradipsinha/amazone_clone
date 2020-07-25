package com.PageObject.LoginPage;

import com.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.xml.bind.SchemaOutputResolver;
import java.util.concurrent.TimeUnit;

public class Login extends TestBase {
    @Test
    public void init() throws Exception {
        //Call URL
        TestBase.initilize();
        System.out.println("URL Call");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void Mouse_Hover() throws Exception {
        //Retrieve WebElement 'Signin' to perform mouse hover
        WebElement sing_in = TestBase.byXpath("SingIn_Xpath");
        if(sing_in.isDisplayed()){
            sing_in.click();
            System.out.println("click");
            Thread.sleep(3000);

            SoftAssert softAssert= new SoftAssert();
            System.out.println("Retrieve WebElement 'Signin' to perform mouse hover");
            softAssert.assertTrue(false);
            System.out.println("softAssert Method Was Executed");
        }else {
            System.out.println("Retrieve WebElement 'Signin' to perform mouse hover not working");
            SoftAssert softAssert= new SoftAssert();
            System.out.println("Retrieve WebElement 'Signin' to perform mouse hover not working");
            softAssert.assertTrue(true);
            System.out.println("softAssert Method Was Executed");
        }
        }


    @Test
    public void softassert()throws Exception{
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        String Accual = driver.getTitle();
        String Expect = "Amazon Sign In";
        softAssert.assertEquals(Accual,Expect,"First Test fail");
        softAssert.assertAll();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }
    @Test
    public void Email()throws Exception{
        TestBase.byXpath("UserName_Xpath").sendKeys(TestData.getProperty("UserName"));
        TestBase.byXpath("Continue_button").click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }
    @Test
    public void Password()throws Exception{
        TestBase.byXpath("Password_Xpath").sendKeys(TestData.getProperty("Password"));
        Thread.sleep(3000);
        TestBase.byXpath("Log_In_Xpath").click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Thread.sleep(5000);
    }
}
