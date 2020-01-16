
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *  Purpose: for set system property, Initializing the browser and launch the
 *
 *  @since   15-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.base;
import com.bridgelabz.constantpaths.IAutoConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest implements IAutoConstant
{
    String methodName=null;
    public static WebDriver driver = null;
    ChromeOptions options = new ChromeOptions();

    // for launching the browser
    @BeforeMethod(description = "load driver for test")
    public void setUp(Method method)
    {
        methodName=method.getName();
        options.addArguments("--disable-notifications");
        System.setProperty(CHROMEKEY,CHROMEVALUE);
        driver = new ChromeDriver(options);
        driver.get(CONFIGPATH);
    }

    @AfterMethod(description = "close driver after test")
    public void tearDown()
    {
        driver.close();
    }
}

