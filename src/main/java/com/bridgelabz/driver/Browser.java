
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *  Purpose: for set system property, Initializing the browser and launch the
 *
 *  @since   15-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.driver;
import com.bridgelabz.constantpaths.IConstants;
import com.bridgelabz.property.Library;
import com.bridgelabz.listener.ListenerClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Browser implements IConstants
{
    String methodName=null;
    public static WebDriver driver = null;
    ListenerClass eventListener;
    ChromeOptions options = new ChromeOptions();

    // for launching the browser
    @BeforeMethod(description = "load driver for test")
    public void setUp(Method method)
    {
        methodName=method.getName();
        options.addArguments("--disable-notifications");
        System.setProperty(CHROMEKEY,CHROMEVALUE);
        driver = new ChromeDriver(options);
        String url = Library.getProperty(CONFIGPATH, "URL");
        eventListener=new ListenerClass();
        driver.get(url);
    }

    /**
     * for take the screenshot
     */
    public void screenshot() throws IOException
    {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String fileName =  new SimpleDateFormat("yyyy/MM/dd-hh:mm:ss'.png'").format(new Date());
        File destinationFile = new File("Screenshots.png"+fileName);
        FileUtils.copyFile(sourceFile, destinationFile);
    }

    @AfterMethod(description = "close driver after test")
    public void tearDown()
    {
        driver.close();
    }
}

