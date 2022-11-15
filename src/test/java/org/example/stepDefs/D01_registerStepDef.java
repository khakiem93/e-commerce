package org.example.stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class D01_registerStepDef {
    P01_register login = new P01_register();


    @Given("user go to register page")
    public void user_navigates_to_login_page() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @When("^user select gender type \"(.*)\"")
    public void select_gender_type(String gender) {
        login.EnterGender(gender);
    }

    @And("^user enter \"(.*)\" and \"(.*)\"$")
    public void void_data(String firstname, String lastname) {
        login.loginSteps(firstname, lastname);
    }

    @And("^user enter date of birth \"(.*)\" and \"(.*)\" and \"(.*)\"")
    public void Enter_Birthdate(String day, String month, String year) {
        login.EnterBirthdate(day, month, year);

    }

    @And("^user enter email \"(.*)\"")
    public void Enter_Email(String email) {
        login.EnterEmail(email);

    }

    @And("^user enter passWord \"(.*)\"")
    public void Enter_PassWord(String passWord) {
        login.EnterPassword(passWord);

    }

    @And("^confirm password \"(.*)\"")
    public void confirmPassword(String Password) {
        login.ConfirmPassword(Password);
    }
    @And("^user clicks on register button")
    public void RegisterButton(){
        login.RegisterButton();
    }
    @Then("^user get  success message")
    public void user_could_Register_successfully() throws InterruptedException {
        Thread.sleep(2000);
        WebElement message=Hooks.driver.findElement(By.className("result"));
        String expectedResult ="Your registration completed";
        String actualResult = message.getText();
        System.out.println("actualResult"+actualResult);
        Assert.assertEquals(actualResult.contains(expectedResult) , true);
        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualColor = message.getCssValue("color");
        Assert.assertEquals(actualColor.contains(expectedColor) , true);
    }

}

