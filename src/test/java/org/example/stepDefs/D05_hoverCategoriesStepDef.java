package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class D05_hoverCategoriesStepDef {
   P03_homePage login = new P03_homePage();
    String subCategoryTxt;

    @When("user hover to Computers category")
    public void user_hover_to_computers_category() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(login.computersCategory()).perform();
        Thread.sleep(3000);

    }
    @And("user selects Desktop subcategory")
    public void user_selects_desktop_subcategory() {
        subCategoryTxt = login.DesktopsSubCategory().getText().toLowerCase().trim();
        login.DesktopsSubCategory().click();
    }
    @Then("^user should be navigate to subcategory page \"(.*)\"$")
    public void sub_Category_Page(String url){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        String subTitle = login.DesktopSubTitle().getText().toLowerCase().trim();
        Assert.assertTrue(subTitle.contains(subCategoryTxt));
    }
}
