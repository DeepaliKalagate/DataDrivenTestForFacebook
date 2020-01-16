
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Created Properties for test Facebook login page.
 *  @since   15-01-2020
 *
 ******************************************************************************/
package com.bridgelabz.scripts;

import com.bridgelabz.base.BaseTest;
import com.bridgelabz.pompages.LoginPage;
import com.bridgelabz.properties.Library;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class FacebookTest extends BaseTest
{
    @DataProvider(name = "testData")
    public Object[][] getData()
    {
        Library config = new Library(EXCELPATH);
        int rows = config.getrowcount(0);
        Object[][] credentials = new Object[rows][2];

        for(int i = 0; i < rows; ++i)
        {
            credentials[i][0] = config.getData(0, i, 0);
            credentials[i][1] = config.getData(0, i, 1);
        }
        return credentials;
    }

    @Test(dataProvider = "testData")
    public void loginPageTest(String userName,String password)
    {
        LoginPage loginPage=new LoginPage(driver);
        try
        {
            loginPage.setUsername(userName);
            loginPage.setPassword(password);
            loginPage.clickLogin();
            loginPage.takeScreenshotAtEndOfTest();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
