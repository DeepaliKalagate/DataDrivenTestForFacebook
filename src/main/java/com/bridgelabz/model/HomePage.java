package com.bridgelabz.model;

import com.bridgelabz.driver.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

    @Test
    public class HomePage extends Browser
    {
        //plus-div
        @FindBy(xpath="//div[@id='js_19']")
        private WebElement clickAdd;

        @FindBy(xpath="//input[@id='js_2kd']")
        private WebElement addSTORY;

        @FindBy(xpath="//span[contains(text(),'Post')]")
        private WebElement postButton;

        //constructor
        public HomePage(WebDriver driver)
        {
            //Initialization
            PageFactory.initElements(driver, this);
        }

        //Utilization
        public void clickAddbtn()
        {
            clickAdd.click();
        }

        public void clickAddStory()
        {
            addSTORY.click();
        }

        public void clickPost()
        {
            postButton.click();
        }
}
