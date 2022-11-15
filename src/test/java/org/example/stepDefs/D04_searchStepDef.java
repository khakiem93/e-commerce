package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class D04_searchStepDef {
    P03_homePage login = new P03_homePage();

    @Given("^user navigates to home page")
    public void user_navigates_to_home_page() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user click on search")
    public void Click_Search() {
        login.searchFieldPOm().click();
    }

    @And("^user enter search value \"(.*)\"")
    public void ItemName(String itemName) {
        login.searchFieldPOm().sendKeys(itemName);
    }

    @And("user click on search button")
    public void click_Search_Button() throws InterruptedException {
        login.searchButtonPom().click();
        Thread.sleep(4000);
    }

    @Then("^url contains search url")
    public void url_contains_search_url() {
        Assert.assertEquals(login.validatePageURL("https://demo.nopcommerce.com/search?q="), true);
    }

    @And("^search shows relevant results \"(.*)\"")
    public void search_shows_relevant_results(String itemName) {
        for (int x = 0; x < login.searchResultItems().size(); x++) {
            String txt = login.searchResultItems().get(x).getText().toLowerCase();
            Assert.assertEquals(txt.contains(itemName), true);
        }


    }

}
