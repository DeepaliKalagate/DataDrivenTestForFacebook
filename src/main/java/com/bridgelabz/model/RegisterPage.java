
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Test for Facebook Register page.
 *  @since   18-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.model;
import com.bridgelabz.driver.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Browser
{
    @FindBy(name = "firstname")
    WebElement firstName;

    @FindBy(name = "lastname")
    WebElement lastName;

    @FindBy(id = "u_0_r")
    WebElement email;

    @FindBy(id = "u_0_w")
    WebElement password;

    @FindBy(name = "reg_email_confirmation__")
    WebElement reEnterEmailOrMobileNo;

    @FindBy(xpath = "//select[@id='day']")
    WebElement date;

    @FindBy(xpath = "//select[@id='month']")
    WebElement monthName;

    @FindBy(xpath = "//select[@id='year']")
    WebElement year;

    @FindBy(xpath = "//input[@value='1']")
    WebElement female;

    @FindBy(xpath ="//input[@value='2']")
    WebElement male;

    @FindBy(xpath = "//input[@value='-1']")
    WebElement custom;

    @FindBy(name="websubmit")
    WebElement singUpButton;

    public RegisterPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setFirstName(String name)
    {
        firstName.sendKeys(name);
    }

    public void setLastName(String lastName)
    {
        this.lastName.sendKeys(lastName);
    }

    public void setEmailOrMobileNo(String value)
    {
        email.sendKeys(value);
    }

    public void setReEnterEmailOrMobileNo(String value)
    {
        reEnterEmailOrMobileNo.sendKeys(value);
    }

    public void setPassword(String passwordValue)
    {
        password.sendKeys(passwordValue);
    }

    public void setDay(String day)
    {
        Select select = new Select(date);
        select.selectByVisibleText(day);
    }

    public void clickSingUpButton()
    {
        singUpButton.click();
    }

    public void setMonth(String month)
    {
        Select select = new Select(monthName);
        select.selectByVisibleText(month);
    }

    public void setYear(String yearValue)
    {
        Select select = new Select(year);
        select.selectByVisibleText(yearValue);
    }

    public void setGenderFemale()
    {
        female.click();
    }

    public void setGenderMale()
    {
        male.click();
    }

    public void setCustom()
    {
        custom.click();
    }
}
