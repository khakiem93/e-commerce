package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class D03_currenciesStepDef {
    P03_homePage login = new P03_homePage();

    @Given("user go to home page")
    public void user_navigates_to_login_page() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("^user select Currency \"(.*)\" from list")
    public void user_select_currency_from_list(String Currency) {
        Select select = new Select(login.CurrencyPom());
        select.selectByVisibleText(Currency);
    }


    @Then("^prices of items will be in \"(.*)\"")
    public void prices_of_items_will_be_in_euro(String sign) {
        for (int x = 0; x < login.ProductPricePom().size(); x++) {
            String txt = login.ProductPricePom().get(x).getText();
            Assert.assertEquals(txt.contains(sign),true);
        }
    }


}
