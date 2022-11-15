package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class D02_loginStepDef {
    P02_login login = new P02_login();

    @Given("^user open browser")
    public void user_open_browser() {

    }

    @And("^user navigates to login page")
    public void user_navigates_to_login_page() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    // first scenario :-
    @When("^user login \"(.*)\" and \"(.*)\"$")
    public void user_enter_valid_data(String Email, String password) {
        login.loginSteps(Email, password);

    }

    @And("user press on login button")
    public void LoginButton() throws InterruptedException {
        login.LoginButton();
    }

    @Then("user login to the system successfully")
    public void user_could_Login_successfully() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(!Hooks.driver.findElements(By.className("ico-account")).isEmpty(), true);
        Assert.assertEquals(login.validatePageURL(Hooks.driver, "https://demo.nopcommerce.com/"), true);
    }


    // second scenario :-
    @Then("user could not login to the system")
    public void user_could_not_Login_successfully() throws InterruptedException {
        Thread.sleep(2000);
        WebElement message=Hooks.driver.findElement(By.className("message-error"));
        String expectedResult ="Login was unsuccessful";
        String actualResult = message.getText();
        System.out.println("actualResult"+actualResult);
        Assert.assertEquals(actualResult.contains(expectedResult) , true);
        String expectedColor = "rgba(228, 67, 75, 1)";
        String actualColor = message.getCssValue("color");
        Assert.assertEquals(actualColor.contains(expectedColor) , true);
    }
}

