package com.TestCase.Dashboard_Testdata;

import com.PageObject.DashBoardPage.DashBoard;
import org.testng.annotations.Test;



@Test(priority = 3)
public class Dashboard {
    public static DashBoard dashBoard = new DashBoard();

    @Test(priority = 4)
    public void Search()throws Exception{
        dashBoard.dashboard();
    }
}
