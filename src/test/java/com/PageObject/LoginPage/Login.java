package com.PageObject.LoginPage;

import com.demo.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;



import java.util.concurrent.TimeUnit;

public class Login extends TestBase {
    @Test
    public void init() throws Exception {
        //Call URL
        TestBase.initilize();
        System.out.println("URL Call");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Assert.assertEquals("URL open","URL Not Open","False");

    }




}
