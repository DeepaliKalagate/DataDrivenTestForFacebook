
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Test for Facebook Home page n Post a Text on Facebook.
 *  @since   15-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.scripts;

import com.bridgelabz.controller.DataDriven;
import com.bridgelabz.driver.Browser;
import com.bridgelabz.model.HomePage;
import com.bridgelabz.model.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageTest extends Browser
{
    @DataProvider(name = "testData")
    public Object[][] getData()
    {
        DataDriven config = new DataDriven(EXCELPATH);
        int rows = config.getrowcount(0);

        Object[][] credentials = new Object[rows][2];

        for (int i = 0; i < rows; ++i)
        {
            for (int j=0;j<2;j++){
                credentials[i][0] = config.getData(0, i, 0);
                credentials[i][1] = config.getData(0, i, 1);
            } }
        return credentials;
    }

    @Test(dataProvider = "testData")
    public void loginPageTest(String userName,String password) throws InterruptedException
    {
        LoginPage loginPage=new LoginPage(driver);
        HomePage homePage=new HomePage(driver);

        loginPage.setUsername(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();

        homePage.clickCreatePostButton();
        homePage.clickAddStory();
        homePage.clickPost();
        Thread.sleep(500);
        homePage.dragDown();
        Thread.sleep(500);
        homePage.clickOnLogoutButton();
    }
}
