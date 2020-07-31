package com.PageObject.DashBoardPage;

import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;


public class DashBoard extends TestBase {
    @Test
    public void dashboard() throws Exception {

        Thread.sleep(2000);
        // Search Tab working or Not
        WebElement Search_testbox = TestBase.byXpath("Search_Xpath");
        if(Search_testbox.isDisplayed()){
            Search_testbox.clear();
            Thread.sleep(2000);
            Search_testbox.sendKeys(TestData.getProperty("Mobile_name"));
            Thread.sleep(2000);
            SoftAssert softAssertion= new SoftAssert();
            System.out.println("softAssert Method Was Started");
            softAssertion.assertTrue(false);
            System.out.println("softAssert Method Was Executed");
        }
        else {
            System.out.println("Search Tab not working");
            SoftAssert softAssertion= new SoftAssert();
            System.out.println("softAssert Method Was not Started");
            softAssertion.assertTrue(true);
            System.out.println("softAssert Method Was not Executed");
        }
        //Enter tab
        WebElement Enter_Searchbox = TestBase.byXpath("Enter_Button");
        if(Enter_Searchbox.isDisplayed()){
            Enter_Searchbox.click();
            Thread.sleep(2000);
            SoftAssert softAssertion1= new SoftAssert();
            System.out.println("Enter Button Click");
            softAssertion1.assertTrue(false);
            System.out.println("softAssert Method Was Executed");
        }
        else {
            System.out.println("Enter_Search button not Working");
            SoftAssert softAssertion1= new SoftAssert();
            System.out.println("Enter Button not Click");
            softAssertion1.assertTrue(true);
            System.out.println("softAssert Method Was Executed");
        }
        Thread.sleep(2000);
        ((JavascriptExecutor) TestBase.driver).executeScript("scroll(0,300)");
        Thread.sleep(4000);

        //Item Selected
        WebElement Selected_Product = TestBase.byXpath("Item_Selected");
        System.out.println("Item Selected");
        if(Selected_Product.isDisplayed()){
            Selected_Product.click();
            SoftAssert softAssertion2= new SoftAssert();
            System.out.println("Selected_Product Click");
            softAssertion2.assertTrue(false);
            System.out.println("Selected_Product_softAssert_Method_Was_Executed");
            Thread.sleep(5000);



            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.navigate().to(TestBase.getxpath("URLNEW"));
            System.out.println("URLNEW");
            Thread.sleep(2000);
            driver.switchTo().window(tabs2.get(1));
            driver.close();
            driver.switchTo().window(tabs2.get(2));
            driver.close();
            Thread.sleep(2000);
            driver.switchTo().window(tabs2.get(0));
            System.out.println("window(tabs2.get(0))");
            driver.navigate().refresh();
            Thread.sleep(3000);
        }else {
            System.out.println("Selected_Product not click");
            SoftAssert softAssertion2= new SoftAssert();
            System.out.println("Selected_Product not click");
            softAssertion2.assertTrue(true);
            System.out.println("softAssert Method Was Executed");
        }

            //Add to the chart item
            WebElement Add_Chart = TestBase.byXpath("Add_to_the_chart");
            if (Add_Chart.isDisplayed()){
                Thread.sleep(3000);
                Add_Chart.click();
                SoftAssert softAssertion3= new SoftAssert();
                System.out.println("Add to the chart item Working");
                softAssertion3.assertTrue(false);
                System.out.println("softAssert Method Was Executed");
            }else {
                System.out.println("Add to the chart item not Working");
                SoftAssert softAssertion3= new SoftAssert();
                System.out.println("Add to the chart item not Working");
                softAssertion3.assertTrue(true);
                System.out.println("softAssert Method Was Executed");
            }
            Thread.sleep(5000);
            // Chart Tab Click
            WebElement Chart =TestBase.byXpath("Chart_Xpath");
            if(Chart.isDisplayed()){
                Chart.click();
                Thread.sleep(3000);
                SoftAssert softAssertion4= new SoftAssert();
                System.out.println("Chart Tab Click");
                softAssertion4.assertTrue(false);
                System.out.println("softAssert Method Was Executed");
                driver.navigate().refresh();
                Thread.sleep(5000);
            }else {
                System.out.println("Chart Tab not Click");
                SoftAssert softAssertion4= new SoftAssert();
                System.out.println("Chart Tab not working");
                softAssertion4.assertTrue(true);
                System.out.println("softAssert Method Was Executed");
            }

            // Second Item Search
            WebElement Search_1 = TestBase.byXpath("Search_Xpath");
            if(Search_1.isDisplayed()){
               Thread.sleep(2000);
                Search_1.clear();
                Thread.sleep(5000);
                Search_1.sendKeys(TestData.getProperty("Mobile_name_1"));
                SoftAssert softAssertion5= new SoftAssert();
                System.out.println("Second Item Search");
                softAssertion5.assertTrue(false);
                System.out.println("softAssert Method Was Executed");
                Thread.sleep(3000);
                driver.navigate().refresh();
                Thread.sleep(5000);
            }else {
                System.out.println("Second Item not Search");
                SoftAssert softAssertion5= new SoftAssert();
                System.out.println("Second Item not Search");
                softAssertion5.assertTrue(true);
                System.out.println("softAssert Method Was Executed");
            }
                //Second Time Enter Button Click
                WebElement Enter_Searchbox_1 = TestBase.byXpath("Enter_Button");
                if(Enter_Searchbox_1.isDisplayed()){
                Enter_Searchbox_1.click();
                Thread.sleep(5000);
                SoftAssert softAssertion6= new SoftAssert();
                System.out.println("Enter Button Click Second time");
                softAssertion6.assertTrue(false);
                System.out.println("softAssert Method Was Executed");
        }
        else {
                System.out.println("Enter_Search button not Working Second time");
                SoftAssert softAssertion6= new SoftAssert();
                System.out.println("Enter Button not Click Second time");
                softAssertion6.assertTrue(true);
                System.out.println("softAssert Method Was Executed");
        }
                Thread.sleep(5000);

                ((JavascriptExecutor) TestBase.driver).executeScript("scroll(300,800)");
                Thread.sleep(5000);
                System.out.println("Scroll");


            driver.quit();
            }
        }

