
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Test for Facebook registration page.
 *  @since   18-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.scripts;

import com.bridgelabz.driver.Browser;
import com.bridgelabz.model.RegisterPage;
import org.testng.annotations.Test;

public class RegisterPageTest extends Browser
{
    @Test
    public void registerOnFacebook()
    {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setFirstName("Rajani");
        registerPage.setLastName("Patil");
        registerPage.setEmailOrMobileNo("rajani.patil@gmail.com");
        registerPage.setReEnterEmailOrMobileNo("rajani.patil@gmail.com");
        registerPage.setPassword("rajani@123");
        registerPage.setDay("2");
        registerPage.setMonth("May");
        registerPage.setYear("1994");
        registerPage.setGenderFemale();
        registerPage.clickSingUpButton();
    }
}
