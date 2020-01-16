package com.bridgelabz.pompages;

import com.bridgelabz.base.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

    @Test
    public class HomePage extends BaseTest
    {
        //plus-div
        @FindBy(xpath="//div[@id='js_19']")
        private WebElement ClickAdd;

        @FindBy(xpath="//input[@id='js_2kd']")
        private WebElement AddSTORY;

        @FindBy(xpath="//span[contains(text(),'Post')]")
        private WebElement Postbtn;

        //constructor
        public HomePage(WebDriver driver)
        {
            //Initialization
            PageFactory.initElements(driver, this);
        }

        //Utilization
        public void ClickAddbtn()
        {
            ClickAdd.click();
        }

        public void ClickAddStory()
        {
            AddSTORY.click();
        }

        public void ClickPost()
        {
            Postbtn.click();
        }
}
