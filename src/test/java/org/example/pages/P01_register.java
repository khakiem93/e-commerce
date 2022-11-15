package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class P01_register {
    WebDriver driver;
    public P01_register() {
        this.driver = Hooks.driver;
        PageFactory.initElements(driver, this);

    }
    public WebElement GenderPom(String gender){
        By Gender;
        if(gender.equals("male")) {
            Gender = By.id("gender-male");
        }
        else{
            Gender = By.id("gender-female");
        }
        WebElement genderEle = driver.findElement(Gender);
        return genderEle;
    }

    public WebElement FirstNamePom() {
        By FirstName = By.id("FirstName");
        WebElement firstnameEle = driver.findElement(FirstName);
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement LastNamePom() {
        By LastNamePom = By.id("LastName");
        WebElement lastnameEle = driver.findElement(LastNamePom);
        return driver.findElement(By.id("LastName"));
    }

    public WebElement EmailPom() {
        By Email = By.id("Email");
        WebElement emailEle = driver.findElement(Email);
        return driver.findElement(By.id("Email"));
    }

    public WebElement PasswordPom() {
        By Password = By.id("Password");
        WebElement passwordEle = driver.findElement(Password);
        return driver.findElement(By.id("Password"));
    }

    public WebElement ConfirmPasswordPom() {
        By ConfirmPassword = By.id("ConfirmPassword");
        WebElement confirmPasswordEle = driver.findElement(ConfirmPassword);
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement ClickREGISTERPom(){
        By RegisterButton = By.id("register-button");
        WebElement ClickREGISTERPEle = driver.findElement(RegisterButton);
        return ClickREGISTERPEle;
    }

    public void RegisterButton(){
        ClickREGISTERPom().click();
    }
    public void loginSteps(String firstname, String lastname) {
//
        //ENTER username by pom
        FirstNamePom().clear();
        FirstNamePom().sendKeys(firstname);
        //ENTER lastname by pom
        LastNamePom().sendKeys(lastname);
    }

    public void EnterEmail(String email) {
        EmailPom().sendKeys(email);

    }
    public void EnterPassword(String password) {
        PasswordPom().sendKeys(password);

    }
    public void ConfirmPassword(String ConfirmPassword) {
        ConfirmPasswordPom().sendKeys(ConfirmPassword);

    }
    public void EnterGender(String gender) {
        GenderPom(gender).click();
    }
    public void EnterBirthdate(String Day, String Month, String Year){
        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.selectByVisibleText(Day);
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByVisibleText(Month);
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByVisibleText(Year);
    }

}

