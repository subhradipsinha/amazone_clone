package com.TestCase.Login;

import com.PageObject.LoginPage.Login;
import org.testng.annotations.Test;

@Test(priority = 1)
public class Login_Page {
    public static Login login = new Login();

    @Test(priority = 2)
    public void Url_Hit() throws Exception {
        login.init();
        login.Mouse_Hover();
        login.softassert();
        login.Email();
        login.Password();
    }
}