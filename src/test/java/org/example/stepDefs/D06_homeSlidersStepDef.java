package org.example.stepDefs;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class D06_homeSlidersStepDef {

    P03_homePage login = new P03_homePage();

    @When("^user choose the item in slider \"(.*)\"$")
    public void Choose_Items(int slider)
    {
        login.slider_Screens().get(slider).click();
    }
    @Then("^user redirected to the item page \"(.*)\"$")
    public void Navigate_Item_Page(String url)
    {
        Assert.assertEquals(url,Hooks.driver.getCurrentUrl());
    }
}



