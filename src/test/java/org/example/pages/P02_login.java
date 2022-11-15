package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class P02_login {
    WebDriver driver ;
    public P02_login()
    {
        this.driver = Hooks.driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement EmailPom() {
        By email = By.id("Email");
        WebElement emailEle = driver.findElement(email);
        return emailEle;
    }
    public WebElement PassWordPom() {
        By password= By.id("Password");
        WebElement passWordEle = driver.findElement(password);
        return passWordEle;
    }
    public  WebElement ClickLoginPom(){
        By LoginButton = By.className("login-button");
        WebElement ClickLoginPEle = driver.findElement(LoginButton);
        return ClickLoginPEle;
    }
    public void loginSteps(String email, String password) {
//
        //ENTER username by pom
        EmailPom().clear();
        EmailPom().sendKeys(email);
        //ENTER lastname by pom
        PassWordPom().sendKeys(password);
    }

    public void LoginButton(){
        ClickLoginPom().click();
           }
    public static boolean  validatePageURL(WebDriver driver, String expectedURL) {
        boolean result = false;
        System.out.println(driver.getCurrentUrl());
        if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
        {
            result = true;
        }
        return result;
    }
}
